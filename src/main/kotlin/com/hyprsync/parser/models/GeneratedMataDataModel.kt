package com.hyprsync.parser.models

/**
 * Key value meta data model store.
 *
 * @param [keyword] as Type [String]
 * @param [amountArgs] as Type [Int]
 * @param [args] as Type [List]<[String]>
 * @param [comment] as Type [String] || `null`
 */
data class KeyValueMetaDataModel(
    val keyword: String,
    val amountArgs: Int,
    val args: List<String>,
    val comment: String?
)

/**
 * Way to store processed key values
 *
 * @param [keyword] as Type [String]
 * @param [values] as Type [String]
 * @param [comment] as Type [String] || `null`
 */
data class ProcessKeyValueExtensionModel(
    val keyword: String,
    val values: String,
    val comment: String?
)

/**
 * Hyprlang meta data model store
 *
 * @param [hyprKey] as Type [String]
 * @param [codeBlock] as Type [List]<[KeyValueMetaDataModel]>
 */
data class HyprlangMetaData(
    val hyprKey: String,
    val codeBlock : List<KeyValueMetaDataModel>
)