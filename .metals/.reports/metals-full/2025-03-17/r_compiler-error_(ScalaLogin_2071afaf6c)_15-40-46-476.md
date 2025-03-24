file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/amiin/AppData/Local/Coursier/cache/arc/https/github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.26%25252B4/OpenJDK11U-jdk_x64_windows_hotspot_11.0.26_4.zip/jdk-11.0.26+4/lib/src.zip!/java.base/java/lang/String.java

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1981
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
text:
```scala
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.net.InetSocketAddress

// Helper function to check URL
def isUrlOf(urlPath: String, ask: HttpExchange): Boolean = {
  ask.getRequestURI().getPath() == urlPath
}

// Helper function to check HTTP method
def isHttpMethodOf(ask: HttpExchange, httpRequestMethod: String): Boolean = {
  ask.getRequestMethod().equals(httpRequestMethod)
}

@main def main(): Unit = {
  // Create the server and bind it to port 3000
  val server = HttpServer.create(new InetSocketAddress(3000), 1)

  // Create an HTTP context for "/send"
  server.createContext("/", new HttpHandler {
    def handle(ask: HttpExchange): Unit = {
      // If request is GET for "/send"
      if (isUrlOf("/send", ask) && isHttpMethodOf(ask, "GET")) {
        val response = "<h1>Hello Ayyub</h1>"
        ask.getResponseHeaders().set("Content-Type", "text/html")
        ask.sendResponseHeaders(200, response.getBytes.length)
        ask.getResponseBody().write(response.getBytes)
        ask.getResponseBody().close()
      } else {
        // Custom 404 message if the route is not found
        val response = "<h1>Ayyub this route does not exist</h1>"
        ask.getResponseHeaders().set("Content-Type", "text/html")
        
        // Set cache control headers to disable caching
        ask.getResponseHeaders().set("Cache-Control", "no-store, no-cache, must-revalidate")
        ask.getResponseHeaders().set("Cache-Control", "no-cache")
        ask.getResponseHeaders().set("Expires", "3600")

        // Send the 404 response with custom message
        ask.sendResponseHeaders(404, response.getBytes.length)
        ask.getResponseBody().write(response.getBytes)
        ask.getResponseBody().close()
      }
    }
  })

  // Start the server
  server.start()
  println("Server started at http://localhost:3000")
}


def setContentType(contentType:String) = {
  contentType matc@@
}
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

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/amiin/AppData/Local/Coursier/cache/arc/https/github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.26%25252B4/OpenJDK11U-jdk_x64_windows_hotspot_11.0.26_4.zip/jdk-11.0.26+4/lib/src.zip!/java.base/java/lang/String.java