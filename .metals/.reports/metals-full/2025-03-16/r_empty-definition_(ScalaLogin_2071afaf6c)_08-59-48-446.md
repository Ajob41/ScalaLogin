error id: _empty_/
file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
empty definition using pc, found symbol in pc: _empty_/
semanticdb not found
|empty definition using fallback
non-local guesses:
	 -

Document text:

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

```

#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/