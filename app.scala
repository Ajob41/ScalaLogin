import com.sun.net.httpserver.{HttpServer, HttpExchange}
import java.io.*
import java.net.InetSocketAddress
import java.nio.file.{Files, Paths}
import java.nio.charset.StandardCharsets

import scala.collection.mutable.ListBuffer
import java.util.concurrent.CompletableFuture
import scala.annotation.meta.setter

@main def main(): Unit = {
  var server = new Server();
  
  server.startServer().getPort
}

