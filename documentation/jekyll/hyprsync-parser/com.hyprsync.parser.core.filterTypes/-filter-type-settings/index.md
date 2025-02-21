---
title: FilterTypeSettings
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.core.filterTypes](../index.html)/[FilterTypeSettings](index.html)



# FilterTypeSettings



[jvm]\
internal class [FilterTypeSettings](index.html)

###### [FilterTypeSettings](index.html) Core Api



- 
   Internal core api used for separating different types of settings like ***Key Value Pairs***, ***Source Paths***, ***Hyprlang***




This will store processed key values inside [filteredSettingsRepo](filtered-settings-repo.html), it will be stored as key value pairs or hyprlang.



Methods



1. 
   [processSettings](process-settings.html)



## Constructors


| | |
|---|---|
| [FilterTypeSettings](-filter-type-settings.html) | [jvm]<br>constructor() |


## Properties


| Name | Summary |
|---|---|
| [filteredSettingsRepo](filtered-settings-repo.html) | [jvm]<br>private val [filteredSettingsRepo](filtered-settings-repo.html): [FilteredSettingsRepo](../../com.hyprsync.parser.repo.filteredSettings/-filtered-settings-repo/index.html) |
| [fromHomePath](from-home-path.html) | [jvm]<br>private val [fromHomePath](from-home-path.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
| [hyprlang](hyprlang.html) | [jvm]<br>private val [hyprlang](hyprlang.html): [MutableMap](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-map/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;&gt;<br>Store separated hyprlang settings. |
| [hyprlangBlockCount](hyprlang-block-count.html) | [jvm]<br>private var [hyprlangBlockCount](hyprlang-block-count.html): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)<br>Use to count how many code blocks are open. `code block -> {` |
| [hyprLangKey](hypr-lang-key.html) | [jvm]<br>private val [hyprLangKey](hypr-lang-key.html): [MutableSet](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-set/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;<br>Store hyprlang block key. Ex: input { ... } -> Key = `input`. |
| [isHyprlangBlock](is-hyprlang-block.html) | [jvm]<br>private var [isHyprlangBlock](is-hyprlang-block.html): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)<br>Use to check if it inside a code block. This will be `false` when [hyprlangBlockCount](hyprlang-block-count.html) is 0 else `true`. |
| [keyValuePairs](key-value-pairs.html) | [jvm]<br>private val [keyValuePairs](key-value-pairs.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;<br>Store separated key value pairs. |
| [logger](logger.html) | [jvm]<br>private val [logger](logger.html): KLogger |
| [source](source.html) | [jvm]<br>private val [source](source.html): [MutableSet](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-set/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;<br>Store separated source values. |


## Functions


| Name | Summary |
|---|---|
| [checkForHyprlang](check-for-hyprlang.html) | [jvm]<br>private fun [checkForHyprlang](check-for-hyprlang.html)(line: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))<br>This check and store any settings belong to hyprlang. Helper function for [processLine](../../com.hyprsync.parser.utils.extensions.processLineExtension/process-line.html) |
| [checkForSettings](check-for-settings.html) | [jvm]<br>private fun [checkForSettings](check-for-settings.html)(line: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [SettingsTypeModel](../../com.hyprsync.parser.models/-settings-type-model/index.html)?<br>This check for type of settings line. Helper function for [processLine](../../com.hyprsync.parser.utils.extensions.processLineExtension/process-line.html) |
| [handleSource](handle-source.html) | [jvm]<br>private fun [handleSource](handle-source.html)() |
| [processSettings](process-settings.html) | [jvm]<br>fun [processSettings](process-settings.html)(path: [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html))<br>This use for process what type of settings it has and stores them separately to use for generating mata data for them. |
