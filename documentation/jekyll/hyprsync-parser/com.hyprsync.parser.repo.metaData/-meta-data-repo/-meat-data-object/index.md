---
title: MeatDataObject
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.metaData](../../index.html)/[MetaDataRepo](../index.html)/[MeatDataObject](index.html)



# MeatDataObject



[jvm]\
private object [MeatDataObject](index.html)

Use to store filtered meta-data that can be accessed globally inside the library.



Store meta-data store,



1. 
   [keyValueMetaDataStore](key-value-meta-data-store.html) as Type [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)<[KeyValueMetaDataModel](../../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html)>
2. 
   [hyprlangMetaDataStore](hyprlang-meta-data-store.html) as Type [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)<[HyprlangMetaData](../../../com.hyprsync.parser.models/-hyprlang-meta-data/index.html)>




Methods to use,



1. 
   [insetIntoKeyValueStore](inset-into-key-value-store.html)
2. 
   [getAllKeyValueStore](get-all-key-value-store.html)
3. 
   [insertIntoHyprlangStore](insert-into-hyprlang-store.html)
4. 
   [getHyprlangStore](get-hyprlang-store.html)



## Properties


| Name | Summary |
|---|---|
| [hyprlangMetaDataStore](hyprlang-meta-data-store.html) | [jvm]<br>private val [hyprlangMetaDataStore](hyprlang-meta-data-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[HyprlangMetaData](../../../com.hyprsync.parser.models/-hyprlang-meta-data/index.html)&gt;<br>Store hyprland meta data as type [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)<[HyprlangMetaData](../../../com.hyprsync.parser.models/-hyprlang-meta-data/index.html)> |
| [keyValueMetaDataStore](key-value-meta-data-store.html) | [jvm]<br>private val [keyValueMetaDataStore](key-value-meta-data-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[KeyValueMetaDataModel](../../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html)&gt;<br>Store Key value meta data as type [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)<[KeyValueMetaDataModel](../../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html)> |
| [logger](logger.html) | [jvm]<br>private val [logger](logger.html): KLogger |


## Functions


| Name | Summary |
|---|---|
| [getAllKeyValueStore](get-all-key-value-store.html) | [jvm]<br>private fun [getAllKeyValueStore](get-all-key-value-store.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[KeyValueMetaDataModel](../../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html)&gt;<br>Use to get all from key value store in [hyprlangMetaDataStore](hyprlang-meta-data-store.html) |
| [getHyprlangStore](get-hyprlang-store.html) | [jvm]<br>private fun [getHyprlangStore](get-hyprlang-store.html)(): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[HyprlangMetaData](../../../com.hyprsync.parser.models/-hyprlang-meta-data/index.html)&gt;<br>Use to get all hyprlang from store [hyprlangMetaDataStore](hyprlang-meta-data-store.html) |
| [insertIntoHyprlangStore](insert-into-hyprlang-store.html) | [jvm]<br>private fun [insertIntoHyprlangStore](insert-into-hyprlang-store.html)(data: [HyprlangMetaData](../../../com.hyprsync.parser.models/-hyprlang-meta-data/index.html))<br>Use to insert hyprlang to store in [hyprlangMetaDataStore](hyprlang-meta-data-store.html) |
| [insetIntoKeyValueStore](inset-into-key-value-store.html) | [jvm]<br>private fun [insetIntoKeyValueStore](inset-into-key-value-store.html)(data: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[KeyValueMetaDataModel](../../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html)&gt;)<br>Use to store insert key value data in [keyValueMetaDataStore](key-value-meta-data-store.html) |
