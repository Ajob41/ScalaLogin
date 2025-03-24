error id: scala/Unit#
file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
empty definition using pc, found symbol in pc: scala/Unit#
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -Unit#
	 -scala/Predef.Unit#

Document text:

```scala
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.net.InetSocketAddress

def isUrlOf(urlPath: String, ask: HttpExchange): Boolean = {
  ask.getRequestURI.getPath == urlPath
}

def isHttpMethodOf(ask: HttpExchange, httpRequestMethod: String): Boolean = {
  ask.getRequestMethod == httpRequestMethod
}

@main def main(): Unit = {
  // Create the server and bind it to port 3000
  val server = HttpServer.create(new InetSocketAddress(3000), 1)

  // Create an HTTP context for "/send"
  server.createContext("/send", new HttpHandler {
    def handle(ask: HttpExchange): Unit = {
      if (isUrlOf("/send", ask) && isHttpMethodOf(ask, "GET")) {
        val response = "<h1>Hello Ayyub</h1>"
        ask.getResponseHeaders.set("Content-Type", "text/html")
        ask.sendResponseHeaders(200, response.getBytes.length)
        val os = ask.getResponseBody
        os.write(response.getBytes)
        os.close()
      } 
        val response = "<h1>Hello Ayyub This Route is Empty</h1>"
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

empty definition using pc, found symbol in pc: scala/Unit#