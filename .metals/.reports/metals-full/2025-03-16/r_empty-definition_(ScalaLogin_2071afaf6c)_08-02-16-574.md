error id: `<none>`.
file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
import java.io.{BufferedReader, FileReader}
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.net.InetSocketAddress
def isUrlOf(urlPath:String,request:HttpExchange):Boolean = {
   
   
  
}
@main def main(): Unit = {
  // Create the server and bind it to port 3000
  val server = HttpServer.create(new InetSocketAddress(3000), 1)

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

def isUrlOf(urlPath:String,req:HttpExchange):Boolean = {
    req.getRequestURI().getPath() == urlPath;
}

def isHttpMethodOf():Boolean = {

}
```

#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.