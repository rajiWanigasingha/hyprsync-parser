package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.*

/**
 *
 * ###### [MonitorRepo]
 *
 * This uses to store `monitor` settings in monitor store.
 *
 * ***Store*** Companies object `MonitorStore`
 *
 * Methods,
 * 1. [processSort]
 * 2. [cashMonitorSettings]
 *
 */
internal class MonitorRepo {

    /**
     * This uses store and gets back processed monitor settings.
     */
    private companion object MonitorStore {

        /**
         * This uses to store monitor settings
         */
        private val monitorStore = mutableListOf<MonitorModel>()

        /**
         * Use to insert processed [defaultSettings] binds to [monitorStore].
         *
         * @param keyword as Type [String]
         * @param defaultSettings as Type [DefaultMonitorSettings]
         * @param comment as Type [String] or `null`
         */
        private fun insertIntoDefault(keyword: String, defaultSettings: DefaultMonitorSettings ,comment: String?) {
            monitorStore.add(
                MonitorModel(
                    keyword = keyword,
                    defaultMonitorSettings = defaultSettings,
                    comment = comment
                )
            )
        }

        /**
         * Use to insert processed [extraMonitorSettings] binds to [monitorStore].
         *
         * @param keyword as Type [String]
         * @param extraMonitorSettings as Type [ExtraMonitorSettings]
         * @param comment as Type [String] or `null`
         */
        private fun insertIntoExtra(keyword: String ,extraMonitorSettings: ExtraMonitorSettings ,comment: String?) {
            monitorStore.add(
                MonitorModel(
                    keyword = keyword,
                    extraMonitorSettings = extraMonitorSettings,
                    comment = comment
                )
            )
        }

        /**
         * Use to insert processed [errorMonitorSettings] binds to [monitorStore].
         *
         * @param keyword as Type [String]
         * @param errorMonitorSettings as Type [ErrorMonitorSettings]
         */
        private fun insertError(keyword: String ,errorMonitorSettings: ErrorMonitorSettings) {
            monitorStore.add(
                MonitorModel(
                    keyword = keyword,
                    errorMonitorSettings = errorMonitorSettings
                )
            )
        }

        /**
         * Use to get all processed `monitor` settings.
         *
         * @return [List]<[MonitorModel]>
         */
        private fun getAll(): List<MonitorModel> {
            return monitorStore.toList()
        }
    }

    /**
     * This uses to process default key value settings into monitor store.
     *
     * @param keyValueMetaDataModel as Type [KeyValueMetaDataModel]
     */
    fun processSort(keyValueMetaDataModel: KeyValueMetaDataModel) {

        when(keyValueMetaDataModel.amountArgs) {
            4 -> {
                insertIntoDefault(
                    keyValueMetaDataModel.keyword,
                    DefaultMonitorSettings(
                        name = keyValueMetaDataModel.args[0].ifEmpty { "Monitor Name Is Auto Detected" },
                        resolution = keyValueMetaDataModel.args[1],
                        position = keyValueMetaDataModel.args[2],
                        scale = keyValueMetaDataModel.args[3]
                    ),
                    comment = keyValueMetaDataModel.comment
                )
            }

            2,  in 4..10 -> {
                insertIntoExtra(
                    keyword = keyValueMetaDataModel.keyword,
                    extraMonitorSettings = ExtraMonitorSettings(args = keyValueMetaDataModel.args),
                    comment = keyValueMetaDataModel.comment
                )
            }

            else -> {
                insertError(
                    keyword = keyValueMetaDataModel.keyword,
                    errorMonitorSettings = ErrorMonitorSettings(message = "Invalid number of args" , args = keyValueMetaDataModel.args)
                )
            }
        }

    }

    /**
     * This uses to get all monitor settings from the monitor store.
     *
     * @return [List]<[MonitorModel]>
     */
    fun cashMonitorSettings(): List<MonitorModel> {
        return getAll()
    }
}