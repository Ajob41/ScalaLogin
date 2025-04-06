import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.io.*
import java.net.InetSocketAddress
import java.nio.file.{Files, Paths}

@main def runServer(): Unit =
  val server = HttpServer.create(new InetSocketAddress(3000), 0)

  server.createContext("/", new HttpHandler {
    override def handle(exchange: HttpExchange): Unit =
      try {
        val uri = exchange.getRequestURI.getPath
        var fileName = ""
        
        if (uri == "/") {
          fileName = "index.html"
        } else if (uri == "/client1") {
          fileName = "client.html"
        } else if (uri == "/client2") {
          fileName = "client2.html"
        } else {
          val notFound = "404 Not Found"
          exchange.getResponseHeaders.set("Content-Type", "text/plain")
          exchange.sendResponseHeaders(404, notFound.length)
          exchange.getResponseBody.write(notFound.getBytes)
          exchange.close()
          return
        }

        val filePath = Paths.get(".", fileName)
        if (Files.exists(filePath)) {
          val bytes = Files.readAllBytes(filePath)
          exchange.getResponseHeaders.set("Content-Type", "text/html")
          exchange.sendResponseHeaders(200, bytes.length)
          exchange.getResponseBody.write(bytes)
        } else {
          val notFound = "404 File Not Found"
          exchange.getResponseHeaders.set("Content-Type", "text/plain")
          exchange.sendResponseHeaders(404, notFound.length)
          exchange.getResponseBody.write(notFound.getBytes)
        }
      } catch {
        case e: Exception =>
          val error = "500 Internal Server Error"
          exchange.getResponseHeaders.set("Content-Type", "text/plain")
          exchange.sendResponseHeaders(500, error.length)
          exchange.getResponseBody.write(error.getBytes)
      } finally {
        exchange.close()
      }
  })

  server.setExecutor(null)
  server.start()
  println("🚀 Server is running at http://localhost:3000/")