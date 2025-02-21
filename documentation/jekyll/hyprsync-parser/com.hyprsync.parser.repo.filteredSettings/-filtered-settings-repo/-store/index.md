---
title: Store
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.filteredSettings](../../index.html)/[FilteredSettingsRepo](../index.html)/[Store](index.html)



# Store



[jvm]\
private object [Store](index.html)

This will be uses to store and get back processed key value pairs and hyprlang settings.



## Properties


| Name | Summary |
|---|---|
| [hyprLangStore](hypr-lang-store.html) | [jvm]<br>private val [hyprLangStore](hypr-lang-store.html): [MutableMap](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt;<br>Use to store hyprlang values. |
| [keyValuePairStore](key-value-pair-store.html) | [jvm]<br>private val [keyValuePairStore](key-value-pair-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;<br>Use to store key value pairs. |
| [logger](logger.html) | [jvm]<br>private val [logger](logger.html): KLogger |


## Functions


| Name | Summary |
|---|---|
| [getHyprlang](get-hyprlang.html) | [jvm]<br>private fun [getHyprlang](get-hyprlang.html)(): [MutableMap](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt;<br>This use to get all stored hyprlang settings from [hyprLangStore](hypr-lang-store.html) |
| [getKeyValueStore](get-key-value-store.html) | [jvm]<br>private fun [getKeyValueStore](get-key-value-store.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;<br>This use to get all stored key value settings form [keyValuePairStore](key-value-pair-store.html) |
| [insertHyprlangStore](insert-hyprlang-store.html) | [jvm]<br>private fun [insertHyprlangStore](insert-hyprlang-store.html)(hyprlang: [MutableMap](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt;): [Result](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-result/index.html)&lt;[Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)&gt;<br>This use to insert hyprlang settings into [hyprLangStore](hypr-lang-store.html) |
| [insertKeyValueStore](insert-key-value-store.html) | [jvm]<br>private fun [insertKeyValueStore](insert-key-value-store.html)(record: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;): [Result](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-result/index.html)&lt;[Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)&gt;<br>This use to insert key value records into [keyValuePairStore](key-value-pair-store.html) |
