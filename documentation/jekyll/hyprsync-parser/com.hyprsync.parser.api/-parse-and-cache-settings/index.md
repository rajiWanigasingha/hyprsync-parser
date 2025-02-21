---
title: ParseAndCacheSettings
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.api](../index.html)/[ParseAndCacheSettings](index.html)



# ParseAndCacheSettings



[jvm]\
class [ParseAndCacheSettings](index.html)

#### [ParseAndCacheSettings](index.html)



This uses to parse and cache hyprland settings in .cache folder under `/home/$USER/.cache/com.hyprsync.conf/` this folder.



Methods,



1. 
   [create](create.html)



## Constructors


| | |
|---|---|
| [ParseAndCacheSettings](-parse-and-cache-settings.html) | [jvm]<br>constructor() |


## Properties


| Name | Summary |
|---|---|
| [filteredSettingsRepo](filtered-settings-repo.html) | [jvm]<br>private val [filteredSettingsRepo](filtered-settings-repo.html): [FilteredSettingsRepo](../../com.hyprsync.parser.repo.filteredSettings/-filtered-settings-repo/index.html) |
| [home](home.html) | [jvm]<br>private val [home](home.html): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
| [logger](logger.html) | [jvm]<br>private val [logger](logger.html): KLogger |
| [metaDataRepo](meta-data-repo.html) | [jvm]<br>private val [metaDataRepo](meta-data-repo.html): [MetaDataRepo](../../com.hyprsync.parser.repo.metaData/-meta-data-repo/index.html) |


## Functions


| Name | Summary |
|---|---|
| [create](create.html) | [jvm]<br>fun [create](create.html)(hyprlandSettingsPath: [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html) = Path.of(&quot;$home/.config/hypr/hyprland.conf&quot;))<br>To create process and cache settings. |
