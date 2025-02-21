package com.hyprsync.parser.utils.exceptions

import java.io.IOException
import java.nio.file.Path

/**
 *
 * All Exceptions that can be thrown when `validatePath` used in Path as an extension
 *
 */
sealed class ValidatePathExtensionExceptions {

    /**
     * Throw this when give the path is empty.
     */
    class EmptyPathIOException :
        IOException("Path Is empty", Throwable("Path given to io.path is empty string."))

    /**
     * Throw this when give a path is not in users file system.
     */
    class FileNotFoundIOException(path: Path) :
        IOException("File Not Found", Throwable("This path does not exist in your file system : $path"))

    /**
     * Throw this when give a path is not readable
     */
    class FileNotReadableIOException(path: Path) :
        IOException("File Not Readable", Throwable("This path does not readable in your file system : $path"))

    /**
     * Throw this when the given path is a variable.
     */
    class DirectoryFoundIOException(path: Path) :
        IOException("This path is a directory", Throwable("Given path need to be a file, not a directory : $path"))

    /**
     * Throw this when given path extension is not .conf
     */
    class InvalidExtensionIOException(path: Path) :
        IOException("Invalid file extension.", Throwable("Path extension need to be `.conf` : $path"))
}