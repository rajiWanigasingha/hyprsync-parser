---
title: ExecuteStore
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../../index.html)/[ExecuteRepo](../index.html)/[ExecuteStore](index.html)



# ExecuteStore



[jvm]\
private object [ExecuteStore](index.html)

This uses to store process `Execute` settings.



## Properties


| Name | Summary |
|---|---|
| [executeStore](execute-store.html) | [jvm]<br>private val [executeStore](execute-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[ExecuteModel](../../../com.hyprsync.parser.models/-execute-model/index.html)&gt;<br>This is uses to store execute settings. |


## Functions


| Name | Summary |
|---|---|
| [getAll](get-all.html) | [jvm]<br>private fun [getAll](get-all.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[ExecuteModel](../../../com.hyprsync.parser.models/-execute-model/index.html)&gt;<br>This uses to get all processed `execute` settings from [executeStore](execute-store.html) |
| [insertInto](insert-into.html) | [jvm]<br>private fun [insertInto](insert-into.html)(executeModel: [ExecuteModel](../../../com.hyprsync.parser.models/-execute-model/index.html))<br>This uses to insert processed `execute` settings into [executeStore](execute-store.html) |
