import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.nio.charset.StandardCharsets
import java.net.InetSocketAddress

class Server {
  private var port: Int = 0;
  private var atWhere: String = "http://localhost:";
  private var httpServer: HttpServer = null;
  private var establishConnectionMethodCalled: Boolean = false;
  private var startMethod: Boolean = false;
  def EstablishConnection(port: Int): Server = {
    establishConnectionMethodCalled = true;
    atWhere = atWhere + port
    httpServer = HttpServer.create(InetSocketAddress(port), 1)
    httpServer.setExecutor(null)
    return this;
  }
  def Start(): Server = {
    startMethod = true;
    if(establishConnectionMethodCalled == true && httpServer != null){
      this.httpServer.start();
    }
    println("EstablishConnection method not called")
    return this;
  }
  def AtWhere(): Unit = {
    if(startMethod == true && establishConnectionMethodCalled == true && atWhere != null){
      println(atWhere)
    }
    if(establishConnectionMethodCalled == true && startMethod == false){
      println("Start() method not called");
    }
    if(establishConnectionMethodCalled == false && startMethod == true){
      println(this.Start())
    }
    if(establishConnectionMethodCalled == false && startMethod == false) {
      println("EstablishConnection() and Start() method not called");
    }
    println("Uknown")
  }
}
