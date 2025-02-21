---
title: VariableStore
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../../index.html)/[VariableRepo](../index.html)/[VariableStore](index.html)



# VariableStore



[jvm]\
private object [VariableStore](index.html)

This uses to store process variables.



## Properties


| Name | Summary |
|---|---|
| [variableStore](variable-store.html) | [jvm]<br>private val [variableStore](variable-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[VariableModel](../../../com.hyprsync.parser.models/-variable-model/index.html)&gt;<br>This uses to store processed variable settings |


## Functions


| Name | Summary |
|---|---|
| [getAll](get-all.html) | [jvm]<br>private fun [getAll](get-all.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[VariableModel](../../../com.hyprsync.parser.models/-variable-model/index.html)&gt;<br>This uses to get all processed variables. |
| [insertInto](insert-into.html) | [jvm]<br>private fun [insertInto](insert-into.html)(variableModel: [VariableModel](../../../com.hyprsync.parser.models/-variable-model/index.html))<br>This uses to insert processed variable settings into variable store. |
