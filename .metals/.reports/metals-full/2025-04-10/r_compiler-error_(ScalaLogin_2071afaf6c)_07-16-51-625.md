file:///C:/Users/amiin/Desktop/ScalaLogin/FileHandlingManager/FileOfThings.scala
### dotty.tools.dotc.ast.Trees$UnAssignedTypeException: type of Ident(pagesToServe) is not assigned

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 407
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
    case pagesToServe[@@] => "is index.html"
    case ""
}





```



#### Error stacktrace:

```
dotty.tools.dotc.ast.Trees$Tree.tpe(Trees.scala:74)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:208)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:104)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:46)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:435)
```
#### Short summary: 

dotty.tools.dotc.ast.Trees$UnAssignedTypeException: type of Ident(pagesToServe) is not assigned