---
title: MonitorStore
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../../index.html)/[MonitorRepo](../index.html)/[MonitorStore](index.html)



# MonitorStore



[jvm]\
private object [MonitorStore](index.html)

This uses store and gets back processed monitor settings.



## Properties


| Name | Summary |
|---|---|
| [monitorStore](monitor-store.html) | [jvm]<br>private val [monitorStore](monitor-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[MonitorModel](../../../com.hyprsync.parser.models/-monitor-model/index.html)&gt;<br>This uses to store monitor settings |


## Functions


| Name | Summary |
|---|---|
| [getAll](get-all.html) | [jvm]<br>private fun [getAll](get-all.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[MonitorModel](../../../com.hyprsync.parser.models/-monitor-model/index.html)&gt;<br>Use to get all processed `monitor` settings. |
| [insertError](insert-error.html) | [jvm]<br>private fun [insertError](insert-error.html)(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), errorMonitorSettings: [ErrorMonitorSettings](../../../com.hyprsync.parser.models/-error-monitor-settings/index.html))<br>Use to insert processed [errorMonitorSettings](insert-error.html) binds to [monitorStore](monitor-store.html). |
| [insertIntoDefault](insert-into-default.html) | [jvm]<br>private fun [insertIntoDefault](insert-into-default.html)(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), defaultSettings: [DefaultMonitorSettings](../../../com.hyprsync.parser.models/-default-monitor-settings/index.html), comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)?)<br>Use to insert processed [defaultSettings](insert-into-default.html) binds to [monitorStore](monitor-store.html). |
| [insertIntoExtra](insert-into-extra.html) | [jvm]<br>private fun [insertIntoExtra](insert-into-extra.html)(keyword: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), extraMonitorSettings: [ExtraMonitorSettings](../../../com.hyprsync.parser.models/-extra-monitor-settings/index.html), comment: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)?)<br>Use to insert processed [extraMonitorSettings](insert-into-extra.html) binds to [monitorStore](monitor-store.html). |
