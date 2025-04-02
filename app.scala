import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
import java.net.InetSocketAddress
import java.io.File
import java.io.BufferedReader
import java.io.FileReader
import FileHandlingManager.*;
// Helper function to check URL
def isUrlOf(urlPath: String, ask: HttpExchange): Boolean = {
  return ask.getRequestURI().getPath().toLowerCase == urlPath.toLowerCase();
}

// Helper function to check HTTP method
def isHttpMethodOf(httpRequestMethod: String, ask: HttpExchange): Boolean = {
  return ask.getRequestMethod().equals(httpRequestMethod)
}

@main def main(): Unit = {

  val server = HttpServer.create(new InetSocketAddress(3000), 1)

  // Create an HTTP context for "/send"
  server.createContext(
    "/",
    new HttpHandler {
      def handle(ask: HttpExchange): Unit = {

        if (isUrlOf("/", ask) && isHttpMethodOf("GET", ask)) {
          val fileName = "index.html";

          val fileToBeServed = fileData(getFileData(fileName));
          ask.getResponseHeaders().set("Content-Type", "text/html");
          ask.sendResponseHeaders(200, fileToBeServed.getBytes().length);
          val response = ask.getResponseBody();
          response.write(fileToBeServed.getBytes())
          response.close();
        }
        if (isUrlOf("/client1", ask) && isHttpMethodOf("GET", ask)) {
          val fileName = "client.html";

          val fileToBeServed = fileData(getFileData(fileName));
          ask.getResponseHeaders().set("Content-Type", "text/html");
          ask.sendResponseHeaders(200, fileToBeServed.getBytes().length);
          val response = ask.getResponseBody();
          response.write(fileToBeServed.getBytes())
          response.close();
        } else if (
          isUrlOf("/client2", ask) && isHttpMethodOf("GET", ask)
        ) {
          val fileName = "client2.html"
          val fileToBeServed = fileData(getFileData(fileName));
          ask.getResponseHeaders().set("Content-Type", "text/html");
          ask.sendResponseHeaders(200, fileToBeServed.getBytes().length);
          val response = ask.getResponseBody();
          response.write(fileToBeServed.getBytes())
          response.close();
        } else {
          val response = "<h1>Ayyub this route does not exist</h1>"
          ask.getResponseHeaders().set("Content-Type", "text/html")

          // Set cache control headers to disable caching
          ask
            .getResponseHeaders()
            .set("Cache-Control", "no-store, no-cache, must-revalidate")
          ask.getResponseHeaders().set("Cache-Control", "no-cache")
          ask.getResponseHeaders().set("Expires", "3600")

          // Send the 404 response with custom message
          ask.sendResponseHeaders(404, response.getBytes.length)
          ask.getResponseBody().write(response.getBytes)
          ask.getResponseBody().close()
        }
      }
    }
  )

  // Start the server
  server.start()
  println("Server started at http://localhost:3000")
}

// def setContentType(file: String): String = file match {
//   case f if f.endsWith(".html") => "text/html"
//   case f if f.endsWith(".css") => "text/css"
//   case f if f.endsWith(".js") => "application/javascript"
//   case _ => "unknown file" // Default case
// }

// def fileData(file: String): String = {
//   var data = "";
//   val theFile = new File(file);
//   var readFile = BufferedReader(new FileReader(theFile));
//   var line = readFile.readLine();
//   while (line != null) {
//     data += line;
//     line = readFile.readLine();
//   }
//   return serveFile(data);

// }
// def serveFile(fileData: String): String = {
//   return fileData
// }
