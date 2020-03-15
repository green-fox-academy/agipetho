// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Practice {
  public static void main(String[] args) {
    System.out.println(fileCopier("files/reversed-order.txt", "files/my-file.txt"));
  }

  public static boolean fileCopier(String file1, String file2) {
    Path firstPath = Paths.get(file1);
    Path secondPath = Paths.get(file2);

    try {
      List<String> firstLines = Files.readAllLines(firstPath);
      Files.write(secondPath, firstLines);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
