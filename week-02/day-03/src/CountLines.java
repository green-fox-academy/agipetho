// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    String filename = "files/my-file.txt";
    System.out.println(lineCounter(filename));
  }

  public static int lineCounter(String filename) {
    Path filePath = Paths.get("files/my-file.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);

      //int counter = 0;
      //for (String line : lines) {
      //    counter++;
      //}
      //.out.println(counter);
      return lines.size();
    } catch (InputMismatchException | IOException e) {
      return 0;
    }
  }
}
