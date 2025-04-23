import com.sun.net.httpserver.{HttpServer, HttpExchange}
import java.net.InetSocketAddress

// Only returned after startServer, contains post-start methods
class ServerOps(private val net: HttpServer, private val port: Int) {
  def getPort: Unit = {
    println(s"Port: $port")
  }

  def getAddress: Unit = {
    println(s"Address: ${net.getAddress}")
  }

  def stopServer(): Unit = {
    net.stop(1)
    println("Server stopped.")
  }
}

class Server {
  private var portNumber: Int = 0

  def setPort(port: Int): Unit = {
    this.portNumber = port
  }

  def startServer(): ServerOps = {
    val net = HttpServer.create(new InetSocketAddress(portNumber), 0)
    net.start()
    println(s"Server started at http://localhost:$portNumber")
    new ServerOps(net, portNumber)
  }
}
