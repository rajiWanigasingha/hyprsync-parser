package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.KeyValueMetaDataModel
import com.hyprsync.parser.models.VariableModel

internal class VariableRepo {

    private companion object VariableStore {

        private val variableStore = mutableListOf<VariableModel>()

        private fun insertInto(variableModel: VariableModel) {
            variableStore.add(variableModel)
        }

        private fun getAll(): List<VariableModel> {
            return variableStore.toList()
        }
    }

    fun processSort(keyValueMetaDataModel: KeyValueMetaDataModel) {
        insertInto(
            VariableModel(
                keyword = keyValueMetaDataModel.keyword,
                value = keyValueMetaDataModel.args[0],
                comment = keyValueMetaDataModel.comment
            )
        )
    }

    fun cashVariableSettings(): List<VariableModel> {
        return getAll()
    }

}