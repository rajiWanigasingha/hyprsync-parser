---
title: BindsRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../index.html)/[BindsRepo](index.html)



# BindsRepo



[jvm]\
internal class [BindsRepo](index.html)

###### [BindsRepo](index.html)



This uses to store and get all processed bind settings.



***Store*** - companion object `Bind Store`



Methods



1. 
   [processSort](process-sort.html)
2. 
   [cashBindSettings](cash-bind-settings.html)



## Constructors


| | |
|---|---|
| [BindsRepo](-binds-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [BindStore](-bind-store/index.html) | [jvm]<br>private object [BindStore](-bind-store/index.html) |


## Functions


| Name | Summary |
|---|---|
| [cashBindSettings](cash-bind-settings.html) | [jvm]<br>fun [cashBindSettings](cash-bind-settings.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[BindsModel](../../com.hyprsync.parser.models/-binds-model/index.html)&gt;<br>Use to get all the stored and processed `bind settings`. |
| [processSort](process-sort.html) | [jvm]<br>fun [processSort](process-sort.html)(keyValueMetaDataModel: [KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html))<br>This uses to process default key value settings and store them in `bind store`. |
