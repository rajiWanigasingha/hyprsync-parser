package com.hyprsync.parser.api

import com.hyprsync.parser.core.cashSettings.CreateCashStructured
import com.hyprsync.parser.core.filterTypes.FilterTypeSettings
import com.hyprsync.parser.core.genMetaData.GenerateMetaData
import com.hyprsync.parser.core.sortSettings.SortSettings
import com.hyprsync.parser.repo.filteredSettings.FilteredSettingsRepo
import com.hyprsync.parser.repo.metaData.MetaDataRepo
import io.github.oshai.kotlinlogging.KotlinLogging
import java.nio.file.Path

/**
 *
 * #### [ParseAndCacheSettings]
 *
 * This uses to parse and cache hyprland settings in .cache folder under
 * `/home/$USER/.cache/com.hyprsync.conf/` this folder.
 *
 * Methods,
 * 1. [create]
 *
 */
class ParseAndCacheSettings {

    private val home = System.getProperty("user.home")

    private val logger = KotlinLogging.logger(javaClass.name)

    private val metaDataRepo = MetaDataRepo()

    private val filteredSettingsRepo = FilteredSettingsRepo()

    /**
     * To create process and cache settings.
     *
     * @param hyprlandSettingsPath as Type [Path] default value `$home/.config/hypr/hyprland.conf`
     */
    fun create(
        hyprlandSettingsPath: Path = Path.of("$home/.config/hypr/hyprland.conf")
    ) {

        logger.info { "Path -> $hyprlandSettingsPath" }

        // First, separate the different type of settings.
        FilterTypeSettings().processSettings(hyprlandSettingsPath)

        // Second, generate mata data for each type of settings
        GenerateMetaData(metaDataRepo).genForKeyValuePair(filteredSettingsRepo.getKeyValues())
        GenerateMetaData(metaDataRepo).genForHyprlang(filteredSettingsRepo.getHyprland())

        // Third, sort generated mata data
        SortSettings(metaDataRepo).sortKeyValue()
        SortSettings(metaDataRepo).sortHyprlandValue()

        // Fourth, Cache all sorted settings

        // Cache monitor
        CreateCashStructured().createMonitorCacheSettings()

        // Cache binds
        CreateCashStructured().createBindsCacheSettings()

        // Cache window
        CreateCashStructured().createWindowCacheSettings()

        // Cache Workspace
        CreateCashStructured().createWorkspaceCacheSettings()

        // Cache Auto Start
        CreateCashStructured().createAutoStartCacheSettings()

        // Cache Variables
        CreateCashStructured().createVariableCacheSettings()

        // Cache Environment
        CreateCashStructured().createEnvironmentCacheSettings()

        // Cache Hyprlang
        CreateCashStructured().createHyprlangCacheSettings()

    }

}