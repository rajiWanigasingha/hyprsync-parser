---
title: WorkspaceModel
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.models](../index.html)/[WorkspaceModel](index.html)



# WorkspaceModel



[jvm]\
@Serializable



data class [WorkspaceModel](index.html)(val keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), val workspaceName: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), val rules: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;, val comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null)

This uses to store processed workspace rules



## Constructors


| | |
|---|---|
| [WorkspaceModel](-workspace-model.html) | [jvm]<br>constructor(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), workspaceName: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), rules: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt;, comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [comment](comment.html) | [jvm]<br>val [comment](comment.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null |
| [keyword](keyword.html) | [jvm]<br>val [keyword](keyword.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
| [rules](rules.html) | [jvm]<br>val [rules](rules.html): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)&gt; |
| [workspaceName](workspace-name.html) | [jvm]<br>val [workspaceName](workspace-name.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
