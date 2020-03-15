//public class ReversedLines {
//
//    public static void main(String[] args) {
// Create a method that decrypts reversed-lines.txt


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//    }
//}
public class ReversedLines {
  public static void main(String[] args) {

    dereverser("files/reversed.txt", "files/reversed_decoded.txt");
  }

  public static void dereverser(String pathSource, String pathDestination) {
    Path filepathSource = Paths.get(pathSource);
    Path filepathDestination = Paths.get(pathDestination);
    try {
      List<String> lines = Files.readAllLines(filepathSource);
      List<String> linesDecoded = new ArrayList<String>();
      for (String line : lines) {
        char[] characters = line.toCharArray();
        char[] charactersDecoded = new char[characters.length];
        for (int i = 0; i < characters.length; i++) {
          charactersDecoded[i] = characters[characters.length - 1 - i];
        }
        linesDecoded.add(new String(charactersDecoded));
      }
      Files.write(filepathDestination, linesDecoded);
    } catch (IOException e) {
      System.out.println("could not read file");
    }
  }
}

