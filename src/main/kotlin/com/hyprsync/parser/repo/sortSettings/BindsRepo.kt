package com.hyprsync.parser.repo.sortSettings

import com.hyprsync.parser.models.*

internal class BindsRepo {

    private companion object BindStore {

        private val bindsStore = mutableListOf<BindsModel>()

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


        private fun insertIntoError(keyword: String, errorBindSettings: ErrorBindSettings, comment: String? = null) {
            bindsStore.add(
                BindsModel(
                    keyword = keyword,
                    errorBindSettings = errorBindSettings,
                    comment = comment
                )
            )
        }


        private fun getAllBinds(): List<BindsModel> {
            return bindsStore.toList()
        }

    }


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


    fun cashBindSettings(): List<BindsModel> {
        return getAllBinds()
    }

}