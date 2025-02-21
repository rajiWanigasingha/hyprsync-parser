---
title: EnvironmentStore
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../../index.html)/[EnvironmentRepo](../index.html)/[EnvironmentStore](index.html)



# EnvironmentStore



[jvm]\
private object [EnvironmentStore](index.html)

This uses to store `Environment` settings



## Properties


| Name | Summary |
|---|---|
| [envStore](env-store.html) | [jvm]<br>private val [envStore](env-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[EnvironmentModel](../../../com.hyprsync.parser.models/-environment-model/index.html)&gt;<br>Use to store processed `Environment` settings for as [mutableListOf](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index.html)<[EnvironmentModel](../../../com.hyprsync.parser.models/-environment-model/index.html)> |


## Functions


| Name | Summary |
|---|---|
| [getAll](get-all.html) | [jvm]<br>private fun [getAll](get-all.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[EnvironmentModel](../../../com.hyprsync.parser.models/-environment-model/index.html)&gt;<br>This uses to get all processed `Environment` settings from [envStore](env-store.html) |
| [insertInto](insert-into.html) | [jvm]<br>private fun [insertInto](insert-into.html)(env: [EnvironmentModel](../../../com.hyprsync.parser.models/-environment-model/index.html))<br>This uses to insert new processed `Environment` Settings into [envStore](env-store.html). |
