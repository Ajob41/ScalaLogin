file:///C:/Users/amiin/Desktop/ScalaLogin/FileHandlingManager/FileOfThings.scala
### java.lang.IndexOutOfBoundsException: -1

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 401
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/FileHandlingManager/FileOfThings.scala
text:
```scala
package FileHandlingManager;
import java.io.File
import java.io.BufferedReader
import java.io.FileReader
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
val pagesToServe:List[String] = List("index.html","client.html","client2.html");

val routes:List[String] = List("/","/client.html","/client2.html");


def listOfPages():List[String] = pages match {
    case p if p[@@]
}





```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:129)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:244)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:104)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:46)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:435)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1