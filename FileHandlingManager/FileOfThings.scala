package FileHandlingManager;
import java.io.File
import java.io.BufferedReader
import java.io.FileReader

def doesFileExist(fileName: String): Boolean = {
  return new File(fileName).exists();
}

def fileDoesExist(fileName: String): Boolean = {
  return doesFileExist(fileName) == true;
}

def getFileData(fileName: String): String = {
  var fileContent = "";
  if fileDoesExist(fileName) then {
    val file = BufferedReader(new FileReader(fileName));
    var line = file.readLine();
    while (line != null) do {
      fileContent += line;
      line = file.readLine();
    }
  }

  return fileData(fileContent);
}

def fileData(data: String): String = {
  return data;
}
