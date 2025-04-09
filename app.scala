import com.sun.net.httpserver.{HttpServer, HttpExchange}
import java.io.*
import java.net.InetSocketAddress
import java.nio.file.{Files, Paths}

@main def runServer(): Unit =
  val server = HttpServer.create(new InetSocketAddress(3000), 0)

  // Serve static client.html file
  server.createContext("/", (exchange: HttpExchange) =>
    
    val filePath = Paths.get("index.html");
    if Files.exists(filePath) then
      val bytes = Files.readAllBytes(filePath);
      exchange.getResponseHeaders.set("Content-Type", "text/html");
      exchange.sendResponseHeaders(200, bytes.length);
      val os = exchange.getResponseBody
      os.write(bytes);
      os.close();
    else
      val notFound = "404 Not Found";
      exchange.sendResponseHeaders(404, notFound.length);
      exchange.getResponseBody.write(notFound.getBytes);
      exchange.getResponseBody.close();
  )

  // SSE stream handler
  server.createContext("/message", (exchange: HttpExchange) =>
    var response = "hello from server";
    exchange.getResponseHeaders.add("Content-Type", "text/event-stream");
    exchange.getResponseHeaders.add("Cache-Control", "no-cache");
    exchange.getResponseHeaders.add("Connection", "keep-alive");
    exchange.sendResponseHeaders(200, response.getBytes().length);

    var os = exchange.getResponseBody();
    os.write(response.getBytes());
    os.close();
  )

  server.setExecutor(null)
  server.start()
  println("🚀 Server running at http://localhost:3000/")
