package com.hyprsync.parser.utils.extensions.validatePathExtension

import com.hyprsync.parser.utils.exceptions.ValidatePathExtensionExceptions
import io.github.oshai.kotlinlogging.KotlinLogging
import java.nio.file.Path
import kotlin.io.path.exists
import kotlin.io.path.extension
import kotlin.io.path.isDirectory
import kotlin.io.path.isReadable

private val logger = KotlinLogging.logger("Path validate extension")

/**
 *
 * ###### Extension For Path Validation
 *
 * Extension for [Path] Type and use to validate `path`.
 *
 * Use to validate given `path`,
 * 1. Check if it's empty
 * 2. Check if it exists,
 * 3. Check if it's not a directory.
 * 4. Check if it's readable.
 * 5. Check if its extension is `.conf`
 *
 * @throws ValidatePathExtensionExceptions.EmptyPathIOException
 * - If the file is empty.
 * @throws ValidatePathExtensionExceptions.FileNotFoundIOException
 * - If the file not found.
 * @throws ValidatePathExtensionExceptions.FileNotReadableIOException
 * - If the file not readable.
 * @throws ValidatePathExtensionExceptions.DirectoryFoundIOException
 * - If it is a directory, not a file.
 * @throws ValidatePathExtensionExceptions.InvalidExtensionIOException
 * - If file extension is not `.conf`
 *
 */
internal fun Path.validatePath(): Path {

    // Check for an empty path.
    this
        .takeIf { it.toString().isEmpty() }
        ?.let {
            logger.error { "File path is empty" }
            throw ValidatePathExtensionExceptions.EmptyPathIOException()
        }

    // Check if the file path, doesn't exist
    this
        .exists()
        .takeUnless { it }
        ?.let {
            logger.error { "File dose not exist" }
            throw ValidatePathExtensionExceptions.FileNotFoundIOException(this)
        }

    // Check if the file path is a directory.
    this
        .isDirectory()
        .takeUnless { !it }
        ?.let {
            logger.error { "Path need to be a file not a directory" }
            throw ValidatePathExtensionExceptions.DirectoryFoundIOException(this)
        }

    // Check if the file is readable.
    this
        .isReadable()
        .takeUnless { it }
        ?.let {
            logger.error { "File is not readable" }
            throw ValidatePathExtensionExceptions.FileNotReadableIOException(this)
        }

    // Check if the file has .conf extension.
    this
        .extension
        .takeUnless { it == "conf" }
        ?.let {
            logger.error { "Invalid file type. Need to have .conf extension" }
            throw ValidatePathExtensionExceptions.InvalidExtensionIOException(this)
        }

    return this
}