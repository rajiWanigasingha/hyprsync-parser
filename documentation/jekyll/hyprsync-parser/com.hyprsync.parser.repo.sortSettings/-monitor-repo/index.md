---
title: MonitorRepo
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../index.html)/[MonitorRepo](index.html)



# MonitorRepo



[jvm]\
internal class [MonitorRepo](index.html)

###### [MonitorRepo](index.html)



This uses to store `monitor` settings in monitor store.



***Store*** Companies object `MonitorStore`



Methods,



1. 
   [processSort](process-sort.html)
2. 
   [cashMonitorSettings](cash-monitor-settings.html)



## Constructors


| | |
|---|---|
| [MonitorRepo](-monitor-repo.html) | [jvm]<br>constructor() |


## Types


| Name | Summary |
|---|---|
| [MonitorStore](-monitor-store/index.html) | [jvm]<br>private object [MonitorStore](-monitor-store/index.html)<br>This uses store and gets back processed monitor settings. |


## Functions


| Name | Summary |
|---|---|
| [cashMonitorSettings](cash-monitor-settings.html) | [jvm]<br>fun [cashMonitorSettings](cash-monitor-settings.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[MonitorModel](../../com.hyprsync.parser.models/-monitor-model/index.html)&gt;<br>This uses to get all monitor settings from the monitor store. |
| [processSort](process-sort.html) | [jvm]<br>fun [processSort](process-sort.html)(keyValueMetaDataModel: [KeyValueMetaDataModel](../../com.hyprsync.parser.models/-key-value-meta-data-model/index.html))<br>This uses to process default key value settings into monitor store. |
