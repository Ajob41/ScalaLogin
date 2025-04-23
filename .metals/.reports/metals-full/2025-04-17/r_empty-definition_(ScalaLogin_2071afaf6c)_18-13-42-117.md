error id: scala/Boolean#
file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala
empty definition using pc, found symbol in pc: scala/Boolean#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Boolean#
	 -scala/Predef.Boolean#
offset: 356
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala
text:
```scala
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.nio.charset.StandardCharsets
import java.net.InetSocketAddress

abstract class ServerAddress() {
  val AtWhere: String = s"http://localhost:"
  val serverState: Boolean = false;
  var net: HttpServer = null;
  var portNumber: Int = 0;
  def ServerConnected(): Boole@@an 
  def Disconnect():Unit

}
class Server extends ServerAddress() {
  var connected = serverState;
  var disconnected = serverState;
  def AssignPort(port: Int): Server = {
    this.net = HttpServer.create(InetSocketAddress(port), 1)
    this.portNumber = port;
    this.net.setExecutor(null)
    return this;
  }
  def StartConnection(): ServerAddress = {
    net.start();
    
    var serverAddress = new ServerAddress()
    serverAddress.AtWhere += portNumber;
    return new ServerAddress();

  }
  override def ServerConnected(): Boolean = {
   if(connectionStarted == true) {
      println("Server is Connected")
      return true;
   }else {
      println("Server is not connected")
      return false;
   }
  }
  override protected def Disconnect(): Unit = {
    net.stop(1)
    disconnected = true;
  }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Boolean#