import com.sun.net.httpserver.{HttpServer, HttpExchange}
import java.net.InetSocketAddress

// Only returned after startServer, contains post-start methods
class ServerOps {
  def getPort: String = ???

  def getAddress: String = ???

}

class Server extends ServerOps {
  private var portNumber: Int = 0
  private var net: HttpServer = null;
  def setPort(port: Int): Unit = {
    this.portNumber = port
  }

  def startServer(): ServerOps = {
    if (this.net == null) {
      net = HttpServer.create(InetSocketAddress(this.portNumber), 1);
      net.start();
    }
    return this
  }
  override def getAddress: String = {
    if (this.portNumber == 0) {
      return "No port was assigned yet"

    } else {
      return s"http://localhost:${this.portNumber}";
    }

  }
  override def getPort: String = {
    if (this.portNumber == 0) {
      return "No port was assigned yet"

    } else {
      return s"${this.portNumber}";
    }
  }
  def stopServer(): Unit = {
    if (this.net != null) {
      net.stop(0);
      net = null;
      println("Server stopped")
    }
  }
}
