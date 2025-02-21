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

/**
 * ###### [CreateCashStructured] Core Api
 *
 * This uses to create and cache all processed settings into .cache.
 *
 * Methods
 * 1. [createMonitorCacheSettings]
 * 2. [createBindsCacheSettings]
 * 3. [createWindowCacheSettings]
 * 4. [createWorkspaceCacheSettings]
 * 5. [createEnvironmentCacheSettings]
 * 6. [createAutoStartCacheSettings]
 * 7. [createVariableCacheSettings]
 * 8. [createHyprlangCacheSettings]
 *
 */
internal class CreateCashStructured {

    /**
     * Use to create folders in .cache
     */
    private companion object CreateFolderStructure {

        private val logger = KotlinLogging.logger("CreateFolderStructure")

        /**
         * Path to home of user
         */
        private val systemHome = System.getProperty("user.home")

        /**
         * Folder that caches all settings
         */
        private val FOLDER_NAME = "$systemHome/.cache/com.hyprsync.conf"

        /**
         * All settings folder caches.
         */
        private val SETTINGS_FOLDERS = listOf(
            "keyboard/keyboard.json",
            "environment/environment.json",
            "monitor/monitor.json",
            "autostart/autostart.json",
            "workspace/workspace.json",
            "windowRule/windowrule.json",
            "variables/variable.json",
            "hyprlang/input/input.json",
            "hyprlang/input/touchpad.json",
            "hyprlang/gestures/gestures.json",
            "hyprlang/misc/misc.json",
            "hyprlang/general/general.json",
            "hyprlang/decoration/decoration.json",
            "hyprlang/decoration/blur.json",
            "hyprlang/decoration/shadow.json",
            "hyprlang/dwindle/dwindle.json",
            "hyprlang/binds/binds.json",
            "hyprlang/animations/animations.json"
        )

        init {

            Path.of(FOLDER_NAME)
                .exists()
                .takeIf { !it }
                ?.let {
                    Path.of(FOLDER_NAME).createDirectory()
                    Path.of("$FOLDER_NAME/hyprlang").createDirectory()
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

    /**
     * Repository for executing system commands and handling execution settings.
     */
    private val executeRepo = ExecuteRepo()

    /**
     * Repository for managing environment variables and system configurations.
     */
    private val environmentRepo = EnvironmentRepo()

    /**
     * Repository for handling key bindings and shortcut configurations.
     */
    private val bindsRepo = BindsRepo()

    /**
     * Repository for managing user-defined variables within Hyprland configurations.
     */
    private val variableRepo = VariableRepo()

    /**
     * Repository for workspace-related configurations and management.
     */
    private val workspaceRepo = WorkspaceRepo()

    /**
     * Repository for defining and managing window rules in Hyprland.
     */
    private val windowRuleRepo = WindowRuleRepo()

    /**
     * Repository for monitor configurations, including resolution, refresh rates, and positioning.
     */
    private val monitorRepo = MonitorRepo()

    /**
     * Repository for hyprlang settings
     */
    private val hyprlangRepo = HyprlangRepo()

    /**
     * System user's home directory path.
     */
    private val systemHome = System.getProperty("user.home")

    /**
     * Path to the configuration cache folder for HyprSync.
     */
    private val folderName = "$systemHome/.cache/com.hyprsync.conf"


    /**
     * This uses to cache `Execute settings`
     */
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

    /**
     * This uses to cache `Env settings`
     */
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

    /**
     * This uses to cache `Binds settings`
     */
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

    /**
     * This uses to cache `Variable settings`
     */
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

    /**
     * This uses to cache `Workspace settings`
     */
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

    /**
     * This uses to cache `Window settings`
     */
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

    /**
     * This uses to cache `Monitor settings`
     */
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

    /**
     * This uses to cache `Hyprlang settings`
     */
    fun createHyprlangCacheSettings() {
        hyprlangRepo
            .cacheHyprlangSettings()
            .forEach { hyprlangValuesModel: HyprlangValuesModel ->
                val storeName = hyprlangValuesModel.masterKeyword.split('.')

                val path = Path.of("$folderName/hyprlang/${storeName[0]}/${storeName.last()}.json")

                val writeLineHyprlang = hyprlangValuesModel
                    .hyprlandSettings
                    .map { hyprlandSettings: HyprlandSettings -> Json.encodeToString(hyprlandSettings)  }

                path
                    .writeLines(
                        lines = writeLineHyprlang
                    )
            }

    }
}