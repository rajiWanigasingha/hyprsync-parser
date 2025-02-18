package com.hyprsync.parser.repo.metaData

import com.hyprsync.parser.models.HyprlangMetaData
import com.hyprsync.parser.models.KeyValueMetaDataModel

/**
 *
 * ###### [MetaDataRepoInterface]
 *
 * This uses for given structure for metadata repo.
 *
 * Methods To Use,
 * 1. [insertIntoKeyValue]
 * 2. [getAllKeyValues]
 * 3. [insertIntoHyprlang]
 * 4. [getAllHyprlang]
 */
interface MetaDataRepoInterface {

    /**
     * This use for insert value into key value store
     *
     * @param data as Type [List]<[KeyValueMetaDataModel]>
     */
    fun insertIntoKeyValue(data: List<KeyValueMetaDataModel>)

    /**
     * This uses to get all key values from the store.
     *
     * @return [List]<[KeyValueMetaDataModel]>
     */
    fun getAllKeyValues() : List<KeyValueMetaDataModel>

    /**
     * This uses to insert hyprlang code block into hyprlang store.
     *
     * @param data as Type [HyprlangMetaData]
     */
    fun insertIntoHyprlang(data: HyprlangMetaData)

    /**
     * This uses to get all the hyprlang store.
     *
     * @return [MutableList]<[HyprlangMetaData]>
     */
    fun getAllHyprlang() :  MutableList<HyprlangMetaData>
}