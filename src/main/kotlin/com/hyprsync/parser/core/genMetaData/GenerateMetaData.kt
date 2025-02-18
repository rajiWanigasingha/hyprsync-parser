package com.hyprsync.parser.core.genMetaData

import com.hyprsync.parser.models.HyprlangMetaData
import com.hyprsync.parser.models.KeyValueMetaDataModel
import com.hyprsync.parser.repo.metaData.MetaDataRepoInterface
import com.hyprsync.parser.utils.extensions.processKeyValuesExtension.processKeyValueMetaData
import com.hyprsync.parser.utils.extensions.processLineExtension.checkForEqual
import io.github.oshai.kotlinlogging.KotlinLogging

/**
 *
 * ###### [GenerateMetaData]
 *
 * This use to generate meta-data for `Key Value Pair` and `Hyprlang`, and inhered from
 * [GenerateMetaDataInterface].
 *
 * @constructor [metaData] as Type [MetaDataRepoInterface]
 *
 */
class GenerateMetaData(
    private val metaData: MetaDataRepoInterface
) : GenerateMetaDataInterface {

    private val logger = KotlinLogging.logger(javaClass.name)

    override fun genForKeyValuePair(keyValue: List<String>) {

        val metaDataKeyValues = mutableListOf<KeyValueMetaDataModel>()

        keyValue.forEach { results: String ->

            val processKeyValues = results.processKeyValueMetaData()

            val args = processKeyValues.values.split(",")

            metaDataKeyValues.add(
                KeyValueMetaDataModel(
                    keyword = processKeyValues.keyword.ifEmpty { "No Keyword Found" },
                    amountArgs = args.size,
                    args = args,
                    comment = processKeyValues.comment
                )
            )
        }

        metaData.insertIntoKeyValue(metaDataKeyValues)
    }

    override fun genForHyprlang(hyprlang: Map<String, List<String>>) {

        hyprlang.forEach { entry: Map.Entry<String, List<String>> ->

            val hyprlangKeyValues = mutableListOf<KeyValueMetaDataModel>()

            entry
                .value
                .forEach { pair: String ->
                    pair
                        .checkForEqual()
                        ?.processKeyValueMetaData()
                        ?.let { processKeyValueExtensionModel ->

                            val args = processKeyValueExtensionModel.values.split(",")

                            hyprlangKeyValues.add(
                                KeyValueMetaDataModel(
                                    keyword = processKeyValueExtensionModel.keyword,
                                    args = args,
                                    amountArgs = args.size,
                                    comment = processKeyValueExtensionModel.comment
                                )
                            )
                        }
                }


            metaData.insertIntoHyprlang(
                HyprlangMetaData(
                    hyprKey = entry.key,
                    codeBlock = hyprlangKeyValues
                )
            )
        }
    }

}