package com.hyprsync.parser.utils.extensions.processKeyValuesExtension

import com.hyprsync.parser.models.ProcessKeyValueExtensionModel

/**
 *
 * Use as an extension of `String`.
 * This uses for separating key from the value and comment if it exists.
 *
 * @return [ProcessKeyValueExtensionModel]
 *
 */
internal fun String.processKeyValueMetaData(): ProcessKeyValueExtensionModel {

    var key = ""
    var value = ""
    var comment: String? = null

    this
        .trim()
        .split("=")
        .let {

            key = it[0].trim()

            it[1]
                .trim()
                .split("#")
                .let { values ->

                    if (values.size == 2) {
                        value = values[0].trim()
                        comment = values[1].trim()
                    } else {
                        value = values[0]
                    }

                }

            return ProcessKeyValueExtensionModel(
                keyword = key,
                values = value,
                comment = comment
            )
        }

}