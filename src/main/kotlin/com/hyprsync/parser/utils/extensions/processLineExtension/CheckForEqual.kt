package com.hyprsync.parser.utils.extensions.processLineExtension

/**
 *
 * ###### Extension For checking Key Value
 *
 * This uses for checking if a string is a key value pair.
 *
 * @return [String] or `null`, null if isn't a key value pair.
 *
 */
fun String.checkForEqual() :String? {

    this
        .count { it == '=' }
        .takeIf { it != 1 }
        ?.let {
            return null
        }

    return this
}