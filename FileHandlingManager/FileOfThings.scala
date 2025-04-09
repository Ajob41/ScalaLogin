package FileHandlingManager;
import java.io.File
import java.io.BufferedReader
import java.io.FileReader
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
val pagesToServe:List[String] = List("index.html","client.html","client2.html");

val routes:List[String] = List("/","/client.html","/client2.html");




