---
title: ExecuteRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../index.html)/[ExecuteRepo](index.html)



# ExecuteRepo



[jvm]\
internal class [ExecuteRepo](index.html)

###### [ExecuteRepo](index.html)



This use to store processed execute settings.



***Store*** - Companion object [ExecuteStore](-execute-store/index.html)



Method



1. 
   [processSort](process-sort.html)
2. 
   [cashExecuteSettings](cash-execute-settings.html)



## Constructors


| | |
|---|---|
| [ExecuteRepo](-execute-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [ExecuteStore](-execute-store/index.html) | [jvm]<br>private object [ExecuteStore](-execute-store/index.html)<br>This uses to store process `Execute` settings. |


## Properties


| Name | Summary |
|---|---|
| [logger](logger.html) | [jvm]<br>private val [logger](logger.html): KLogger |


## Functions


| Name | Summary |
|---|---|
| [cashExecuteSettings](cash-execute-settings.html) | [jvm]<br>fun [cashExecuteSettings](cash-execute-settings.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[ExecuteModel](../../com.hyprsync.parser.models/-execute-model/index.html)&gt;<br>Use to get all processed execute settings. |
| [processSort](process-sort.html) | [jvm]<br>fun [processSort](process-sort.html)(executeSettings: [KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html))<br>Use to process meta-data key value settings as [KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html). |
