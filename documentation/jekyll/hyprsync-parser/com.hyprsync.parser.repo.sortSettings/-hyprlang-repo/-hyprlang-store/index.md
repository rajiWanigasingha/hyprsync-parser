---
title: HyprlangStore
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../../index.html)/[HyprlangRepo](../index.html)/[HyprlangStore](index.html)



# HyprlangStore



[jvm]\
private object [HyprlangStore](index.html)

This uses to store process and gets back settings



## Properties


| Name | Summary |
|---|---|
| [hyprlangStore](hyprlang-store.html) | [jvm]<br>private val [hyprlangStore](hyprlang-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[HyprlangValuesModel](../../../com.hyprsync.parser.models/-hyprlang-values-model/index.html)&gt;<br>Use to store processed [HyprlangValuesModel](../../../com.hyprsync.parser.models/-hyprlang-values-model/index.html) values |


## Functions


| Name | Summary |
|---|---|
| [getAll](get-all.html) | [jvm]<br>private fun [getAll](get-all.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[HyprlangValuesModel](../../../com.hyprsync.parser.models/-hyprlang-values-model/index.html)&gt;<br>Use to get all processed values that has been stored |
| [insertInto](insert-into.html) | [jvm]<br>private fun [insertInto](insert-into.html)(hyprlang: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[HyprlangValuesModel](../../../com.hyprsync.parser.models/-hyprlang-values-model/index.html)&gt;)<br>Use to insert new [HyprlangValuesModel](../../../com.hyprsync.parser.models/-hyprlang-values-model/index.html) into store |
