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
      httpServer.start() // will throw if httpServer is null
      println(s"Server started at $atWhere")
    } catch {
      case e: NullPointerException =>
        println(
          "Server has not been established. Call establishConnection() first."
        )
    }
    return this;
  }
  def AtWhere(): Unit = {
    println(atWhere)
  }
}
