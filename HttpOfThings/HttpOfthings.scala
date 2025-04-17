import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.nio.charset.StandardCharsets
import java.net.InetSocketAddress

class ServerAddress {
  var AtWhere: String = s"http://localhost:"
  protected var connectionStarted: Boolean = false;
  protected var disconnected = false;
  protected var net: HttpServer = null;
  protected var portNumber: Int = 0;
  protected def ServerConnected(): Boolean = ???
  protected def Disconnect():Unit = ???

}
class Server extends ServerAddress() {
  def AssignPort(port: Int): Server = {
    this.net = HttpServer.create(InetSocketAddress(port), 1)
    this.portNumber = port;
    this.net.setExecutor(null)
    return this;
  }
  def StartConnection(): ServerAddress = {
    net.start();
    connectionStarted = true;
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
