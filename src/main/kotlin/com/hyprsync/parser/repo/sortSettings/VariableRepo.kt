package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.KeyValueMetaDataModel
import com.hyprsync.parser.models.VariableModel

/**
 * ###### [VariableRepo]
 *
 * This uses to store and get back processed variable settings.
 *
 * ***Store*** - companion object `variable store`
 *
 */
internal class VariableRepo {

    /**
     * This uses to store process variables.
     */
    private companion object VariableStore {

        /**
         * This uses to store processed variable settings
         */
        private val variableStore = mutableListOf<VariableModel>()

        /**
         * This uses to insert processed variable settings into variable store.
         */
        private fun insertInto(variableModel: VariableModel) {
            variableStore.add(variableModel)
        }

        /**
         * This uses to get all processed variables.
         */
        private fun getAll(): List<VariableModel> {
            return variableStore.toList()
        }
    }

    /**
     * This uses to process default key value paris into variable settings.
     *
     * @param keyValueMetaDataModel as Type [KeyValueMetaDataModel]
     */
    fun processSort(keyValueMetaDataModel: KeyValueMetaDataModel) {
        insertInto(
            VariableModel(
                keyword = keyValueMetaDataModel.keyword,
                value = keyValueMetaDataModel.args[0],
                comment = keyValueMetaDataModel.comment
            )
        )
    }

    /**
     * This uses to get all processed variable settings.
     *
     * @return [List]<[VariableModel]>
     */
    fun cashVariableSettings(): List<VariableModel> {
        return getAll()
    }

}