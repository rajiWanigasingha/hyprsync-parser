package com.hyprsync.parser.utils.exceptions

sealed class FilterSettingsStoreException {

    class KeyValueStoreInsertException : Exception("Could not store key value pairs.")

    class HyprlangStoreInsertException : Exception("Could not store hyprlang block.")
}