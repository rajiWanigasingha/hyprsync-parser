---
title: ValidatePathExtensionExceptions
---
//[hyprsync-parser](../../../index.html)/[com.hyprsync.parser.utils.exceptions](../index.html)/[ValidatePathExtensionExceptions](index.html)



# ValidatePathExtensionExceptions



[jvm]\
sealed class [ValidatePathExtensionExceptions](index.html)

All Exceptions that can be thrown when `validatePath` used in Path as an extension



## Types


| Name | Summary |
|---|---|
| [DirectoryFoundIOException](-directory-found-i-o-exception/index.html) | [jvm]<br>class [DirectoryFoundIOException](-directory-found-i-o-exception/index.html)(path: [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)) : [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)<br>Throw this when the given path is a variable. |
| [EmptyPathIOException](-empty-path-i-o-exception/index.html) | [jvm]<br>class [EmptyPathIOException](-empty-path-i-o-exception/index.html) : [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)<br>Throw this when give the path is empty. |
| [FileNotFoundIOException](-file-not-found-i-o-exception/index.html) | [jvm]<br>class [FileNotFoundIOException](-file-not-found-i-o-exception/index.html)(path: [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)) : [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)<br>Throw this when give a path is not in users file system. |
| [FileNotReadableIOException](-file-not-readable-i-o-exception/index.html) | [jvm]<br>class [FileNotReadableIOException](-file-not-readable-i-o-exception/index.html)(path: [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)) : [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)<br>Throw this when give a path is not readable |
| [InvalidExtensionIOException](-invalid-extension-i-o-exception/index.html) | [jvm]<br>class [InvalidExtensionIOException](-invalid-extension-i-o-exception/index.html)(path: [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)) : [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)<br>Throw this when given path extension is not .conf |
