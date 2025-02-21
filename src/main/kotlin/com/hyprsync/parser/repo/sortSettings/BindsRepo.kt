package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.*

/**
 *
 * ###### [BindsRepo]
 *
 * This uses to store and get all processed bind settings.
 *
 * ***Store*** - companion object `Bind Store`
 *
 * Methods
 * 1. [processSort]
 * 2. [cashBindSettings]
 *
 */
internal class BindsRepo {

    private companion object BindStore {

        /**
         * Use to store processed `bind settings`.
         */
        private val bindsStore = mutableListOf<BindsModel>()

        /**
         * Use to insert default bind settings into [bindsStore].
         */
        private fun insertIntoDefault(
            keyword: String,
            defaultBindSettings: DefaultBindSettings,
            comment: String? = null
        ) {
            bindsStore.add(
                BindsModel(
                    keyword = keyword,
                    defaultBindSettings = defaultBindSettings,
                    comment = comment
                )
            )
        }

        /**
         * Use to insert extra args bind settings into [bindsStore]
         */
        private fun insertIntoExtraArgs(
            keyword: String,
            extraBindSettings: ExtraBindSettings,
            comment: String? = null
        ) {
            bindsStore.add(
                BindsModel(
                    keyword = keyword,
                    extraBindSettings = extraBindSettings,
                    comment = comment
                )
            )
        }


        /**
         * Use to insert error bind settings into [bindsStore]
         */
        private fun insertIntoError(keyword: String, errorBindSettings: ErrorBindSettings, comment: String? = null) {
            bindsStore.add(
                BindsModel(
                    keyword = keyword,
                    errorBindSettings = errorBindSettings,
                    comment = comment
                )
            )
        }

        /**
         * Use to get processed `bind settings` from [bindsStore]
         */
        private fun getAllBinds(): List<BindsModel> {
            return bindsStore.toList()
        }

    }


    /**
     * This uses to process default key value settings and store them in `bind store`.
     *
     * @param keyValueMetaDataModel as Type [KeyValueMetaDataModel]
     */
    fun processSort(keyValueMetaDataModel: KeyValueMetaDataModel) {

        val bindTypeRegex = """^bind[lroentmisdp]*""".toRegex()

        when {

            keyValueMetaDataModel.amountArgs == 4 && keyValueMetaDataModel.keyword == "bind" -> {
                insertIntoDefault(
                    keyword = keyValueMetaDataModel.keyword,
                    defaultBindSettings = DefaultBindSettings(
                        mods = keyValueMetaDataModel.args[0],
                        key = keyValueMetaDataModel.args[1],
                        dispatcher = keyValueMetaDataModel.args[2],
                        params = keyValueMetaDataModel.args[3]
                    ),
                    comment = keyValueMetaDataModel.comment
                )
            }

            keyValueMetaDataModel.amountArgs < 4 && bindTypeRegex.matches(keyValueMetaDataModel.keyword) -> {

                insertIntoExtraArgs(
                    keyword = keyValueMetaDataModel.keyword,
                    extraBindSettings = ExtraBindSettings(args = keyValueMetaDataModel.args),
                    comment = keyValueMetaDataModel.comment
                )

            }

            else -> {

                insertIntoError(
                    keyword = keyValueMetaDataModel.keyword,
                    ErrorBindSettings(message = "Invalid key bind settings", args = keyValueMetaDataModel.args),
                    comment = keyValueMetaDataModel.comment
                )
            }
        }

    }


    /**
     * Use to get all the stored and processed `bind settings`.
     */
    fun cashBindSettings(): List<BindsModel> {
        return getAllBinds()
    }

}