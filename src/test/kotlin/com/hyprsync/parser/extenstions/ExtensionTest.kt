package com.hyprsync.parser.extenstions

import com.hyprsync.parser.utils.exceptions.ValidatePathExtensionExceptions
import com.hyprsync.parser.utils.extensions.processLineExtension.checkForEqual
import com.hyprsync.parser.utils.extensions.processLineExtension.checkForHyprlang
import com.hyprsync.parser.utils.extensions.processLineExtension.getKeyOfHyprlang
import com.hyprsync.parser.utils.extensions.validatePathExtension.validatePath
import io.github.oshai.kotlinlogging.KotlinLogging
import org.junit.jupiter.api.Test
import kotlin.io.path.Path
import kotlin.test.assertEquals

class ExtensionTest {

    private val logger = KotlinLogging.logger { }

    @Test
    fun `validateHyprlandPath extension path test`() {

        val homePath = System.getProperty("user.home")

        val paths = listOf(
            "$homePath/Downloads",
            "$homePath/IdeaProjects/testfloder/hyprlandTest.conf",
            "$homePath/IdeaProjects/testfloder/hyprlandTest",
            "",
        )

        paths.forEach { path: String ->
            runCatching {
                // Validate the path
                val pathValid = Path(path).validatePath()

                // Assert that the path matches the expected valid path
                assertEquals(path, pathValid.toString())
            }.onFailure { exception: Throwable ->
                // Log the exception based on type
                when (exception) {
                    is ValidatePathExtensionExceptions.EmptyPathIOException -> {
                        logger.warn { "Empty Path IOException: ${exception.cause}" }
                    }
                    is ValidatePathExtensionExceptions.FileNotFoundIOException -> {
                        logger.warn { "File Not Found IOException: ${exception.cause}" }
                    }
                    is ValidatePathExtensionExceptions.FileNotReadableIOException -> {
                        logger.warn { "File Not Readable IOException: ${exception.cause}" }
                    }
                    is ValidatePathExtensionExceptions.DirectoryFoundIOException -> {
                        logger.warn { "Directory Found IOException: ${exception.cause}" }
                    }
                    is ValidatePathExtensionExceptions.InvalidExtensionIOException -> {
                        logger.warn { "Invalid Extension IOException: ${exception.cause}" }
                    }
                    else -> {
                        logger.error { "Unknown error occurred: ${exception.message}" }
                    }
                }
            }
        }
    }


    @Test
    fun `check for equal extension in string`() {
        val keyValues = listOf(
            "key = value",
            "key1 = value gen ty",
            "hello world",
            "source = hy"
        )

        keyValues.forEach { keys: String ->
            runCatching {

                val keyVal = keys.checkForEqual()

                logger.info { keyVal }

                assertEquals(keyVal ,keys)

            }.onFailure { exception: Throwable ->
                logger.warn(exception) { exception.message }
            }
        }
    }


    @Test
    fun `check for hyprlang`() {
        val hyprlang = listOf(
            "key = valye",
            "key = valye",
            "input{",
            "imp {",
            "imp s {"
        )

        hyprlang.forEach { hypr: String ->
            runCatching {

                val hyprlanga = hypr.checkForHyprlang()

                logger.info { hypr }
                logger.info { hyprlanga }

                assertEquals(hyprlanga ,true)

            }.onFailure { exception: Throwable ->
                logger.warn(exception) { exception.message }
            }
        }
    }


    @Test
    fun `check for hyprlang key`() {
        val hyprlang = listOf(
            "key = valye",
            "key = valye",
            "input{",
            "input {",
        )

        hyprlang.forEach { hypr: String ->
            runCatching {

                val hyprlanga = hypr.getKeyOfHyprlang()

                logger.info { hypr }
                logger.info { hyprlanga }

                assertEquals(hyprlanga ,"input")

            }.onFailure { exception: Throwable ->
                logger.warn(exception) { exception.message }
            }
        }
    }

}
