---
title: WorkspaceStore
---
//[hyprsync-parser](../../../../index.html)/[com.hyprsync.parser.repo.sortSettings](../../index.html)/[WorkspaceRepo](../index.html)/[WorkspaceStore](index.html)



# WorkspaceStore



[jvm]\
private object [WorkspaceStore](index.html)

This uses to store workspace rule and get back from it.



## Properties


| Name | Summary |
|---|---|
| [workspaceStore](workspace-store.html) | [jvm]<br>private val [workspaceStore](workspace-store.html): [MutableList](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/index.html)&lt;[WorkspaceModel](../../../com.hyprsync.parser.models/-workspace-model/index.html)&gt;<br>This uses to store processed workspace rule. |


## Functions


| Name | Summary |
|---|---|
| [getAll](get-all.html) | [jvm]<br>private fun [getAll](get-all.html)(): [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[WorkspaceModel](../../../com.hyprsync.parser.models/-workspace-model/index.html)&gt;<br>Use to get all stored processed [WorkspaceModel](../../../com.hyprsync.parser.models/-workspace-model/index.html) |
| [insetInto](inset-into.html) | [jvm]<br>private fun [insetInto](inset-into.html)(workspaceModel: [WorkspaceModel](../../../com.hyprsync.parser.models/-workspace-model/index.html))<br>Use to insert processed workspace into `workspaceStore`. |
