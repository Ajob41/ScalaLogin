file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
### java.lang.AssertionError: assertion failed: position error, parent span does not contain child span
parent      =  extends HttpHandler {
  override def handle(req: HttpExchange): Unit =
    {
      if
        req.getRequestURI.getPath == "/send" &&
          req.getRequestMethod.equalsIgnoreCase("GET")
       then _root_.scala.Predef.???
    }
} # -1,
parent span = <376..572>,
child       = override def handle(req: HttpExchange): Unit =
  {
    if
      req.getRequestURI.getPath == "/send" &&
        req.getRequestMethod.equalsIgnoreCase("GET")
     then _root_.scala.Predef.???
  } # -1,
child span  = [401..414..582]

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 583
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
text:
```scala
import java.io.{BufferedReader, FileReader}
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.net.InetSocketAddress

@main def main(): Unit = {
  // Create the server and bind it to port 3000
  val server = HttpServer.create(new InetSocketAddress(3000), 1)

  // Create an HTTP context for "/send"
  server.createContext("/send",
    new HttpHandler {
      override def handle(req: HttpExchange): Unit = {
        if 
          req.getRequestURI.getPath == "/send" && req.getRequestMethod
            .equalsIgnoreCase("GET")
        )@@ {
          var response = ""

          // Read the file
          val fileToServer = new BufferedReader(new FileReader("client.html"))
          try {
            var line = fileToServer.readLine()
            while (line != null) {
              response += line + "\n"
              line = fileToServer.readLine()
            }
            println(response)
          } finally {
            fileToServer.close()
          }

          // Set response headers
          req.getResponseHeaders.add("Content-Type", "text/html")
          req.sendResponseHeaders(200, response.getBytes.length)

          // Send response body
          val os = req.getResponseBody
          os.write(response.getBytes)
          os.close()
        } else {
          val response = "<h1>Nothing is found</h1>"
          req.getResponseHeaders.add("Content-Type", "text/html")
          req.sendResponseHeaders(404, response.getBytes.length)

          val os = req.getResponseBody
          os.write(response.getBytes)
          os.close()
        }
      }
    }
  )

  // Start the server
  server.start()
  println("Server started at http://localhost:3000")
}

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:177)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:207)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:207)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:207)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:207)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:207)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:207)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.parsing.Parser.parse$$anonfun$1(ParserPhase.scala:39)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:507)
	dotty.tools.dotc.parsing.Parser.parse(ParserPhase.scala:40)
	dotty.tools.dotc.parsing.Parser.$anonfun$2(ParserPhase.scala:52)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:685)
	scala.collection.immutable.List$.from(List.scala:682)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:900)
	dotty.tools.dotc.parsing.Parser.runOn(ParserPhase.scala:51)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:343)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:336)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:383)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:395)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:395)
	dotty.tools.dotc.Run.compileSources(Run.scala:282)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.CachingDriver.run(CachingDriver.scala:45)
	dotty.tools.pc.HoverProvider$.hover(HoverProvider.scala:40)
	dotty.tools.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:389)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: position error, parent span does not contain child span
parent      =  extends HttpHandler {
  override def handle(req: HttpExchange): Unit =
    {
      if
        req.getRequestURI.getPath == "/send" &&
          req.getRequestMethod.equalsIgnoreCase("GET")
       then _root_.scala.Predef.???
    }
} # -1,
parent span = <376..572>,
child       = override def handle(req: HttpExchange): Unit =
  {
    if
      req.getRequestURI.getPath == "/send" &&
        req.getRequestMethod.equalsIgnoreCase("GET")
     then _root_.scala.Predef.???
  } # -1,
child span  = [401..414..582]