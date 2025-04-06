
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
def isUrlOf(urlPath: String, ask: HttpExchange): Boolean = {
  return ask.getRequestURI().getPath().toLowerCase == urlPath.toLowerCase();
}

// Helper function to check HTTP method
def isHttpMethodOf(httpRequestMethod: String, ask: HttpExchange): Boolean = {
  return ask.getRequestMethod().equals(httpRequestMethod)
}