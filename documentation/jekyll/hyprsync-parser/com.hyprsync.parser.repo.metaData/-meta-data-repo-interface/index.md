---
title: MetaDataRepoInterface
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.metaData](../index.html)/[MetaDataRepoInterface](index.html)



# MetaDataRepoInterface

interface [MetaDataRepoInterface](index.html)

###### [MetaDataRepoInterface](index.html)



This uses for given structure for metadata repo.



Methods To Use,



1. 
   [insertIntoKeyValue](insert-into-key-value.html)
2. 
   [getAllKeyValues](get-all-key-values.html)
3. 
   [insertIntoHyprlang](insert-into-hyprlang.html)
4. 
   [getAllHyprlang](get-all-hyprlang.html)




#### Inheritors


| |
|---|
| [MetaDataRepo](../-meta-data-repo/index.html) |


## Functions


| Name | Summary |
|---|---|
| [getAllHyprlang](get-all-hyprlang.html) | [jvm]<br>abstract fun [getAllHyprlang](get-all-hyprlang.html)(): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[HyprlangMetaData](../../com.hyprsync.parser.models/-hyprlang-meta-data/index.html)&gt;<br>This uses to get all the hyprlang store. |
| [getAllKeyValues](get-all-key-values.html) | [jvm]<br>abstract fun [getAllKeyValues](get-all-key-values.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html)&gt;<br>This uses to get all key values from the store. |
| [insertIntoHyprlang](insert-into-hyprlang.html) | [jvm]<br>abstract fun [insertIntoHyprlang](insert-into-hyprlang.html)(data: [HyprlangMetaData](../../com.hyprsync.parser.models/-hyprlang-meta-data/index.html))<br>This uses to insert hyprlang code block into hyprlang store. |
| [insertIntoKeyValue](insert-into-key-value.html) | [jvm]<br>abstract fun [insertIntoKeyValue](insert-into-key-value.html)(data: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html)&gt;)<br>This use for insert value into key value store |
