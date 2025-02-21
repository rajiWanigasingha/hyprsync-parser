---
title: BindStore
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../../index.html)/[BindsRepo](../index.html)/[BindStore](index.html)



# BindStore



[jvm]\
private object [BindStore](index.html)



## Properties


| Name | Summary |
|---|---|
| [bindsStore](binds-store.html) | [jvm]<br>private val [bindsStore](binds-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[BindsModel](../../../com.hyprsync.parser.models/-binds-model/index.html)&gt;<br>Use to store processed `bind settings`. |


## Functions


| Name | Summary |
|---|---|
| [getAllBinds](get-all-binds.html) | [jvm]<br>private fun [getAllBinds](get-all-binds.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[BindsModel](../../../com.hyprsync.parser.models/-binds-model/index.html)&gt;<br>Use to get processed `bind settings` from [bindsStore](binds-store.html) |
| [insertIntoDefault](insert-into-default.html) | [jvm]<br>private fun [insertIntoDefault](insert-into-default.html)(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), defaultBindSettings: [DefaultBindSettings](../../../com.hyprsync.parser.models/-default-bind-settings/index.html), comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null)<br>Use to insert default bind settings into [bindsStore](binds-store.html). |
| [insertIntoError](insert-into-error.html) | [jvm]<br>private fun [insertIntoError](insert-into-error.html)(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), errorBindSettings: [ErrorBindSettings](../../../com.hyprsync.parser.models/-error-bind-settings/index.html), comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null)<br>Use to insert error bind settings into [bindsStore](binds-store.html) |
| [insertIntoExtraArgs](insert-into-extra-args.html) | [jvm]<br>private fun [insertIntoExtraArgs](insert-into-extra-args.html)(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), extraBindSettings: [ExtraBindSettings](../../../com.hyprsync.parser.models/-extra-bind-settings/index.html), comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null)<br>Use to insert extra args bind settings into [bindsStore](binds-store.html) |
