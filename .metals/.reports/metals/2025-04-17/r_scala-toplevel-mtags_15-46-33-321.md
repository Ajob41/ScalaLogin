error id: file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala:[183..184) in Input.VirtualFile("file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala", "import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.nio.charset.StandardCharsets
import java.net.InetSocketAddress

trait ServerMonitor  {
   def 
}
class ServerAddress extends ServerMonitor {
   var AtWhere:String = s"http://localhost:"
   
   def Disconnect():Unit = {}
}
class Server extends ServerAddress() {
 
  private var connectionStarted: Boolean = false;
  private var disconnected = false;
  private var net:HttpServer = null;
  private var portNumber:Int = 0;
  def AssignPort(port: Int): Server = {
    net = HttpServer.create(InetSocketAddress(port), 1)
    portNumber = port;
    net.setExecutor(null)
    return this;
  }
  def StartConnection(): ServerAddress = {

    net.start();
    var serverAddress = new ServerAddress()
    serverAddress.AtWhere+=portNumber;
    return new ServerAddress();
   
  }
  override def Disconnect(): Unit = {
    net.stop(1)
    disconnected = true;
  }
  def Disconnected():Boolean = {
      if(disconnected == true){
         println("Server is disconnected")
      }
      return disconnected;
  }
  
}
")
file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala:7: error: expected identifier; obtained rbrace
}
^
#### Short summary: 

expected identifier; obtained rbrace