package com.hyprsync.parser.core.genMetaData

/**
 *
 * ##### [GenerateMetaDataInterface]
 *
 * This gives a structure to generate meta-data interface.
 *
 * Methods to use,
 * 1. [genForKeyValuePair]
 * 2. [genForHyprlang]
 *
 */
interface GenerateMetaDataInterface {

    /**
     * Use for generating meta data for key value pairs.
     *
     * @param keyValue as Type [List]<[String]>
     */
    fun genForKeyValuePair(keyValue: List<String>)

    /**
     * Use for generating meta data for hyprlang code block.
     *
     * @param hyprlang as Type [Map]<[String] ,[List]<[String]>>
     */
    fun genForHyprlang(hyprlang: Map<String ,List<String>>)

}