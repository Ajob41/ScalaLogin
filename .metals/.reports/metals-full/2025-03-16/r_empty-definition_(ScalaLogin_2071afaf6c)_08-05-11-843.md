error id: _empty_/`<import>`.
file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
empty definition using pc, found symbol in pc: _empty_/`<import>`.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
import com.sun.net.httpserver
@main def main(): Unit = {
  // Create the server and bind it to port 3000
  val server = HttpServer.create(new InetSocketAddress(3000),
  // Create an HTTP context for "/send"
  server.createContext("/send", new HttpHandler {
    def handle(req: HttpExchange): Unit = {
        if(isUrlOf("/send",req){
           println("true");
        }
    }
  
  })

  // Start the server
  server.start()
  println("Server started at http://localhost:3000")
}



def isHttpMethodOf():Boolean = {

}
```

#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/`<import>`.