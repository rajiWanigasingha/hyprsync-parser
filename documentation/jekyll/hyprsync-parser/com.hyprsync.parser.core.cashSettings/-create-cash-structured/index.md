---
title: CreateCashStructured
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.core.cashSettings](../index.html)/[CreateCashStructured](index.html)



# CreateCashStructured



[jvm]\
internal class [CreateCashStructured](index.html)

###### [CreateCashStructured](index.html) Core Api



This uses to create and cache all processed settings into .cache.



Methods



1. 
   [createMonitorCacheSettings](create-monitor-cache-settings.html)
2. 
   [createBindsCacheSettings](create-binds-cache-settings.html)
3. 
   [createWindowCacheSettings](create-window-cache-settings.html)
4. 
   [createWorkspaceCacheSettings](create-workspace-cache-settings.html)
5. 
   [createEnvironmentCacheSettings](create-environment-cache-settings.html)
6. 
   [createAutoStartCacheSettings](create-auto-start-cache-settings.html)
7. 
   [createVariableCacheSettings](create-variable-cache-settings.html)
8. 
   [createHyprlangCacheSettings](create-hyprlang-cache-settings.html)



## Constructors


| | |
|---|---|
| [CreateCashStructured](-create-cash-structured.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [CreateFolderStructure](-create-folder-structure/index.html) | [jvm]<br>private object [CreateFolderStructure](-create-folder-structure/index.html)<br>Use to create folders in .cache |


## Properties


| Name | Summary |
|---|---|
| [bindsRepo](binds-repo.html) | [jvm]<br>private val [bindsRepo](binds-repo.html): [BindsRepo](../../com.hyprsync.parser.repo.sortSettings/-binds-repo/index.html)<br>Repository for handling key bindings and shortcut configurations. |
| [environmentRepo](environment-repo.html) | [jvm]<br>private val [environmentRepo](environment-repo.html): [EnvironmentRepo](../../com.hyprsync.parser.repo.sortSettings/-environment-repo/index.html)<br>Repository for managing environment variables and system configurations. |
| [executeRepo](execute-repo.html) | [jvm]<br>private val [executeRepo](execute-repo.html): [ExecuteRepo](../../com.hyprsync.parser.repo.sortSettings/-execute-repo/index.html)<br>Repository for executing system commands and handling execution settings. |
| [folderName](folder-name.html) | [jvm]<br>private val [folderName](folder-name.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)<br>Path to the configuration cache folder for HyprSync. |
| [hyprlangRepo](hyprlang-repo.html) | [jvm]<br>private val [hyprlangRepo](hyprlang-repo.html): [HyprlangRepo](../../com.hyprsync.parser.repo.sortSettings/-hyprlang-repo/index.html)<br>Repository for hyprlang settings |
| [logger](logger.html) | [jvm]<br>private val [logger](logger.html): KLogger |
| [monitorRepo](monitor-repo.html) | [jvm]<br>private val [monitorRepo](monitor-repo.html): [MonitorRepo](../../com.hyprsync.parser.repo.sortSettings/-monitor-repo/index.html)<br>Repository for monitor configurations, including resolution, refresh rates, and positioning. |
| [systemHome](system-home.html) | [jvm]<br>private val [systemHome](system-home.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)<br>System user's home directory path. |
| [variableRepo](variable-repo.html) | [jvm]<br>private val [variableRepo](variable-repo.html): [VariableRepo](../../com.hyprsync.parser.repo.sortSettings/-variable-repo/index.html)<br>Repository for managing user-defined variables within Hyprland configurations. |
| [windowRuleRepo](window-rule-repo.html) | [jvm]<br>private val [windowRuleRepo](window-rule-repo.html): [WindowRuleRepo](../../com.hyprsync.parser.repo.sortSettings/-window-rule-repo/index.html)<br>Repository for defining and managing window rules in Hyprland. |
| [workspaceRepo](workspace-repo.html) | [jvm]<br>private val [workspaceRepo](workspace-repo.html): [WorkspaceRepo](../../com.hyprsync.parser.repo.sortSettings/-workspace-repo/index.html)<br>Repository for workspace-related configurations and management. |


## Functions


| Name | Summary |
|---|---|
| [createAutoStartCacheSettings](create-auto-start-cache-settings.html) | [jvm]<br>fun [createAutoStartCacheSettings](create-auto-start-cache-settings.html)()<br>This uses to cache `Execute settings` |
| [createBindsCacheSettings](create-binds-cache-settings.html) | [jvm]<br>fun [createBindsCacheSettings](create-binds-cache-settings.html)()<br>This uses to cache `Binds settings` |
| [createEnvironmentCacheSettings](create-environment-cache-settings.html) | [jvm]<br>fun [createEnvironmentCacheSettings](create-environment-cache-settings.html)()<br>This uses to cache `Env settings` |
| [createHyprlangCacheSettings](create-hyprlang-cache-settings.html) | [jvm]<br>fun [createHyprlangCacheSettings](create-hyprlang-cache-settings.html)()<br>This uses to cache `Hyprlang settings` |
| [createMonitorCacheSettings](create-monitor-cache-settings.html) | [jvm]<br>fun [createMonitorCacheSettings](create-monitor-cache-settings.html)()<br>This uses to cache `Monitor settings` |
| [createVariableCacheSettings](create-variable-cache-settings.html) | [jvm]<br>fun [createVariableCacheSettings](create-variable-cache-settings.html)()<br>This uses to cache `Variable settings` |
| [createWindowCacheSettings](create-window-cache-settings.html) | [jvm]<br>fun [createWindowCacheSettings](create-window-cache-settings.html)()<br>This uses to cache `Window settings` |
| [createWorkspaceCacheSettings](create-workspace-cache-settings.html) | [jvm]<br>fun [createWorkspaceCacheSettings](create-workspace-cache-settings.html)()<br>This uses to cache `Workspace settings` |
