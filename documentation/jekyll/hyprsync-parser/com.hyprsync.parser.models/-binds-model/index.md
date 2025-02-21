---
title: BindsModel
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.models](../index.html)/[BindsModel](index.html)



# BindsModel



[jvm]\
@Serializable



data class [BindsModel](index.html)(val keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), val defaultBindSettings: [DefaultBindSettings](../-default-bind-settings/index.html)? = null, val extraBindSettings: [ExtraBindSettings](../-extra-bind-settings/index.html)? = null, val errorBindSettings: [ErrorBindSettings](../-error-bind-settings/index.html)? = null, val comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null)

This uses to process bind settings into `Bind Store`



## Constructors


| | |
|---|---|
| [BindsModel](-binds-model.html) | [jvm]<br>constructor(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), defaultBindSettings: [DefaultBindSettings](../-default-bind-settings/index.html)? = null, extraBindSettings: [ExtraBindSettings](../-extra-bind-settings/index.html)? = null, errorBindSettings: [ErrorBindSettings](../-error-bind-settings/index.html)? = null, comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [comment](comment.html) | [jvm]<br>val [comment](comment.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null |
| [defaultBindSettings](default-bind-settings.html) | [jvm]<br>val [defaultBindSettings](default-bind-settings.html): [DefaultBindSettings](../-default-bind-settings/index.html)? = null |
| [errorBindSettings](error-bind-settings.html) | [jvm]<br>val [errorBindSettings](error-bind-settings.html): [ErrorBindSettings](../-error-bind-settings/index.html)? = null |
| [extraBindSettings](extra-bind-settings.html) | [jvm]<br>val [extraBindSettings](extra-bind-settings.html): [ExtraBindSettings](../-extra-bind-settings/index.html)? = null |
| [keyword](keyword.html) | [jvm]<br>val [keyword](keyword.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
