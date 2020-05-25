//public class ReversedOrder {

//   public static void main(String[] args) {
// Create a method that decrypts reversed-order.txt


//    }
//}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    reverseDecoder("files/reversed-order.txt", "files/decodedreversed-order.txt");
  }

  public static void reverseDecoder(String pathSource, String pathDestination) {
    Path filepathSource = Paths.get(pathSource);
    Path filepathDestination = Paths.get(pathDestination);
    try {
      List<String> lines = Files.readAllLines(filepathSource);
      List<String> linesDecoded = new ArrayList<String>();
      for (int i = 0; i < lines.size(); i++) {
        linesDecoded.add(lines.get(lines.size() - i - 1));

        //alternative:
        //String currentLine = lines.get((lines.size()-i-1));
        //linesDecoded.add(currentLine);
      }
      Files.write(filepathDestination, linesDecoded);
    } catch (IOException e) {
      System.out.println("could not read file");
    }
  }
}

