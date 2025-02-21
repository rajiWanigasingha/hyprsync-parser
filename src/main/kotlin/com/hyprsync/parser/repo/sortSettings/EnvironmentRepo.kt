package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.EnvironmentModel
import com.hyprsync.parser.models.KeyValueMetaDataModel

/**
 *
 * ###### [EnvironmentRepo]
 *
 * This used to store processed `Environment` settings and get them.
 *
 * ***Store*** - Companion object [EnvironmentStore]
 *
 * Methods,
 * 1. [processSort]
 * 2. [cashEnvSettings]
 *
 */
internal class EnvironmentRepo {

    /**
     * This uses to store `Environment` settings
     */
    private companion object EnvironmentStore {

        /**
         * Use to store processed `Environment` settings for as [mutableListOf]<[EnvironmentModel]>
         */
        private val envStore = mutableListOf<EnvironmentModel>()

        /**
         * This uses to insert new processed `Environment` Settings into [envStore].
         */
        private fun insertInto(env: EnvironmentModel) {
            envStore.add(env)
        }

        /**
         * This uses to get all processed `Environment` settings from [envStore]
         */
        private fun getAll(): List<EnvironmentModel> {
            return envStore.toList()
        }

    }

    /**
     * This uses to process key value `Environment` settings from [KeyValueMetaDataModel].
     *
     * @param sort as Type [KeyValueMetaDataModel]
     */
    fun processSort(sort: KeyValueMetaDataModel) {
        insertInto(
            EnvironmentModel(
                keyword = sort.keyword,
                env = sort.args.joinToString(",").ifEmpty { null },
                comment = sort.comment
            )
        )
    }

    /**
     * This uses to get all settings from env store.
     *
     * @return [List]<[EnvironmentModel]>
     */
    fun cashEnvSettings(): List<EnvironmentModel> {
        return getAll()
    }

}