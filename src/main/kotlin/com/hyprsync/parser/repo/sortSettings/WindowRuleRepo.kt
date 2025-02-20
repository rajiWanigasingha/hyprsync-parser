package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.KeyValueMetaDataModel
import com.hyprsync.parser.models.WindowRuleModel
import io.github.oshai.kotlinlogging.KotlinLogging

internal class WindowRuleRepo {

    private val logger = KotlinLogging.logger(javaClass.name)

    private companion object WindowRuleStore {

        private val windowRuleStore = mutableListOf<WindowRuleModel>()

        private fun insertInto(windowRuleModel: WindowRuleModel) {
            windowRuleStore.add(windowRuleModel)
        }

        private fun getAll(): List<WindowRuleModel> {
            return windowRuleStore.toList()
        }
    }

    fun processSort(keyValueMetaDataModel: KeyValueMetaDataModel) {

        keyValueMetaDataModel
            .takeIf { it.amountArgs >= 2 }
            ?.let {
                insertInto(
                    WindowRuleModel(
                        keyword = keyValueMetaDataModel.keyword,
                        window = keyValueMetaDataModel.args[0],
                        rules = keyValueMetaDataModel.args.subList(1, keyValueMetaDataModel.amountArgs),
                        comment = keyValueMetaDataModel.comment
                    )
                )
            }
    }

    fun cashWindowSettings(): List<WindowRuleModel> {
        return getAll()
    }

}