import com.sun.net.httpserver.{HttpServer, HttpExchange}
import java.io.*
import java.net.InetSocketAddress
import java.nio.file.{Files, Paths}


@main def runServer(): Unit =
  val server = HttpServer.create(new InetSocketAddress(3000), 0)

  server.createContext(
    "/",
    (exchange: HttpExchange) => {
      var mainPage = "index.html";
      var urlPath = exchange.getRequestURI().getPath();
      if (urlPath.equals("/client.html")) {
        
        mainPage = "."+urlPath;
      } else if (urlPath.equals("/client2.html")) {
        mainPage = "."+urlPath
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
