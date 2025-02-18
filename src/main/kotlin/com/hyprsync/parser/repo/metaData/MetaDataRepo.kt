package com.hyprsync.parser.repo.metaData

import com.hyprsync.parser.models.HyprlangMetaData
import com.hyprsync.parser.models.KeyValueMetaDataModel
import io.github.oshai.kotlinlogging.KotlinLogging

/**
 *
 * ###### [MetaDataRepo]
 *
 * This use to store and query data that has been store, and it is inhabited from
 * [MetaDataRepoInterface].
 *
 * Methods that can be used
 * 1. [insetIntoKeyValueStore]
 * 2. [getAllKeyValueStore]
 * 3. [insertIntoHyprlangStore]
 * 4. [getHyprlangStore]
 *
 */
class MetaDataRepo : MetaDataRepoInterface {

    /**
     * Use to store filtered meta-data that can be accessed globally inside the library.
     *
     * Store meta-data store,
     * 1. [keyValueMetaDataStore] as Type [MutableList]<[KeyValueMetaDataModel]>
     * 2. [hyprlangMetaDataStore] as Type [MutableList]<[HyprlangMetaData]>
     *
     * Methods to use,
     * 1. [insetIntoKeyValueStore]
     * 2. [getAllKeyValueStore]
     * 3. [insertIntoHyprlangStore]
     * 4. [getHyprlangStore]
     */
    private companion object MeatDataObject {

        private val logger = KotlinLogging.logger("MetaDataStore")

        /**
         * Store Key value meta data as type [MutableList]<[KeyValueMetaDataModel]>
         */
        private val keyValueMetaDataStore : MutableList<KeyValueMetaDataModel> = mutableListOf()

        /**
         * Store hyprland meta data as type [MutableList]<[HyprlangMetaData]>
         */
        private val hyprlangMetaDataStore : MutableList<HyprlangMetaData> = mutableListOf()

        /**
         * Use to store insert key value data in [keyValueMetaDataStore]
         *
         * @param data as Type [List]<[KeyValueMetaDataModel]>
         */
        private fun insetIntoKeyValueStore(data: List<KeyValueMetaDataModel>) {
            keyValueMetaDataStore.addAll(data)
        }

        /**
         * Use to get all from key value store in [hyprlangMetaDataStore]
         *
         * @return [List]<[KeyValueMetaDataModel]>
         */
        private fun getAllKeyValueStore(): List<KeyValueMetaDataModel> {
            return keyValueMetaDataStore.toList()
        }

        /**
         * Use to insert hyprlang to store in [hyprlangMetaDataStore]
         *
         * @param data as Type [HyprlangMetaData]
         */
        private fun insertIntoHyprlangStore(data: HyprlangMetaData) {
            hyprlangMetaDataStore.add(data)
        }

        /**
         * Use to get all hyprlang from store [hyprlangMetaDataStore]
         *
         * @return [MutableList]<[HyprlangMetaData]>
         */
        private fun getHyprlangStore(): MutableList<HyprlangMetaData> {
            return hyprlangMetaDataStore
        }

    }

    override fun insertIntoKeyValue(data: List<KeyValueMetaDataModel>) {
        insetIntoKeyValueStore(data)
    }

    override fun getAllKeyValues(): List<KeyValueMetaDataModel> {
        return getAllKeyValueStore()
    }

    override fun insertIntoHyprlang(data: HyprlangMetaData) {
        insertIntoHyprlangStore(data)
    }

    override fun getAllHyprlang(): MutableList<HyprlangMetaData> {
        return getHyprlangStore()
    }
}