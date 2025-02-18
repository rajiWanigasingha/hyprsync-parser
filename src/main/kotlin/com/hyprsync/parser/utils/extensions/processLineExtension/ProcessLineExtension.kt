package com.hyprsync.parser.utils.extensions.processLineExtension

/**
 *
 * ###### Extension For Processing A Line
 *
 * This check if line of string is empty or a comment line, and it trims if there is
 * any space on the begging and end.
 *
 * @return [String] or `null`, null if it is empty or a comment.
 *
 */
fun String.processLine() :String? {
    this
        .trim()
        .takeIf { it.isEmpty() }
        ?.let {
            return null
        }

    this
        .trim()
        .let {
            if(it.first() == '#') {
                return null
            }
        }

    return this
}