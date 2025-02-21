package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.ExecuteModel
import com.hyprsync.parser.models.KeyValueMetaDataModel
import io.github.oshai.kotlinlogging.KotlinLogging

/**
 *
 * ###### [ExecuteRepo]
 *
 * This use to store processed execute settings.
 *
 * ***Store*** - Companion object [ExecuteStore]
 *
 * Method
 * 1. [processSort]
 * 2. [cashExecuteSettings]
 *
 */
internal class ExecuteRepo {

    /**
     * This uses to store process `Execute` settings.
     */
    private companion object ExecuteStore {

        /**
         * This is uses to store execute settings.
         *
         * Type [mutableListOf]<[ExecuteModel]>
         */
        private val executeStore = mutableListOf<ExecuteModel>()

        /**
         * This uses to insert processed `execute` settings into [executeStore]
         */
        private fun insertInto(executeModel: ExecuteModel) {
            executeStore.add(executeModel)
        }

        /**
         * This uses to get all processed `execute` settings from [executeStore]
         */
        private fun getAll(): List<ExecuteModel> {
            return executeStore.toList()
        }
    }

    private val logger = KotlinLogging.logger(javaClass.name)

    /**
     * Use to process meta-data key value settings as [KeyValueMetaDataModel].
     *
     * @param executeSettings as Type [KeyValueMetaDataModel]
     */
    fun processSort(executeSettings: KeyValueMetaDataModel) {
        executeSettings
            .takeIf { it.amountArgs == 1 }
            ?.let {
                insertInto(
                    executeModel = ExecuteModel(
                        keyword = executeSettings.keyword,
                        command = executeSettings.args[0].ifEmpty { null },
                        comment = executeSettings.comment
                    )
                )
            }
    }

    /**
     * Use to get all processed execute settings.
     *
     * @return [List]<[ExecuteModel]>
     */
    fun cashExecuteSettings(): List<ExecuteModel> {
        return getAll()
    }

}