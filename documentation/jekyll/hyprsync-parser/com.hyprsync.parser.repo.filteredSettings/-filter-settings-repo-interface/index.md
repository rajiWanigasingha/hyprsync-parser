---
title: FilterSettingsRepoInterface
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.filteredSettings](../index.html)/[FilterSettingsRepoInterface](index.html)



# FilterSettingsRepoInterface

interface [FilterSettingsRepoInterface](index.html)

#### Inheritors


| |
|---|
| [FilteredSettingsRepo](../-filtered-settings-repo/index.html) |


## Functions


| Name | Summary |
|---|---|
| [getHyprland](get-hyprland.html) | [jvm]<br>abstract fun [getHyprland](get-hyprland.html)(): [MutableMap](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt; |
| [getKeyValues](get-key-values.html) | [jvm]<br>abstract fun [getKeyValues](get-key-values.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt; |
| [insertHyprlang](insert-hyprlang.html) | [jvm]<br>abstract fun [insertHyprlang](insert-hyprlang.html)(records: [MutableMap](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt;): [SettingsStoreStatus](../../com.hyprsync.parser.models/-settings-store-status/index.html)? |
| [insertKeyValue](insert-key-value.html) | [jvm]<br>abstract fun [insertKeyValue](insert-key-value.html)(records: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;): [SettingsStoreStatus](../../com.hyprsync.parser.models/-settings-store-status/index.html)? |
