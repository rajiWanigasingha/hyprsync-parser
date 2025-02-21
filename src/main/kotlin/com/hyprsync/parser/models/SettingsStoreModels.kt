package com.hyprsync.parser.models

import kotlinx.serialization.Serializable

/**
 * This uses to store processed execute key value.
 */
@Serializable
data class ExecuteModel(
    val keyword: String,
    val command: String?,
    val comment: String?
)

/**
 * This uses to store processed environment key value.
 */
@Serializable
data class EnvironmentModel(
    val keyword: String,
    val env: String?,
    val comment: String?
)

/**
 * This uses to store the default type of settings in binds.
 */
@Serializable
data class DefaultMonitorSettings(
    val name: String,
    val resolution: String,
    val position: String,
    val scale: String
)

/**
 * This uses to store extra monitor settings other that default settings type.
 */
@Serializable
data class ExtraMonitorSettings(
    val args: List<String>
)

/**
 * This uses to store error monitor settings.
 */
@Serializable
data class ErrorMonitorSettings(
    val message: String?,
    val args: List<String>
)

/**
 * This uses to store processed `monitor settings`
 */
@Serializable
data class MonitorModel(
    val keyword: String,
    val defaultMonitorSettings: DefaultMonitorSettings? = null,
    val extraMonitorSettings: ExtraMonitorSettings? = null,
    val errorMonitorSettings: ErrorMonitorSettings? = null,
    val comment: String? = null
)

/**
 * This uses store default structure of key binds.
 */
@Serializable
data class DefaultBindSettings(
    val mods: String,
    val key: String,
    val dispatcher: String,
    val params: String
)

/**
 * This uses store binds with extra args bind settings.
 */
@Serializable
data class ExtraBindSettings(
    val args: List<String>
)

/**
 * This uses store error binds.
 */
@Serializable
data class ErrorBindSettings(
    val message: String?,
    val args: List<String>
)

/**
 * This uses to process bind settings into `Bind Store`
 */
@Serializable
data class BindsModel(
    val keyword: String,
    val defaultBindSettings: DefaultBindSettings? = null,
    val extraBindSettings: ExtraBindSettings? = null,
    val errorBindSettings: ErrorBindSettings? = null,
    val comment: String? = null
)

/**
 * This uses to store processed workspace rules
 */
@Serializable
data class WorkspaceModel(
    val keyword: String,
    val workspaceName: String,
    val rules: List<String>,
    val comment: String? = null,
)

/**
 * Use to store processed window rules
 */
@Serializable
data class WindowRuleModel(
    val keyword: String,
    val window: String,
    val rules: List<String>,
    val comment: String? = null,
)

/**
 * Use to store processed Variables
 */
@Serializable
data class VariableModel(
    val keyword: String,
    val value: String,
    val comment: String? = null
)

/**
 * Uses to store process hyprlang values
 */
@Serializable
data class HyprlandSettings(
    val keyword: String,
    val result: List<String>,
    val comment: String?
)

/**
 * This use to store processed hyprlang values.
 */
@Serializable
data class HyprlangValuesModel(
    val masterKeyword: String,
    val hyprlandSettings: MutableList<HyprlandSettings> = mutableListOf()
)

