error id: scala/Int#
file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala
empty definition using pc, found symbol in pc: scala/Int#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Int#
	 -scala/Predef.Int#
offset: 180
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala
text:
```scala
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.nio.charset.StandardCharsets
import java.net.InetSocketAddress

class Server  {
  var port:In@@t = 0;
  var :String = "";
  var httpServer:HttpServer = null;
  def EstablishConnection(serverAddress:String):Server =  {
    port = serverAddress.split(":").last.toInt;
    var server = HttpServer.create(InetSocketAddress(port),1)
    httpServer = server;
    atWhere = serverAddress;
    return this;
  }
  def Start():Server = {
     httpServer.start()
     httpServer.setExecutor(null)
     return this;
  }
  def whereAt():Unit = {
    println(whereAt())
  }
}




```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Int#