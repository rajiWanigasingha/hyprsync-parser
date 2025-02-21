package com.hyprsync.parser.core.sortSettings

import com.hyprsync.parser.models.HyprlandSettings
import com.hyprsync.parser.models.HyprlangMetaData
import com.hyprsync.parser.models.HyprlangValuesModel
import com.hyprsync.parser.models.KeyValueMetaDataModel
import com.hyprsync.parser.repo.metaData.MetaDataRepoInterface
import com.hyprsync.parser.repo.sortSettings.*
import com.hyprsync.parser.repo.sortSettings.BindsRepo
import com.hyprsync.parser.repo.sortSettings.EnvironmentRepo
import com.hyprsync.parser.repo.sortSettings.ExecuteRepo
import com.hyprsync.parser.repo.sortSettings.MonitorRepo
import io.github.oshai.kotlinlogging.KotlinLogging

/**
 *
 * ###### [SortSettings] Core Api
 *
 * This sort meta-data values created by meta-data core api inhabited by [MetaDataRepoInterface].
 *
 * Methods,
 * 1. [sortKeyValue]
 * 2. [sortHyprlandValue]
 *
 * @constructor [metaDataRepo] as ang class inhabited by [MetaDataRepoInterface]
 */
internal class SortSettings(
    private val metaDataRepo: MetaDataRepoInterface
) {

    private val logger = KotlinLogging.logger(javaClass.name)

    /**
     * This uses to sort key value meta-data settings.
     *
     * Sort key values,
     * 1. `exec` ,`exec-once` ,`exec-shutdown`
     * 2. `env`
     * 3. `monitor`
     * 4. `workspace`
     * 5. `bind`
     * 6. `windowrule` ,`windowrulev2`
     * 7. `variables`
     *
     */
    fun sortKeyValue() {
        metaDataRepo
            .getAllKeyValues()
            .forEach { keyValueMetaDataModel: KeyValueMetaDataModel ->
                when {
                    keyValueMetaDataModel.keyword in listOf("exec", "exec-once" ,"exec-shutdown") -> ExecuteRepo().processSort(keyValueMetaDataModel)

                    keyValueMetaDataModel.keyword == "env" -> EnvironmentRepo().processSort(keyValueMetaDataModel)

                    keyValueMetaDataModel.keyword == "monitor" -> MonitorRepo().processSort(keyValueMetaDataModel)

                    keyValueMetaDataModel.keyword == "workspace" -> WorkspaceRepo().processSort(keyValueMetaDataModel)

                    keyValueMetaDataModel.keyword.matches(Regex("""^bind[lroentmisdp]*""")) -> BindsRepo().processSort(keyValueMetaDataModel)

                    keyValueMetaDataModel.keyword in listOf("windowrule", "windowrulev2") -> WindowRuleRepo().processSort(keyValueMetaDataModel)

                    keyValueMetaDataModel.keyword.matches(Regex("""\$\w+""")) -> VariableRepo().processSort(keyValueMetaDataModel)
                }
            }
    }


    /**
     * This uses to sort hyprlang settings
     *
     * Sort key value
     * 1. Input
     * 2. Animations
     * 3. Decorations
     * 4. And many more
     *
     *
     */
    fun sortHyprlandValue() {
        val hyprKeyValue = mutableListOf<HyprlangValuesModel>()

        metaDataRepo
            .getAllHyprlang()
            .forEach { hyprlangMetaData: HyprlangMetaData ->
                hyprlangMetaData
                    .codeBlock
                    .forEach { keyValueMetaDataModel: KeyValueMetaDataModel ->
                        if (hyprKeyValue.isNotEmpty() && hyprKeyValue.last().masterKeyword == hyprlangMetaData.hyprKey) {
                            hyprKeyValue
                                .last()
                                .hyprlandSettings
                                .add(
                                    HyprlandSettings(
                                        keyword = keyValueMetaDataModel.keyword,
                                        result = keyValueMetaDataModel.args,
                                        comment = keyValueMetaDataModel.comment
                                    )
                                )

                        } else {
                            hyprKeyValue.add(
                                HyprlangValuesModel(
                                    masterKeyword = hyprlangMetaData.hyprKey,
                                    hyprlandSettings = mutableListOf(
                                        HyprlandSettings(
                                            keyword = keyValueMetaDataModel.keyword,
                                            result = keyValueMetaDataModel.args,
                                            comment = keyValueMetaDataModel.comment
                                        )
                                    )
                                )
                            )

                        }
                    }
            }

        HyprlangRepo().processSort(hyprKeyValue)
    }

}