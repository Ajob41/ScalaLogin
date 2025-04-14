error id: scala/collection/mutable/ListBuffer#
file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala
empty definition using pc, found symbol in pc: scala/collection/mutable/ListBuffer#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -scala/collection/mutable/ListBuffer#
	 -ListBuffer#
	 -scala/Predef.ListBuffer#
offset: 385
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala
text:
```scala
import scala.collection.mutable.ListBuffer
class Http {
  private var listOfPaths: ListBuffer[String] = ListBuffer()
  private var baseUrl: String = ""

  def MakeServer(urlPath: String): Http = {
    baseUrl = urlPath;
    this
  }

  def AddPath(path: String): Http = {
    var fullPath = baseUrl+=path;
    listOfPaths:+fullPath
    this
  }

  def GetPaths:ListBuff@@er[String] = listOfPaths;
  
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/collection/mutable/ListBuffer#