error id: 
file:///C:/Users/amiin/Desktop/ScalaLogin/FileHandlingManager/FileOfThings.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 591
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/FileHandlingManager/FileOfThings.scala
text:
```scala
import java.io.File

// Method to look up a file and return an Option[File]
def lookUpFile(fileName: String): Option[File] = {
  val file = new File(fileName)
  if (file.exists()) Some(file) else None
}

// Example usage
val maybeFile = lookUpFile("index.html")

// Method to handle file if found
def fileFound(file: Option[File]): String = {
  file match {
    case Some(f) => f.getName // Return file name if file is found
    case None    => "File not found" // Return a message if file is not found
  }
}

// Usage example
println(fileFound(maybeFile)) // Prints the @@file name or "File not found"

```


#### Short summary: 

empty definition using pc, found symbol in pc: 