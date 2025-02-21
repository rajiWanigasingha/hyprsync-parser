package com.hyprsync.parser.core

import com.hyprsync.parser.core.filterTypes.FilterTypeSettings
import com.hyprsync.parser.repo.filteredSettings.FilteredSettingsRepo
import io.github.oshai.kotlinlogging.KotlinLogging
import org.junit.jupiter.api.Test
import java.nio.file.Path

class FilterTypeSettingsTest {

    private val filterTypeSettings = FilterTypeSettings()

    private val logger = KotlinLogging.logger(javaClass.name)

    private val homePath = System.getProperty("user.home")

    private val paths = listOf(
//        "$homePath/IdeaProjects/testfloder/h.conf",
        "$homePath/.config/hypr/hyprland.conf"
    )

    @Test
    fun `Test filter type settings`() {

        paths.forEach { path: String ->
            runCatching {
                filterTypeSettings.processSettings(Path.of(path))
            }.onFailure { exception: Throwable ->
                logger.warn(exception) { exception.message }
            }
        }

        FilteredSettingsRepo()
            .getKeyValues()
            .forEach { s: String ->
                logger.info { "KeyValue -> $s" }
            }

        FilteredSettingsRepo()
            .getHyprland()
            .forEach { entry ->
                logger.info { "Hyprlang -> $entry" }
            }
    }

}