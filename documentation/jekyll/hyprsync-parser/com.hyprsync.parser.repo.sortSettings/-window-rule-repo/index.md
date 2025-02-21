---
title: WindowRuleRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../index.html)/[WindowRuleRepo](index.html)



# WindowRuleRepo



[jvm]\
internal class [WindowRuleRepo](index.html)

###### [WindowRuleRepo](index.html)



This use to store and get back processed `window rule`.



***Store*** - companion object `windowStore`



Models



1. 
   [processSort](process-sort.html)
2. 
   [cashWindowSettings](cash-window-settings.html)



## Constructors


| | |
|---|---|
| [WindowRuleRepo](-window-rule-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [WindowRuleStore](-window-rule-store/index.html) | [jvm]<br>private object [WindowRuleStore](-window-rule-store/index.html)<br>This uses to store processed window rules. |


## Properties


| Name | Summary |
|---|---|
| [logger](logger.html) | [jvm]<br>private val [logger](logger.html): KLogger |


## Functions


| Name | Summary |
|---|---|
| [cashWindowSettings](cash-window-settings.html) | [jvm]<br>fun [cashWindowSettings](cash-window-settings.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[WindowRuleModel](../../com.hyprsync.parser.models/-window-rule-model/index.html)&gt;<br>This uses to get all processed settings from the store. |
| [processSort](process-sort.html) | [jvm]<br>fun [processSort](process-sort.html)(keyValueMetaDataModel: [KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html))<br>This uses to process default key value binds into processed `bind settings` |
