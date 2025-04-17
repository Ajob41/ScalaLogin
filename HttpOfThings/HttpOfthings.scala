import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.nio.charset.StandardCharsets
import java.net.InetSocketAddress
trait ServerAddress {
   var AtWhere:String = s"http://localhost:"
}
class Server extends ServerAddress() {
 
  private var connectionStarted: Boolean = false;
  private var disconnected = false;
  private var net: HttpServer = null;
  private var portNumber:Int = 0;
  def AssignPort(port: Int): Server = {
    net = HttpServer.create(InetSocketAddress(port), 1)
    portNumber = port;
    net.setExecutor(null)
    return this;
  }
  def StartConnection(): Server = {

    net.start();
    this.AtWhere+=portNumber
    return this;
   
  }
  def Disconnect(): Unit = {
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
