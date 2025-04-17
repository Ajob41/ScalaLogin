error id: file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala:[154..161) in Input.VirtualFile("file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala", "import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.nio.charset.StandardCharsets
import java.net.InetSocketAddress
class private ServerLocation(port:Int) {
   var atWhere:String = s"http://localhost:${port}";
}
class Server() {
 
  private var connectionStarted: Boolean = false;
  private var net: HttpServer = null;
  private var portNumber:Int = 0;
  def AssignPort(port: Int): Server = {
    net = HttpServer.create(InetSocketAddress(port), 1)
    portNumber = port;
    net.setExecutor(null)
    return this;
  }
  def StartConnection(): ServerLocation = {

    net.start();
    return new ServerLocation(portNumber);
   
  }
  def Disconnect(): Unit = {
    net.stop(1)
  }
  
}
")
file:///C:/Users/amiin/Desktop/ScalaLogin/HttpOfThings/HttpOfthings.scala:4: error: expected identifier; obtained private
class private ServerLocation(port:Int) {
      ^
#### Short summary: 

expected identifier; obtained private