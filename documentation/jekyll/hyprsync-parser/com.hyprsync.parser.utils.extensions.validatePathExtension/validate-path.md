---
title: validatePath
---
//[hyprsync-parser](../../index.html)/[com.hyprsync.parser.utils.extensions.validatePathExtension](index.html)/[validatePath](validate-path.html)



# validatePath



[jvm]\
internal fun [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html).[validatePath](validate-path.html)(): [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)



###### Extension For Path Validation



Extension for [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html) Type and use to validate `path`.



Use to validate given `path`,



1. 
   Check if it's empty
2. 
   Check if it exists,
3. 
   Check if it's not a directory.
4. 
   Check if it's readable.
5. 
   Check if its extension is `.conf`




#### Throws


| | |
|---|---|
| [ValidatePathExtensionExceptions.EmptyPathIOException](../com.hyprsync.parser.utils.exceptions/-validate-path-extension-exceptions/-empty-path-i-o-exception/index.html) | -     If the file is empty. |
| [ValidatePathExtensionExceptions.FileNotFoundIOException](../com.hyprsync.parser.utils.exceptions/-validate-path-extension-exceptions/-file-not-found-i-o-exception/index.html) | -     If the file not found. |
| [ValidatePathExtensionExceptions.FileNotReadableIOException](../com.hyprsync.parser.utils.exceptions/-validate-path-extension-exceptions/-file-not-readable-i-o-exception/index.html) | -     If the file not readable. |
| [ValidatePathExtensionExceptions.DirectoryFoundIOException](../com.hyprsync.parser.utils.exceptions/-validate-path-extension-exceptions/-directory-found-i-o-exception/index.html) | -     If it is a directory, not a file. |
| [ValidatePathExtensionExceptions.InvalidExtensionIOException](../com.hyprsync.parser.utils.exceptions/-validate-path-extension-exceptions/-invalid-extension-i-o-exception/index.html) | -     If file extension is not `.conf` |


