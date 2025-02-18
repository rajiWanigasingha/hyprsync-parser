package com.hyprsync.parser.utils.extensions.processLineExtension

/**
 * ###### Extension For Checking Hyprland
 *
 * Check if a line is the beginning of hyprlang settings block.
 *
 * @return [Boolean], `true` if it is a hyprlang or else `false`
 *
 */
fun String.checkForHyprlang(): Boolean {
    this
        .trim()
        .split(" ")
        .also { println(it) }
        .takeIf { it.size in 0..2 }
        ?.let {
            it.last().endsWith('{')

            return true
        }
        ?: return false
}

/**
 *
 * ###### Extension For Getting Key Of Code Block
 *
 * This use for getting the key of a hyprlang code block.
 *
 * Ex: input { ... } -> Key is `input`
 *
 * @return [String]
 *
 */
fun String.getKeyOfHyprlang() :String {
    this
        .trim()
        .split(" ")
        .let {

            if (it.last() == "{") {
                return it[0].trim()
            } else {

                val key = it[0]

                key
                    .last()
                    .takeIf { last: Char -> last == '{' }
                    ?.let {
                        return key.dropLast(1)
                    }
                    ?: return key
            }
        }
}