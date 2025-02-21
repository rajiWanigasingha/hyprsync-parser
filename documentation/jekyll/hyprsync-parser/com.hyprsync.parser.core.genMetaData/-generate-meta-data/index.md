---
title: GenerateMetaData
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.core.genMetaData](../index.html)/[GenerateMetaData](index.html)



# GenerateMetaData



[jvm]\
class [GenerateMetaData](index.html)(val metaData: [MetaDataRepoInterface](../../com.hyprsync.parser.repo.metaData/-meta-data-repo-interface/index.html)) : [GenerateMetaDataInterface](../-generate-meta-data-interface/index.html)

###### [GenerateMetaData](index.html)



This use to generate meta-data for `Key Value Pair` and `Hyprlang`, and inhered from [GenerateMetaDataInterface](../-generate-meta-data-interface/index.html).



## Constructors


| | |
|---|---|
| [GenerateMetaData](-generate-meta-data.html) | [jvm]<br>constructor(metaData: [MetaDataRepoInterface](../../com.hyprsync.parser.repo.metaData/-meta-data-repo-interface/index.html))<br>metaData as Type [MetaDataRepoInterface](../../com.hyprsync.parser.repo.metaData/-meta-data-repo-interface/index.html) |


## Properties


| Name | Summary |
|---|---|
| [logger](logger.html) | [jvm]<br>private val [logger](logger.html): KLogger |
| [metaData](meta-data.html) | [jvm]<br>private val [metaData](meta-data.html): [MetaDataRepoInterface](../../com.hyprsync.parser.repo.metaData/-meta-data-repo-interface/index.html) |


## Functions


| Name | Summary |
|---|---|
| [genForHyprlang](gen-for-hyprlang.html) | [jvm]<br>open override fun [genForHyprlang](gen-for-hyprlang.html)(hyprlang: [Map](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt;)<br>Use for generating meta data for hyprlang code block. |
| [genForKeyValuePair](gen-for-key-value-pair.html) | [jvm]<br>open override fun [genForKeyValuePair](gen-for-key-value-pair.html)(keyValue: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;)<br>Use for generating meta data for key value pairs. |
