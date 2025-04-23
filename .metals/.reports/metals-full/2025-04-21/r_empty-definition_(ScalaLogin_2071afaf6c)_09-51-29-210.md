error id: sendResponseHeaders.
file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala
empty definition using pc, found symbol in pc: sendResponseHeaders.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -exchange/sendResponseHeaders.
	 -exchange/sendResponseHeaders#
	 -exchange/sendResponseHeaders().
	 -scala/Predef.exchange.sendResponseHeaders.
	 -scala/Predef.exchange.sendResponseHeaders#
	 -scala/Predef.exchange.sendResponseHeaders().
offset: 1928
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala
text:
```scala
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.net.InetSocketAddress
import javax.smartcardio.ResponseAPDU




trait ServerAddress {
  protected var net: HttpServer = null;
  var portNumber: Int = 0;
  protected var serverState: Boolean = false;

}
class Server extends ServerAddress {

  def setPort(port: Int): Server = {
    this.portNumber = port
    return this
  }

  def startServer(): Unit = {
    if (this.net == null) {
      net = HttpServer.create(InetSocketAddress(portNumber), 1);
      net.start();
      this.serverState = true;
      println(s"Server started")
    }else {
      println("Server is running by previous call")
    }
    
  }
  def stopServer(): Server = {
    if (this.net != null) {
      net.stop(1)
      net = null;
      this.serverState = false;
      println("Server stopped")
    }
    return this;
  }

  def atWhichPort:Server = {
    if(this.net == null && this.serverState == false) {
      println("Can't locate which port check if server is running")
    }else {
       println(s"Server is running a http://localhost:${this.portNumber}")
    }
    
    return this;
  }

  def httpReqRespHandler(callback:(req:Request,resp:Response) => Unit):Server = {
    this.net.createContext("/", new HttpHandler {
       def handle(exchange: HttpExchange): Unit = {
        val req = Request(exchange)
        val resp = Response(exchange)
       }
    })
    return this;
  }

}

case class Request(req:HttpExchange) {
  val path:String = req.getRequestURI().getPath();
  val method:String = req.getRequestMethod();
}
case class Response(resp:HttpExchange){
  def setHttpHeader(key:String,value:String):Response = {
    resp.getResponseHeaders().set(key,value)
    return this;
  }
   def send(content: String): Unit =
    val bytes = content.getBytes("UTF-8")
    exchange.sendRespo@@nseHeaders(200, bytes.length)
    val os = exchange.getResponseBody
    os.write(bytes)
    os.close()
}
// class HttpOfthings {
//   def httpOfThings(callback :(req:Option[HttpExchange],resp:Option[HttpServer]) => Unit):HttpServer = {
//     return this;
//   }
// }
```


#### Short summary: 

empty definition using pc, found symbol in pc: sendResponseHeaders.