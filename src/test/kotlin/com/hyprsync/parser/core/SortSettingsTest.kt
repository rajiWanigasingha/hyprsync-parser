package com.hyprsync.parser.core

import com.hyprsync.parser.core.filterTypes.FilterTypeSettings
import com.hyprsync.parser.core.genMetaData.GenerateMetaData
import com.hyprsync.parser.core.sortSettings.SortSettings
import com.hyprsync.parser.models.*
import com.hyprsync.parser.repo.filteredSettings.FilteredSettingsRepo
import com.hyprsync.parser.repo.metaData.MetaDataRepo
import com.hyprsync.parser.repo.sortSettings.*
import com.hyprsync.parser.repo.sortSettings.BindsRepo
import com.hyprsync.parser.repo.sortSettings.EnvironmentRepo
import com.hyprsync.parser.repo.sortSettings.ExecuteRepo
import com.hyprsync.parser.repo.sortSettings.MonitorRepo
import io.github.oshai.kotlinlogging.KotlinLogging
import org.junit.jupiter.api.Test
import java.nio.file.Path

class SortSettingsTest {

    init {
        FilterTypeSettings().processSettings(Path.of("${System.getProperty("user.home")}/.config/hypr/hyprland.conf"))
    }

    private val logger = KotlinLogging.logger(javaClass.name)

    private val metaDataRepo = MetaDataRepo()

    private val filterTypeSettingsRepo = FilteredSettingsRepo()

    @Test
    fun `sort key value settings`() {

        val keyValue = filterTypeSettingsRepo.getKeyValues()

        GenerateMetaData(metaDataRepo)
            .genForKeyValuePair(keyValue)


        val sortSettings = SortSettings(metaDataRepo)

        sortSettings.sortKeyValue()

        ExecuteRepo().cashExecuteSettings().forEach { executeModel: ExecuteModel -> logger.info { executeModel }  }

        EnvironmentRepo().cashEnvSettings().forEach { environmentModel: EnvironmentModel -> logger.info { environmentModel } }

        MonitorRepo().cashMonitorSettings().forEach { monitorModel: MonitorModel -> logger.info { monitorModel }  }

        BindsRepo().cashBindSettings().forEach { bindsModel: BindsModel -> logger.info { bindsModel } }

        WorkspaceRepo().cashWorkspaceSettings().forEach { workspaceModel: WorkspaceModel -> logger.info { workspaceModel } }

        WindowRuleRepo().cashWindowSettings().forEach { windowRuleModel: WindowRuleModel -> logger.info { windowRuleModel } }

        VariableRepo().cashVariableSettings().forEach { variableModel: VariableModel -> logger.info { variableModel } }

    }


    @Test
    fun `sort hyprland value settings`() {

        val hyprlang = filterTypeSettingsRepo.getHyprland()

        GenerateMetaData(metaDataRepo)
            .genForHyprlang(hyprlang)

        SortSettings(metaDataRepo)
            .sortHyprlandValue()

    }

}