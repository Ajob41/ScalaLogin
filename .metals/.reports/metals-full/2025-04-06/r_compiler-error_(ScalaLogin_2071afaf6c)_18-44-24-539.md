file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
### java.lang.AssertionError: assertion failed: position error, parent span does not contain child span
parent      =  extends HttpHandler {
  override def handle(request: HttpExchange): Unit =
    {
      var fileName = ""
      var uri = request.getRequestURI().getPath()
      if (uri == "/")
        {
          fileName = "." + uri + "index.html"
        }
       else
        if (uri == "/client1")
          {
            fileName = "." + uri + "client.html"
          }
         else
          {
            var response = "<h1>Route not found</h1>"
            request.sendResponseHeaders(404, response.getBytes().length)
            request.getResponseHeaders().set("Content-Type", "text/html")
            var os = request.getResponseBody()
            os.write(response.getBytes())
            os.close()
          }
      if (new File(fileName).exists()) _root_.scala.Predef.???
    }
} # -1,
parent span = <290..976>,
child       = override def handle(request: HttpExchange): Unit =
  {
    var fileName = ""
    var uri = request.getRequestURI().getPath()
    if (uri == "/")
      {
        fileName = "." + uri + "index.html"
      }
     else
      if (uri == "/client1")
        {
          fileName = "." + uri + "client.html"
        }
       else
        {
          var response = "<h1>Route not found</h1>"
          request.sendResponseHeaders(404, response.getBytes().length)
          request.getResponseHeaders().set("Content-Type", "text/html")
          var os = request.getResponseBody()
          os.write(response.getBytes())
          os.close()
        }
    if (new File(fileName).exists()) _root_.scala.Predef.???
  } # -1,
child span  = [313..326..977]

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file:///C:/Users/amiin/Desktop/ScalaLogin/app.scala
text:
```scala
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.io.*
import java.net.InetSocketAddress
import java.nio.file.{Files, Paths}

@main def runServer(): Unit =
  val server = HttpServer.create(new InetSocketAddress(3000), 0)

  server.createContext("/", new HttpHandler {
    override def handle(request: HttpExchange): Unit = {
        var fileName = "";
        var uri = request.getRequestURI().getPath();
        if(uri == "/"){
          fileName = "."+uri+"index.html"
        }else if(uri == "/client1"){
          fileName = "."+uri+"client.html"
        }else {
          var response = "<h1>Route not found</h1>"
          request.sendResponseHeaders(404,response.getBytes().length);
          request.getResponseHeaders().set("Content-Type","text/html");
          var os = request.getResponseBody();
          os.write(response.getBytes());
          os.close();
        }
        if(new File(fileName).exists()) )
    }
      
  })

  server.setExecutor(null)
  server.start()
  println("🚀 Server is running at http://localhost:3000/")
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
	dotty.tools.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:31)
	dotty.tools.pc.SimpleCollector.<init>(PcCollector.scala:351)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:111)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: position error, parent span does not contain child span
parent      =  extends HttpHandler {
  override def handle(request: HttpExchange): Unit =
    {
      var fileName = ""
      var uri = request.getRequestURI().getPath()
      if (uri == "/")
        {
          fileName = "." + uri + "index.html"
        }
       else
        if (uri == "/client1")
          {
            fileName = "." + uri + "client.html"
          }
         else
          {
            var response = "<h1>Route not found</h1>"
            request.sendResponseHeaders(404, response.getBytes().length)
            request.getResponseHeaders().set("Content-Type", "text/html")
            var os = request.getResponseBody()
            os.write(response.getBytes())
            os.close()
          }
      if (new File(fileName).exists()) _root_.scala.Predef.???
    }
} # -1,
parent span = <290..976>,
child       = override def handle(request: HttpExchange): Unit =
  {
    var fileName = ""
    var uri = request.getRequestURI().getPath()
    if (uri == "/")
      {
        fileName = "." + uri + "index.html"
      }
     else
      if (uri == "/client1")
        {
          fileName = "." + uri + "client.html"
        }
       else
        {
          var response = "<h1>Route not found</h1>"
          request.sendResponseHeaders(404, response.getBytes().length)
          request.getResponseHeaders().set("Content-Type", "text/html")
          var os = request.getResponseBody()
          os.write(response.getBytes())
          os.close()
        }
    if (new File(fileName).exists()) _root_.scala.Predef.???
  } # -1,
child span  = [313..326..977]