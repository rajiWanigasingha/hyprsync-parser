package com.hyprsync.parser.core.filterTypes

import com.hyprsync.parser.models.SettingsTypeModel
import com.hyprsync.parser.repo.filteredSettings.FilteredSettingsRepo
import com.hyprsync.parser.utils.exceptions.FilterSettingsStoreException
import com.hyprsync.parser.utils.extensions.processLineExtension.checkForEqual
import com.hyprsync.parser.utils.extensions.processLineExtension.checkForHyprlang
import com.hyprsync.parser.utils.extensions.processLineExtension.getKeyOfHyprlang
import com.hyprsync.parser.utils.extensions.processLineExtension.processLine
import com.hyprsync.parser.utils.extensions.validatePathExtension.validatePath
import io.github.oshai.kotlinlogging.KotlinLogging
import java.nio.file.Path
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

/**
 *
 * ###### [FilterTypeSettings] Core Api
 *
 * - Internal core api used for separating different types of settings
 * like ***Key Value Pairs***, ***Source Paths***, ***Hyprlang***
 *
 * This will store processed key values inside [filteredSettingsRepo], it will be stored as
 * key value pairs or hyprlang.
 *
 * Methods
 * 1. [processSettings]
 *
 */
internal class FilterTypeSettings {

    private val logger = KotlinLogging.logger(javaClass.name)

    private val filteredSettingsRepo = FilteredSettingsRepo()

    /**
     * Use to count how many code blocks are open. `code block -> {`
     */
    private var hyprlangBlockCount = 0

    /**
     * Use to check if it inside a code block. This will be `false` when [hyprlangBlockCount] is 0 else `true`.
     */
    private var isHyprlangBlock = false

    /**
     * Store hyprlang block key. Ex: input { ... } -> Key = `input`.
     */
    private val hyprLangKey = mutableSetOf<String>()

    /**
     * Store separated key value pairs.
     */
    private val keyValuePairs = mutableListOf<String>()

    /**
     * Store separated source values.
     */
    private val source = mutableSetOf<String>()

    /**
     * Store separated hyprlang settings.
     */
    private val hyprlang = mutableMapOf<String, MutableList<String>>()

    private val fromHomePath = "${System.getProperty("user.home")}/"

    /**
     *
     * This use for process what type of settings it has and stores them separately to use for generating mata data for them.
     *
     * @param path Type [Path], to get the path for hyprland.conf file. Need the full path
     *
     */
    fun processSettings(path: Path) {

        val validPath = path.validatePath()

        validPath.forEachLine { line: String ->
            line
                .processLine()
                .takeIf { it != null }
                ?.let {
                    if (isHyprlangBlock) {
                        checkForHyprlang(it)
                        return@forEachLine
                    }

                    val settings = checkForSettings(it)

                    if (settings != null) {
                        settings
                            .takeIf { settingsTypeModel: SettingsTypeModel -> settingsTypeModel == SettingsTypeModel.KEY_VALUE }
                            ?.let { keyValuePairs.add(line) }
                            ?: source.add(line)

                    } else {
                        it
                            .checkForHyprlang()
                            .takeIf { isHyprlang: Boolean -> isHyprlang }
                            ?.let { _ ->
                                isHyprlangBlock = true
                                hyprlangBlockCount++
                                hyprLangKey.add(it.getKeyOfHyprlang())
                            }
                    }
                }
        }

        if (keyValuePairs.isNotEmpty()) {
            filteredSettingsRepo
                .insertKeyValue(keyValuePairs)
                ?.takeIf { !it.success }
                ?.let { throw FilterSettingsStoreException.KeyValueStoreInsertException() }
                ?: keyValuePairs.clear()
        }

        if (hyprlang.isNotEmpty()) {
            filteredSettingsRepo
                .insertHyprlang(hyprlang)
                ?.takeIf { !it.success }
                ?.let { throw FilterSettingsStoreException.HyprlangStoreInsertException() }
                ?: hyprlang.clear()
        }

        if (source.isNotEmpty()) {
            handleSource()
        }
    }


    /**
     * This check for type of settings line. Helper function for [processLine]
     *
     * @param line Type [String]
     * @return [SettingsTypeModel] or `null` ,Null if it hyprlang settings block.
     */
    private fun checkForSettings(line: String): SettingsTypeModel? {
        line
            .checkForEqual()
            .takeIf { it != null }
            ?.let {

                val keyWord = it.split('=')[0].trim()

                if (keyWord == "source") {
                    return SettingsTypeModel.SOURCE
                } else {
                    return SettingsTypeModel.KEY_VALUE
                }

            }
            ?: return null
    }

    /**
     *
     * This check and store any settings belong to hyprlang. Helper function for [processLine]
     *
     * @param line Type [String]
     *
     */
    private fun checkForHyprlang(line: String) {

        line
            .endsWith('}')
            .takeIf { it }
            ?.let {
                hyprlangBlockCount--
                hyprLangKey.removeIf { it == hyprLangKey.last() }
                hyprlangBlockCount
                    .takeIf { 1 > it }
                    ?.let {
                        isHyprlangBlock = false
                    }

                return
            }

        line
            .checkForEqual()
            .takeIf { it != null }
            ?.let {
                hyprlang.computeIfAbsent(hyprLangKey.joinToString(".")) { mutableListOf() }.add(it.trim())
            }
            ?: line
                .checkForHyprlang()
                .takeIf { it }
                ?.let {
                    isHyprlangBlock = true
                    hyprlangBlockCount++
                    hyprLangKey.add(line.getKeyOfHyprlang())
                }
    }

    private fun handleSource() {

        val iterator = source.iterator()

        val updatedPaths = mutableSetOf<String>()

        while (iterator.hasNext()) {
            val path = iterator.next().split("=").last().trim()

            val newPath = when {
                path.startsWith("~/")  -> path.replace("~/" , fromHomePath)
                path.startsWith("./")  -> path.replace("./" , fromHomePath)
                path.startsWith("../") -> path.replace("../" , fromHomePath)
                else -> path
            }

            updatedPaths.add(newPath)
        }

        source.clear()
        source.addAll(updatedPaths)

        val firstElem = source.firstOrNull()

        source.firstOrNull()?.let { source.remove(it) }

        if (firstElem != null) {
            processSettings(Path.of(firstElem))
        }
    }
}