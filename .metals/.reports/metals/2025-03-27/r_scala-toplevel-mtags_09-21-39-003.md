error id: file:///C:/Users/amiin/Desktop/ScalaLogin/FileManager/FileOfThings.scala:[410..410) in Input.VirtualFile("file:///C:/Users/amiin/Desktop/ScalaLogin/FileManager/FileOfThings.scala", "package FileManager;
import java.io.File
def fileExists(fileName:String):(String,Boolean) = {
    var file = new File(fileName);
    if file.exists() then return ("file does exist",true)
    else if !file.exists() then return ("file does not exist",false)
    else if file.isDirectory() then ("is directory",false)
    else if file.isFile() then ("is file",true)
    return ("unknow", false)
}

def ")
file:///C:/Users/amiin/Desktop/ScalaLogin/FileManager/FileOfThings.scala:12: error: expected identifier; obtained eof
def 
    ^
#### Short summary: 

expected identifier; obtained eof