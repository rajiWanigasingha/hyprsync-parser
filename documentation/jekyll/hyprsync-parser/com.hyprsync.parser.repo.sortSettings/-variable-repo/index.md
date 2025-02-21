---
title: VariableRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../index.html)/[VariableRepo](index.html)



# VariableRepo



[jvm]\
internal class [VariableRepo](index.html)

###### [VariableRepo](index.html)



This uses to store and get back processed variable settings.



***Store*** - companion object `variable store`



## Constructors


| | |
|---|---|
| [VariableRepo](-variable-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [VariableStore](-variable-store/index.html) | [jvm]<br>private object [VariableStore](-variable-store/index.html)<br>This uses to store process variables. |


## Functions


| Name | Summary |
|---|---|
| [cashVariableSettings](cash-variable-settings.html) | [jvm]<br>fun [cashVariableSettings](cash-variable-settings.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[VariableModel](../../com.hyprsync.parser.models/-variable-model/index.html)&gt;<br>This uses to get all processed variable settings. |
| [processSort](process-sort.html) | [jvm]<br>fun [processSort](process-sort.html)(keyValueMetaDataModel: [KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html))<br>This uses to process default key value paris into variable settings. |
