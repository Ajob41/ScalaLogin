error id: `<none>`.
file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 188
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
text:
```scala
import com.sun.net.httpserver.{HttpServer, HttpExchange}
import java.io.*
import java.net.InetSocketAddress
import java.nio.file.{Files, Paths}


@main def runServer(): Unit =
  val@@ server = HttpServer.create(new InetSocketAddress(3000), 0)

  server.createContext(
    "/",
    (exchange: HttpExchange) => {
      var mainPage = "index.html";
      var urlPath = exchange.getRequestURI().getPath();
      if (urlPath.equals("/client.html")) {
        println()
        mainPage = "."+exchange.getRequestURI().getPath()
      } else if (urlPath.equals("/client2.html")) {
        mainPage = "."+exchange.getRequestURI().getPath()
      }
      val filePath = Paths.get(mainPage);
      if (Files.exists(filePath)) {
        var bytes = Files.readAllBytes(filePath);
        exchange.sendResponseHeaders(200, bytes.length);
        exchange.getResponseHeaders().set("Content-Type", "text/html")
        var os = exchange.getResponseBody();
        os.write(bytes);
        os.close();
      }
    }
  )

  server.setExecutor(null)
  server.start()
  println("🚀 Server running at http://localhost:3000")

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.