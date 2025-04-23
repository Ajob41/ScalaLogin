error id: _empty_/`<import>`.
file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
empty definition using pc, found symbol in pc: _empty_/`<import>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 198
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
text:
```scala
import com.sun.net.httpserver.{HttpServer, HttpExchange}
import java.io.*
import java.net.InetSocketAddress
import java.nio.file.{Files, Paths}
import java.nio.charset.StandardCharsets

import@@ scala.collection.mutable.ListBuffer
import java.util.concurrent.CompletableFuture
import scala.annotation.meta.setter

@main def main(): Unit = {
  var server = new Server();
  server.
  setPort(3000).startServer()
  server.httpReqRespHandler((req,resp) => {
    if(req.method == "GET" && req.path == "/"){
      resp.setHttpHeader("Content-Type","text/plain");
      resp.send("Hello Ayyub")
    }
  })
}


```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/`<import>`.