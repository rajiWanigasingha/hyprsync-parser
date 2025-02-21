---
title: FilteredSettingsRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.filteredSettings](../index.html)/[FilteredSettingsRepo](index.html)



# FilteredSettingsRepo



[jvm]\
internal class [FilteredSettingsRepo](index.html) : [FilterSettingsRepoInterface](../-filter-settings-repo-interface/index.html)

###### [FilteredSettingsRepo](index.html)



This use to store and get back processed keu value pairs or hyprlang settings and this inhabited form [FilterSettingsRepoInterface](../-filter-settings-repo-interface/index.html).



***Store*** - companion object `keyValuePairStore` and `hyprLangStore`



Method



1. 
   [insertKeyValue](insert-key-value.html)
2. 
   [getKeyValues](get-key-values.html)
3. 
   [insertHyprlang](insert-hyprlang.html)
4. 
   [getHyprland](get-hyprland.html)



## Constructors


| | |
|---|---|
| [FilteredSettingsRepo](-filtered-settings-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [Store](-store/index.html) | [jvm]<br>private object [Store](-store/index.html)<br>This will be uses to store and get back processed key value pairs and hyprlang settings. |


## Functions


| Name | Summary |
|---|---|
| [getHyprland](get-hyprland.html) | [jvm]<br>open override fun [getHyprland](get-hyprland.html)(): [MutableMap](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt;<br>This uses to get all stored hyprlang settings, |
| [getKeyValues](get-key-values.html) | [jvm]<br>open override fun [getKeyValues](get-key-values.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;<br>This uses to get back stored key value settings. |
| [insertHyprlang](insert-hyprlang.html) | [jvm]<br>open override fun [insertHyprlang](insert-hyprlang.html)(records: [MutableMap](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt;): [SettingsStoreStatus](../../com.hyprsync.parser.models/-settings-store-status/index.html)?<br>This uses to process and store hyprlang settings. |
| [insertKeyValue](insert-key-value.html) | [jvm]<br>open override fun [insertKeyValue](insert-key-value.html)(records: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;): [SettingsStoreStatus](../../com.hyprsync.parser.models/-settings-store-status/index.html)?<br>This uses to process a record and store it in key value store. |
