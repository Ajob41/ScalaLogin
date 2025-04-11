
import com.sun.net.httpserver.{HttpServer, HttpHandler, HttpExchange}
def isHttpMethodOf(httpMethod:String,request:HttpExchange):Boolean = {
    val whichHttpMethod = if(request.getRequestMethod().equals(httpMethod.toUpperCase())) {
       return isPostMethod(httpMethod,request)
    }
    false;
}

def isPostMethod(httpMethod:String,request:HttpExchange):Boolean = {
    val httpMethodOf = "POST";
    return request.getRequestMethod().equals(httpMethodOf)
}

def isGetMethod(httpMethod:String,request:HttpExchange):Boolean = {
    val httpMethodOf = "GET";
    return request.getRequestMethod().equals(httpMethodOf)
}

def replyBack(data:String):String = {
  "";
}

def getData(data:String):String = {
  return data;
}