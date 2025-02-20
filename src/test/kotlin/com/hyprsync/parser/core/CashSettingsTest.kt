package com.hyprsync.parser.core

import com.hyprsync.parser.core.cashSettings.CreateCashStructured
import com.hyprsync.parser.core.filterTypes.FilterTypeSettings
import com.hyprsync.parser.core.genMetaData.GenerateMetaData
import com.hyprsync.parser.core.sortSettings.SortSettings
import com.hyprsync.parser.repo.filteredSettings.FilteredSettingsRepo
import com.hyprsync.parser.repo.metaData.MetaDataRepo
import io.github.oshai.kotlinlogging.KotlinLogging
import java.nio.file.Path
import kotlin.test.Test

class CashSettingsTest {

    init {
        FilterTypeSettings().processSettings(Path.of("${System.getProperty("user.home")}/.config/hypr/hyprland.conf"))
    }

    private val logger = KotlinLogging.logger(javaClass.name)

    private val metaDataRepo = MetaDataRepo()

    private val filterTypeSettingsRepo = FilteredSettingsRepo()

    private val createCashStructured = CreateCashStructured()

    @Test
    fun `create folder for hyprsync cash settings`() {

        val keyValue = filterTypeSettingsRepo.getKeyValues()

        GenerateMetaData(metaDataRepo)
            .genForKeyValuePair(keyValue)


        val sortSettings = SortSettings(metaDataRepo)

        sortSettings.sortKeyValue()

        createCashStructured.createAutoStartCacheSettings()

        createCashStructured.createEnvironmentCacheSettings()

        createCashStructured.createBindsCacheSettings()

        createCashStructured.createVariableCacheSettings()

        createCashStructured.createWorkspaceCacheSettings()

        createCashStructured.createWindowCacheSettings()

        createCashStructured.createMonitorCacheSettings()
    }

}