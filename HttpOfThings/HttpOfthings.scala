import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
def isHttpMethodOf(httpMethod: String, request: HttpExchange): Unit = {
  httpMethod.toUpperCase match {
    case "POST" => isPostMethod(request)
    case "GET"  => isGetMethod(request)
  }

}

def isPostMethod(request: HttpExchange): Boolean = {
  return request.getRequestMethod.equalsIgnoreCase("POST")
}

def isGetMethod(request: HttpExchange): Boolean = {
  return request.getRequestMethod.equalsIgnoreCase("GET")
}





def replyBack(data: String): String = {
  "";
}

def getData(data: String): String = {
  return data;
}
