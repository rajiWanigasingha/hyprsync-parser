---
title: WindowRuleStore
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../../index.html)/[WindowRuleRepo](../index.html)/[WindowRuleStore](index.html)



# WindowRuleStore



[jvm]\
private object [WindowRuleStore](index.html)

This uses to store processed window rules.



## Properties


| Name | Summary |
|---|---|
| [windowRuleStore](window-rule-store.html) | [jvm]<br>private val [windowRuleStore](window-rule-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[WindowRuleModel](../../../com.hyprsync.parser.models/-window-rule-model/index.html)&gt;<br>This use for store window rules |


## Functions


| Name | Summary |
|---|---|
| [getAll](get-all.html) | [jvm]<br>private fun [getAll](get-all.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[WindowRuleModel](../../../com.hyprsync.parser.models/-window-rule-model/index.html)&gt;<br>This uses to get all window rules into `windowRuleStore`. |
| [insertInto](insert-into.html) | [jvm]<br>private fun [insertInto](insert-into.html)(windowRuleModel: [WindowRuleModel](../../../com.hyprsync.parser.models/-window-rule-model/index.html))<br>This uses to insert window rules into `windowRuleStore`. |
