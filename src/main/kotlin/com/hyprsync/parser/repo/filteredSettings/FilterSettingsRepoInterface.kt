package com.hyprsync.parser.repo.filteredSettings

import com.hyprsync.parser.models.SettingsStoreStatus

interface FilterSettingsRepoInterface {

    fun insertKeyValue(records: List<String>) : SettingsStoreStatus?

    fun getKeyValues() : List<String>

    fun insertHyprlang(records: MutableMap<String ,MutableList<String>>) : SettingsStoreStatus?

    fun getHyprland() : MutableMap<String ,MutableList<String>>
}