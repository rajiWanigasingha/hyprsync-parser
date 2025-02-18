package com.hyprsync.parser.core

import com.hyprsync.parser.core.filterTypes.FilterTypeSettings
import com.hyprsync.parser.core.genMetaData.GenerateMetaData
import com.hyprsync.parser.repo.filteredSettings.FilteredSettingsRepo
import com.hyprsync.parser.repo.metaData.MetaDataRepo
import io.github.oshai.kotlinlogging.KotlinLogging
import org.junit.jupiter.api.Test
import java.nio.file.Path

class MataDataTest {

    init {
        FilterTypeSettings().processSettings(Path.of("${System.getProperty("user.home")}/.config/hypr/hyprland.conf"))
    }

    private val metaDataRepo = MetaDataRepo()

    private val filterTypeSettingsRepo = FilteredSettingsRepo()

    private val logger = KotlinLogging.logger(javaClass.name)

    private val generateMetaData = GenerateMetaData(
        metaDataRepo
    )

    @Test
    fun `Gen mata data for key value binds`() {

        val keyValuePairs = filterTypeSettingsRepo.getKeyValues()

        generateMetaData.genForKeyValuePair(keyValuePairs)

        logger.info { metaDataRepo.getAllKeyValues() }

    }

    @Test
    fun `Gen meta data for hyprlang`() {
        val hyprlang = filterTypeSettingsRepo.getHyprland()

        generateMetaData.genForHyprlang(hyprlang.toMap())

        logger.info { metaDataRepo.getAllHyprlang() }
    }

}