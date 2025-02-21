---
title: HyprlangRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../index.html)/[HyprlangRepo](index.html)



# HyprlangRepo



[jvm]\
internal class [HyprlangRepo](index.html)

###### [HyprlangRepo](index.html)



This uses to store and get back processed hyprlang settings.



***Store*** - companion object `HyprlandStore`



Methods



1. 
   [processSort](process-sort.html)
2. 
   [cacheHyprlangSettings](cache-hyprlang-settings.html)



## Constructors


| | |
|---|---|
| [HyprlangRepo](-hyprlang-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [HyprlangStore](-hyprlang-store/index.html) | [jvm]<br>private object [HyprlangStore](-hyprlang-store/index.html)<br>This uses to store process and gets back settings |


## Functions


| Name | Summary |
|---|---|
| [cacheHyprlangSettings](cache-hyprlang-settings.html) | [jvm]<br>fun [cacheHyprlangSettings](cache-hyprlang-settings.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[HyprlangValuesModel](../../com.hyprsync.parser.models/-hyprlang-values-model/index.html)&gt;<br>Get all the stored processed hyprlang value |
| [processSort](process-sort.html) | [jvm]<br>fun [processSort](process-sort.html)(hyprlang: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[HyprlangValuesModel](../../com.hyprsync.parser.models/-hyprlang-values-model/index.html)&gt;)<br>Process and store hyprlang values |
