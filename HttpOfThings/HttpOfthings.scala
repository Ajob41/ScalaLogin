import com.sun.net.httpserver.{HttpServer, HttpExchange}
import java.net.InetSocketAddress

// Only returned after startServer, contains post-start methods

class ServerOps(private var portNumber: Int, private var net: HttpServer) {
  def getPort: String = {
    if (this.portNumber == 0) {
      return "No port was assigned yet"

    } else {
      return s"${this.portNumber}";
    }
  }

  def getAddress: String = {
    if (this.portNumber == 0) {
      return "No port was assigned yet"

    } else {
      return s"http://localhost:${this.portNumber}";
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

class Server {
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
    var serverOps = ServerOps(portNumber, net);
    return serverOps
  }

}
