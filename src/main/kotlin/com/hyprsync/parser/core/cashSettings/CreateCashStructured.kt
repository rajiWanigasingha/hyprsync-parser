package com.hyprsync.parser.core.cashSettings

import com.hyprsync.parser.models.*
import com.hyprsync.parser.repo.sortSettings.*
import com.hyprsync.parser.repo.sortSettings.BindsRepo
import com.hyprsync.parser.repo.sortSettings.EnvironmentRepo
import com.hyprsync.parser.repo.sortSettings.ExecuteRepo
import com.hyprsync.parser.repo.sortSettings.VariableRepo
import io.github.oshai.kotlinlogging.KotlinLogging
import kotlinx.serialization.json.Json
import java.nio.file.Path
import kotlin.io.path.createDirectory
import kotlin.io.path.createFile
import kotlin.io.path.exists
import kotlin.io.path.writeLines

internal class CreateCashStructured {

    private companion object CreateFolderStructure {

        private val logger = KotlinLogging.logger("CreateFolderStructure")

        private val systemHome = System.getProperty("user.home")

        private val FOLDER_NAME = "$systemHome/.cache/com.hyprsync.conf"

        private val SETTINGS_FOLDERS = listOf(
            "keyboard/keyboard.json",
            "environment/environment.json",
            "monitor/monitor.json",
            "autostart/autostart.json",
            "workspace/workspace.json",
            "windowRule/windowrule.json",
            "variables/variable.json"
        )

        init {

            Path.of(FOLDER_NAME)
                .exists()
                .takeIf { !it }
                ?.let {
                    Path.of(FOLDER_NAME).createDirectory()
                }

            SETTINGS_FOLDERS.forEach { paths: String ->

                val folderPath = Path.of("$FOLDER_NAME/$paths")

                val parentDir = folderPath.parent

                parentDir
                    .exists()
                    .takeIf { !it }
                    ?.let {
                        parentDir.createDirectory()
                    }

                folderPath
                    .exists()
                    .takeIf { !it }
                    ?.let {
                        folderPath.createFile()
                    }
            }

        }

    }

    private val logger = KotlinLogging.logger(javaClass.name)

    private val executeRepo = ExecuteRepo()

    private val environmentRepo = EnvironmentRepo()

    private val bindsRepo = BindsRepo()

    private val variableRepo = VariableRepo()

    private val workspaceRepo = WorkspaceRepo()

    private val windowRuleRepo = WindowRuleRepo()

    private val monitorRepo = MonitorRepo()

    private val systemHome = System.getProperty("user.home")

    private val folderName = "$systemHome/.cache/com.hyprsync.conf"

    fun createAutoStartCacheSettings() {
        val path = Path.of("$folderName/autostart/autostart.json")

        val writeLinesAutoStart = executeRepo
            .cashExecuteSettings()
            .map { executeModel: ExecuteModel ->  Json.encodeToString(executeModel)  }

        path
            .writeLines(
                lines = writeLinesAutoStart
            )
    }

    fun createEnvironmentCacheSettings() {
        val path = Path.of("$folderName/environment/environment.json")

        val writeLineEnv = environmentRepo
            .cashEnvSettings()
            .map { environmentModel: EnvironmentModel -> Json.encodeToString(environmentModel) }

        path
            .writeLines(
                lines = writeLineEnv
            )
    }

    fun createBindsCacheSettings() {
        val path = Path.of("$folderName/keyboard/keyboard.json")

        val writeLineBinds = bindsRepo
            .cashBindSettings()
            .map { bindsModel: BindsModel -> Json.encodeToString(bindsModel) }


        path
            .writeLines(
                lines = writeLineBinds
            )
    }

    fun createVariableCacheSettings() {
        val path = Path.of("$folderName/variables/variable.json")

        val writeLineVariables = variableRepo
            .cashVariableSettings()
            .map { variableModel: VariableModel -> Json.encodeToString(variableModel) }

        path
            .writeLines(
                lines = writeLineVariables
            )
    }

    fun createWorkspaceCacheSettings() {
        val path = Path.of("$folderName/workspace/workspace.json")

        val writeLineWorkspace = workspaceRepo
            .cashWorkspaceSettings()
            .map { workspaceModel: WorkspaceModel -> Json.encodeToString(workspaceModel) }

        path
            .writeLines(
                lines = writeLineWorkspace
            )
    }

    fun createWindowCacheSettings() {
        val path = Path.of("$folderName/windowRule/windowrule.json")

        val writeLineWindow = windowRuleRepo
            .cashWindowSettings()
            .map { windowRuleModel: WindowRuleModel -> Json.encodeToString(windowRuleModel) }

        path
            .writeLines(
                lines = writeLineWindow
            )
    }

    fun createMonitorCacheSettings() {
        val path = Path.of("$folderName/monitor/monitor.json")

        val writeLineMonitor = monitorRepo
            .cashMonitorSettings()
            .map { monitorModel: MonitorModel -> Json.encodeToString(monitorModel) }

        path
            .writeLines(
                lines = writeLineMonitor
            )
    }
}