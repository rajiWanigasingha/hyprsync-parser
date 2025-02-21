package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.HyprlangValuesModel

/**
 * ###### [HyprlangRepo]
 *
 * This uses to store and get back processed hyprlang settings.
 *
 * ***Store*** - companion object `HyprlandStore`
 *
 * Methods
 * 1. [processSort]
 * 2. [cacheHyprlangSettings]
 *
 */
internal class HyprlangRepo {

    /**
     * This uses to store process and gets back settings
     */
    private companion object HyprlangStore {

        /**
         * Use to store processed [HyprlangValuesModel] values
         */
        private val hyprlangStore = mutableListOf<HyprlangValuesModel>()

        /**
         * Use to insert new [HyprlangValuesModel] into store
         */
        private fun insertInto(hyprlang: List<HyprlangValuesModel>) {
            hyprlangStore.addAll(hyprlang)
        }

        /**
         * Use to get all processed values that has been stored
         */
        private fun getAll(): List<HyprlangValuesModel> {
            return hyprlangStore.toList()
        }

    }

    /**
     * Process and store hyprlang values
     *
     * @param hyprlang as Type [List]<[HyprlangValuesModel]>
     */
    fun processSort(hyprlang: List<HyprlangValuesModel>) {
        insertInto(hyprlang)
    }

    /**
     * Get all the stored processed hyprlang value
     *
     * @return [List]<[HyprlangValuesModel]>
     */
    fun cacheHyprlangSettings(): List<HyprlangValuesModel> {
        return getAll()
    }

}