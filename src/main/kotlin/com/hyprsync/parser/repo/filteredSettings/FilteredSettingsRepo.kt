package com.hyprsync.parser.repo.filteredSettings

import com.hyprsync.parser.models.SettingsStoreStatus
import io.github.oshai.kotlinlogging.KotlinLogging


internal class FilteredSettingsRepo : FilterSettingsRepoInterface {

    private companion object Store {

        private val logger = KotlinLogging.logger("KeyValueStore -")

        private val keyValuePairStore = mutableListOf<String>()

        private val hyprLangStore = mutableMapOf<String ,MutableList<String>>()

        private fun insertKeyValueStore(record: List<String>): Result<Boolean> = runCatching {

            keyValuePairStore.addAll(record)

            return Result.success(true)

        }.onFailure { exception: Throwable ->
            logger.error(exception) { exception.message }

            throw exception
        }


        private fun getKeyValueStore() : List<String> {
            return keyValuePairStore.toList()
        }


        private fun insertHyprlangStore(hyprlang : MutableMap<String ,MutableList<String>>): Result<Boolean> = runCatching {
            hyprLangStore.putAll(hyprlang)

            return Result.success(true)
        }.onFailure { exception: Throwable ->
            logger.error(exception) { exception.message }

            throw exception
        }


        private fun getHyprlang() :MutableMap<String ,MutableList<String>> {
            return hyprLangStore
        }
    }

    override fun insertKeyValue(records: List<String>): SettingsStoreStatus? {

        records
            .takeIf { it.isEmpty() }
            ?.let {
                return null
            }

        insertKeyValueStore(records)
            .fold(

                onSuccess = {
                    return SettingsStoreStatus(true)
                },

                onFailure = { exception: Throwable ->
                    return SettingsStoreStatus(false, exception.message.toString())
                }
            )
    }

    override fun getKeyValues(): List<String> {
        return getKeyValueStore()
    }

    override fun insertHyprlang(records: MutableMap<String, MutableList<String>>): SettingsStoreStatus? {
        records
            .takeIf { it.isEmpty() }
            ?.let {
                return null
            }

        insertHyprlangStore(records)
            .fold(

                onSuccess = {
                    return SettingsStoreStatus(true)
                },

                onFailure = { exception: Throwable ->
                    return SettingsStoreStatus(false, exception.message.toString())
                }
            )
    }

    override fun getHyprland(): MutableMap<String, MutableList<String>> {
        return getHyprlang()
    }

}