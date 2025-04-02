file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/amiin/AppData/Local/Coursier/cache/arc/https/github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.26%25252B4/OpenJDK11U-jdk_x64_windows_hotspot_11.0.26_4.zip/jdk-11.0.26+4/lib/src.zip!/java.base/java/io/File.java

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 638
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
text:
```scala
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.net.InetSocketAddress
import java.io.File
import java.io.BufferedReader
import java.io.FileReader

// Helper function to check URL
def isUrlOf(urlPath: String, ask: HttpExchange): Boolean = {
  return ask.getRequestURI().getPath().toLowerCase == urlPath.toLowerCase();
}

// Helper function to check HTTP method
def isHttpMethodOf(httpRequestMethod: String, ask: HttpExchange): Boolean = {
  return ask.getRequestMethod().equals(httpRequestMethod)
}
def fileExists(fileName:String):Boolean = {
    val file = new File(fileName);
    file m@@
}
@main def main(): Unit = {
 
  // Create the server and bind it to port 3000
  val server = HttpServer.create(new InetSocketAddress(3000), 1)

  // Create an HTTP context for "/send"
  server.createContext(
    "/",
    new HttpHandler {
      def handle(ask: HttpExchange): Unit = {
        if (isUrlOf("/", ask) && isHttpMethodOf("GET", ask)) {
          val file = new File("index.html").toString();
          val data = fileData(file);
          var fileToBeServed = serveFile(data);

          ask.getResponseHeaders().set("Content-Type", "text/html");
          ask.sendResponseHeaders(200, fileToBeServed.getBytes().length);
          var server = ask.getResponseBody();
          server.write(fileToBeServed.getBytes());
          server.close();
        }
        if (isUrlOf("/client1", ask) && isHttpMethodOf("GET", ask)) {
          println(ask.getRequestURI().getPath().split("/").last)
          val file = new File("client.html").toString();
          val data = fileData(file);
          var fileToBeServed = serveFile(data);

          ask.getResponseHeaders().set("Content-Type", "text/html");
          ask.sendResponseHeaders(200, fileToBeServed.getBytes().length);
          var server = ask.getResponseBody();
          server.write(fileToBeServed.getBytes());
          server.close();
        } else if (isUrlOf("/client2", ask) && isHttpMethodOf("GET", ask)) {

          val file = new File("client2.html").toString();
          val data = fileData(file);
          var fileToBeServed = serveFile(data);

          ask.getResponseHeaders().set("Content-Type", "text/html");
          ask.sendResponseHeaders(200, fileToBeServed.getBytes().length);
          var server = ask.getResponseBody();
          server.write(fileToBeServed.getBytes());
          server.close();

        } else {
          val response = "<h1>Ayyub this route does not exist</h1>"
          ask.getResponseHeaders().set("Content-Type", "text/html")

          // Set cache control headers to disable caching
          ask
            .getResponseHeaders()
            .set("Cache-Control", "no-store, no-cache, must-revalidate")
          ask.getResponseHeaders().set("Cache-Control", "no-cache")
          ask.getResponseHeaders().set("Expires", "3600")

          // Send the 404 response with custom message
          ask.sendResponseHeaders(404, response.getBytes.length)
          ask.getResponseBody().write(response.getBytes)
          ask.getResponseBody().close()
        }
      }
    }
  )

  // Start the server
  server.start()
  println("Server started at http://localhost:3000")
}

// def setContentType(file: String): String = file match {
//   case f if f.endsWith(".html") => "text/html"
//   case f if f.endsWith(".css") => "text/css"
//   case f if f.endsWith(".js") => "application/javascript"
//   case _ => "unknown file" // Default case
// }

// def fileData(file: String): String = {
//   var data = "";
//   val theFile = new File(file);
//   var readFile = BufferedReader(new FileReader(theFile));
//   var line = readFile.readLine();
//   while (line != null) {
//     data += line;
//     line = readFile.readLine();
//   }
//   return serveFile(data);

// }
// def serveFile(fileData: String): String = {
//   return fileData
// }

```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.dotty$tools$pc$completions$CaseKeywordCompletion$$$sortSubclasses(MatchCaseCompletions.scala:342)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:292)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:349)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:122)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/amiin/AppData/Local/Coursier/cache/arc/https/github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.26%25252B4/OpenJDK11U-jdk_x64_windows_hotspot_11.0.26_4.zip/jdk-11.0.26+4/lib/src.zip!/java.base/java/io/File.java