package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.KeyValueMetaDataModel
import com.hyprsync.parser.models.WorkspaceModel
import io.github.oshai.kotlinlogging.KotlinLogging

/**
 *
 * ###### [WorkspaceRepo]
 *
 * This uses to store and get back processed workspace store.
 *
 * ***Store*** - companion object `WorkspaceStore`
 *
 * Methods
 * 1. [processSort]
 * 2. [cashWorkspaceSettings]
 *
 */
internal class WorkspaceRepo {

    private val logger = KotlinLogging.logger(javaClass.name)

    /**
     * This uses to store workspace rule and get back from it.
     */
    private companion object WorkspaceStore {

        /**
         * This uses to store processed workspace rule.
         */
        private val workspaceStore = mutableListOf<WorkspaceModel>()

        /**
         * Use to insert processed workspace into `workspaceStore`.
         *
         * @param workspaceModel as Type [WorkspaceModel]
         */
        private fun insetInto(workspaceModel: WorkspaceModel) {
            workspaceStore.add(workspaceModel)
        }

        /**
         * Use to get all stored processed [WorkspaceModel]
         *
         * @return [List]<[WorkspaceModel]>
         */
        private fun getAll(): List<WorkspaceModel> {
            return workspaceStore.toList()
        }
    }

    /**
     *
     * This use to get default key value settings and processed and store them
     * into `workspace store`
     *
     * @param keyValueMetaDataModel as Type [KeyValueMetaDataModel]
     *
     */
    fun processSort(keyValueMetaDataModel: KeyValueMetaDataModel) {

        keyValueMetaDataModel
            .takeIf { it.amountArgs > 2 }
            ?.let {
                insetInto(
                    workspaceModel = WorkspaceModel(
                        keyword = keyValueMetaDataModel.keyword,
                        workspaceName = keyValueMetaDataModel.args[0],
                        rules = keyValueMetaDataModel.args.subList(1, keyValueMetaDataModel.amountArgs - 1),
                        comment = keyValueMetaDataModel.comment
                    )
                )
            }
    }

    /**
     * This uses to get all settings from `workspace store`.
     *
     * @return [List]<[WorkspaceModel]>
     */
    fun cashWorkspaceSettings(): List<WorkspaceModel> {
        return getAll()
    }

}