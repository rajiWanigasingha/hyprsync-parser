---
title: GenerateMetaDataInterface
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.core.genMetaData](../index.html)/[GenerateMetaDataInterface](index.html)



# GenerateMetaDataInterface

interface [GenerateMetaDataInterface](index.html)

##### [GenerateMetaDataInterface](index.html)



This gives a structure to generate meta-data interface.



Methods to use,



1. 
   [genForKeyValuePair](gen-for-key-value-pair.html)
2. 
   [genForHyprlang](gen-for-hyprlang.html)




#### Inheritors


| |
|---|
| [GenerateMetaData](../-generate-meta-data/index.html) |


## Functions


| Name | Summary |
|---|---|
| [genForHyprlang](gen-for-hyprlang.html) | [jvm]<br>abstract fun [genForHyprlang](gen-for-hyprlang.html)(hyprlang: [Map](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt;)<br>Use for generating meta data for hyprlang code block. |
| [genForKeyValuePair](gen-for-key-value-pair.html) | [jvm]<br>abstract fun [genForKeyValuePair](gen-for-key-value-pair.html)(keyValue: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;)<br>Use for generating meta data for key value pairs. |
