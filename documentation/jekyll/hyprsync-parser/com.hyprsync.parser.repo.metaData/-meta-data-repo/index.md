---
title: MetaDataRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.metaData](../index.html)/[MetaDataRepo](index.html)



# MetaDataRepo



[jvm]\
class [MetaDataRepo](index.html) : [MetaDataRepoInterface](../-meta-data-repo-interface/index.html)

###### [MetaDataRepo](index.html)



This use to store and query data that has been store, and it is inhabited from [MetaDataRepoInterface](../-meta-data-repo-interface/index.html).



Methods that can be used



1. 
   [insetIntoKeyValueStore](-meat-data-object/inset-into-key-value-store.html)
2. 
   [getAllKeyValueStore](-meat-data-object/get-all-key-value-store.html)
3. 
   [insertIntoHyprlangStore](-meat-data-object/insert-into-hyprlang-store.html)
4. 
   [getHyprlangStore](-meat-data-object/get-hyprlang-store.html)



## Constructors


| | |
|---|---|
| [MetaDataRepo](-meta-data-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [MeatDataObject](-meat-data-object/index.html) | [jvm]<br>private object [MeatDataObject](-meat-data-object/index.html)<br>Use to store filtered meta-data that can be accessed globally inside the library. |


## Functions


| Name | Summary |
|---|---|
| [getAllHyprlang](get-all-hyprlang.html) | [jvm]<br>open override fun [getAllHyprlang](get-all-hyprlang.html)(): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[HyprlangMetaData](../../com.hyprsync.parser.models/-hyprlang-meta-data/index.html)&gt;<br>This uses to get all the hyprlang store. |
| [getAllKeyValues](get-all-key-values.html) | [jvm]<br>open override fun [getAllKeyValues](get-all-key-values.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html)&gt;<br>This uses to get all key values from the store. |
| [insertIntoHyprlang](insert-into-hyprlang.html) | [jvm]<br>open override fun [insertIntoHyprlang](insert-into-hyprlang.html)(data: [HyprlangMetaData](../../com.hyprsync.parser.models/-hyprlang-meta-data/index.html))<br>This uses to insert hyprlang code block into hyprlang store. |
| [insertIntoKeyValue](insert-into-key-value.html) | [jvm]<br>open override fun [insertIntoKeyValue](insert-into-key-value.html)(data: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html)&gt;)<br>This use for insert value into key value store |
