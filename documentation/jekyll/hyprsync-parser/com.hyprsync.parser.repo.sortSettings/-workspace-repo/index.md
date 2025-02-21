---
title: WorkspaceRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../index.html)/[WorkspaceRepo](index.html)



# WorkspaceRepo



[jvm]\
internal class [WorkspaceRepo](index.html)

###### [WorkspaceRepo](index.html)



This uses to store and get back processed workspace store.



***Store*** - companion object `WorkspaceStore`



Methods



1. 
   [processSort](process-sort.html)
2. 
   [cashWorkspaceSettings](cash-workspace-settings.html)



## Constructors


| | |
|---|---|
| [WorkspaceRepo](-workspace-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [WorkspaceStore](-workspace-store/index.html) | [jvm]<br>private object [WorkspaceStore](-workspace-store/index.html)<br>This uses to store workspace rule and get back from it. |


## Properties


| Name | Summary |
|---|---|
| [logger](logger.html) | [jvm]<br>private val [logger](logger.html): KLogger |


## Functions


| Name | Summary |
|---|---|
| [cashWorkspaceSettings](cash-workspace-settings.html) | [jvm]<br>fun [cashWorkspaceSettings](cash-workspace-settings.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[WorkspaceModel](../../com.hyprsync.parser.models/-workspace-model/index.html)&gt;<br>This uses to get all settings from `workspace store`. |
| [processSort](process-sort.html) | [jvm]<br>fun [processSort](process-sort.html)(keyValueMetaDataModel: [KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html))<br>This use to get default key value settings and processed and store them into `workspace store` |
