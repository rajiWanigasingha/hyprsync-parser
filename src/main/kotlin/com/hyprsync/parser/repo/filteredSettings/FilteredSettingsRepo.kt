package com.hyprsync.parser.repo.filteredSettings

import com.hyprsync.parser.models.SettingsStoreStatus
import io.github.oshai.kotlinlogging.KotlinLogging

/**
 * ###### [FilteredSettingsRepo]
 *
 * This use to store and get back processed keu value pairs or hyprlang settings and
 * this inhabited form [FilterSettingsRepoInterface].
 *
 * ***Store*** - companion object `keyValuePairStore` and `hyprLangStore`
 *
 * Method
 * 1. [insertKeyValue]
 * 2. [getKeyValues]
 * 3. [insertHyprlang]
 * 4. [getHyprland]
 */
internal class FilteredSettingsRepo : FilterSettingsRepoInterface {

    /**
     *
     * This will be uses to store and get back processed key value pairs and hyprlang settings.
     */
    private companion object Store {

        private val logger = KotlinLogging.logger("KeyValueStore -")

        /**
         * Use to store key value pairs.
         */
        private val keyValuePairStore = mutableListOf<String>()

        /**
         * Use to store hyprlang values.
         */
        private val hyprLangStore = mutableMapOf<String ,MutableList<String>>()

        /**
         * This use to insert key value records into [keyValuePairStore]
         */
        private fun insertKeyValueStore(record: List<String>): Result<Boolean> = runCatching {

            keyValuePairStore.addAll(record)

            return Result.success(true)

        }.onFailure { exception: Throwable ->
            logger.error(exception) { exception.message }

            throw exception
        }


        /**
         * This use to get all stored key value settings form [keyValuePairStore]
         */
        private fun getKeyValueStore() : List<String> {
            return keyValuePairStore.toList()
        }


        /**
         * This use to insert hyprlang settings into [hyprLangStore]
         */
        private fun insertHyprlangStore(hyprlang : MutableMap<String ,MutableList<String>>): Result<Boolean> = runCatching {
            hyprLangStore.putAll(hyprlang)

            return Result.success(true)
        }.onFailure { exception: Throwable ->
            logger.error(exception) { exception.message }

            throw exception
        }


        /**
         * This use to get all stored hyprlang settings from [hyprLangStore]
         */
        private fun getHyprlang() :MutableMap<String ,MutableList<String>> {
            return hyprLangStore
        }
    }

    /**
     * This uses to process a record and store it in key value store.
     *
     * @param records [List]<[String]>
     * @return [SettingsStoreStatus]
     */
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

    /**
     * This uses to get back stored key value settings.
     *
     * @return [List]<[String]>
     */
    override fun getKeyValues(): List<String> {
        return getKeyValueStore()
    }

    /**
     * This uses to process and store hyprlang settings.
     *
     * @param records as Type [MutableMap]<[String] ,[MutableList]<[String]>>
     * @return [SettingsStoreStatus] or `null`
     */
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

    /**
     * This uses to get all stored hyprlang settings,
     *
     * @return [MutableMap]<[String], [MutableList]<[String]>>
     */
    override fun getHyprland(): MutableMap<String, MutableList<String>> {
        return getHyprlang()
    }

}