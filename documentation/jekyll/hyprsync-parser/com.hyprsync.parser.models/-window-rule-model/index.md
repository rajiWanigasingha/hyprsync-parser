---
title: WindowRuleModel
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.models](../index.html)/[WindowRuleModel](index.html)



# WindowRuleModel



[jvm]\
@Serializable



data class [WindowRuleModel](index.html)(val keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), val window: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), val rules: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;, val comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null)

Use to store processed window rules



## Constructors


| | |
|---|---|
| [WindowRuleModel](-window-rule-model.html) | [jvm]<br>constructor(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), window: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), rules: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;, comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [comment](comment.html) | [jvm]<br>val [comment](comment.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null |
| [keyword](keyword.html) | [jvm]<br>val [keyword](keyword.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
| [rules](rules.html) | [jvm]<br>val [rules](rules.html): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt; |
| [window](window.html) | [jvm]<br>val [window](window.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
