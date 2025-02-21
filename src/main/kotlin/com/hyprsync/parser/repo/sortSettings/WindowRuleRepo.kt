package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.KeyValueMetaDataModel
import com.hyprsync.parser.models.WindowRuleModel
import io.github.oshai.kotlinlogging.KotlinLogging

/**
 *
 * ###### [WindowRuleRepo]
 *
 * This use to store and get back processed `window rule`.
 *
 * ***Store*** - companion object `windowStore`
 *
 * Models
 * 1. [processSort]
 * 2. [cashWindowSettings]
 *
 */
internal class WindowRuleRepo {

    private val logger = KotlinLogging.logger(javaClass.name)

    /**
     * This uses to store processed window rules.
     */
    private companion object WindowRuleStore {

        /**
         * This use for store window rules
         */
        private val windowRuleStore = mutableListOf<WindowRuleModel>()

        /**
         * This uses to insert window rules into `windowRuleStore`.
         */
        private fun insertInto(windowRuleModel: WindowRuleModel) {
            windowRuleStore.add(windowRuleModel)
        }

        /**
         * This uses to get all window rules into `windowRuleStore`.
         */
        private fun getAll(): List<WindowRuleModel> {
            return windowRuleStore.toList()
        }
    }

    /**
     * This uses to process default key value binds into processed `bind settings`
     *
     * @param keyValueMetaDataModel as Type [KeyValueMetaDataModel]
     */
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

    /**
     * This uses to get all processed settings from the store.
     *
     * @return [List]<[WindowRuleRepo]>
     */
    fun cashWindowSettings(): List<WindowRuleModel> {
        return getAll()
    }

}