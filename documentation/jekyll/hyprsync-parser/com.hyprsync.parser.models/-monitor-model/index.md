---
title: MonitorModel
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.models](../index.html)/[MonitorModel](index.html)



# MonitorModel



[jvm]\
@Serializable



data class [MonitorModel](index.html)(val keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), val defaultMonitorSettings: [DefaultMonitorSettings](../-default-monitor-settings/index.html)? = null, val extraMonitorSettings: [ExtraMonitorSettings](../-extra-monitor-settings/index.html)? = null, val errorMonitorSettings: [ErrorMonitorSettings](../-error-monitor-settings/index.html)? = null, val comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null)

This uses to store processed `monitor settings`



## Constructors


| | |
|---|---|
| [MonitorModel](-monitor-model.html) | [jvm]<br>constructor(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), defaultMonitorSettings: [DefaultMonitorSettings](../-default-monitor-settings/index.html)? = null, extraMonitorSettings: [ExtraMonitorSettings](../-extra-monitor-settings/index.html)? = null, errorMonitorSettings: [ErrorMonitorSettings](../-error-monitor-settings/index.html)? = null, comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) |


## Properties


| Name | Summary |
|---|---|
| [comment](comment.html) | [jvm]<br>val [comment](comment.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null |
| [defaultMonitorSettings](default-monitor-settings.html) | [jvm]<br>val [defaultMonitorSettings](default-monitor-settings.html): [DefaultMonitorSettings](../-default-monitor-settings/index.html)? = null |
| [errorMonitorSettings](error-monitor-settings.html) | [jvm]<br>val [errorMonitorSettings](error-monitor-settings.html): [ErrorMonitorSettings](../-error-monitor-settings/index.html)? = null |
| [extraMonitorSettings](extra-monitor-settings.html) | [jvm]<br>val [extraMonitorSettings](extra-monitor-settings.html): [ExtraMonitorSettings](../-extra-monitor-settings/index.html)? = null |
| [keyword](keyword.html) | [jvm]<br>val [keyword](keyword.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
