import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.nio.charset.StandardCharsets
import java.net.InetSocketAddress

class Server {
  var port: Int = 0;
  var atWhere: String = "";
  var httpServer: HttpServer = null;
  def EstablishConnection(serverAddress: String): Server = {
    port = serverAddress.split(":").last.toInt;
    httpServer = HttpServer.create(InetSocketAddress(port), 1)
    httpServer.setExecutor(null)
    atWhere = serverAddress;
    return this;
  }
  def Start(): Server = {
    try {
      //this.EstablishConnection("").atWhere // will throw if httpServer is null
      this.httpServer.start();
      
    } catch {
      case e: NullPointerException =>
        println(
          "Server has not been established. Call establishConnection() first."
        )
    }
    return this;
  }
  def AtWhere(): Unit = {
    try {
      this.httpServer.start();
      println(s"Server started at $atWhere")
    }catch{
      case e:NullPointerException => {
        println("Can't specify Location")
      }
    }

  }
}
