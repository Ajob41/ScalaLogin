error id: scala/Predef.String#
file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
empty definition using pc, found symbol in pc: scala/Predef.String#
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -String#
	 -scala/Predef.String#

Document text:

```scala
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.net.InetSocketAddress

def isUrlOf(urlPath: String, ask: HttpExchange): Boolean =
  ask.getRequestURI.getPath == urlPath

def isHttpMethodOf(ask: HttpExchange, httpRequestMethod: String): Boolean =
  ask.getRequestMethod == httpRequestMethod

@main def main(): Unit = {
  // Create the server and bind it to port 3000
  val server = HttpServer.create(new InetSocketAddress(3000), 1)

  // Handler for "/send"
  server.createContext("/send", new HttpHandler {
    def handle(ask: HttpExchange): Unit = {
      if (isUrlOf("/send", ask) && isHttpMethodOf(ask, "GET")) {
        val response = "<h1>Hello Ayyub</h1>"
        ask.getResponseHeaders.set("Content-Type", "text/html")
        ask.sendResponseHeaders(200, response.getBytes.length)
        val os = ask.getResponseBody
        os.write(response.getBytes)
        os.close()
      } else {
        val response = "<h1>Method Not Allowed</h1>"
        ask.getResponseHeaders.set("Content-Type", "text/html")
        ask.sendResponseHeaders(405, response.getBytes.length)
        val os = ask.getResponseBody
        os.write(response.getBytes)
        os.close()
      }
    }
  })

  // Default handler to catch all unregistered routes (Override 404 Not Found)
  server.createContext("/", new HttpHandler {
    def handle(ask: HttpExchange): Unit = {
      val response = "<h1>Empty Route</h1><p>Sorry, this route does not exist.</p>"
      ask.getResponseHeaders.set("Content-Type", "text/html")
      ask.sendResponseHeaders(404, response.getBytes.length)
      val os = ask.getResponseBody
      os.write(response.getBytes)
      os.close()
    }
  })

  // Start the server
  server.start()
  println("Server started at http://localhost:3000")
}

```

#### Short summary: 

empty definition using pc, found symbol in pc: scala/Predef.String#