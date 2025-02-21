---
title: EnvironmentRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../index.html)/[EnvironmentRepo](index.html)



# EnvironmentRepo



[jvm]\
internal class [EnvironmentRepo](index.html)

###### [EnvironmentRepo](index.html)



This used to store processed `Environment` settings and get them.



***Store*** - Companion object [EnvironmentStore](-environment-store/index.html)



Methods,



1. 
   [processSort](process-sort.html)
2. 
   [cashEnvSettings](cash-env-settings.html)



## Constructors


| | |
|---|---|
| [EnvironmentRepo](-environment-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [EnvironmentStore](-environment-store/index.html) | [jvm]<br>private object [EnvironmentStore](-environment-store/index.html)<br>This uses to store `Environment` settings |


## Functions


| Name | Summary |
|---|---|
| [cashEnvSettings](cash-env-settings.html) | [jvm]<br>fun [cashEnvSettings](cash-env-settings.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[EnvironmentModel](../../com.hyprsync.parser.models/-environment-model/index.html)&gt;<br>This uses to get all settings from env store. |
| [processSort](process-sort.html) | [jvm]<br>fun [processSort](process-sort.html)(sort: [KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html))<br>This uses to process key value `Environment` settings from [KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html). |
