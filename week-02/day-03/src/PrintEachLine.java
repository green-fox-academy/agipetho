//public class PrintEachLine {
//    public static void main(String[] args) {
//         Write a program that opens a file called "my-file.txt", then prints
//         each line from the file.
//         If the program is unable to read the file (for example it does not exist),
//         then it should print the following error message: "Unable to read file: my-file.txt"
//
//    }
//}


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    Path filePath = Paths.get("files/my-file.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line);
      }

    } catch (Exception e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}


//public class ReadFile {
//    public static void main(String[] args) {
//        try { // Required by Files.readAllLines(filePath);
//             Reads the content from `lorem-ipsum.txt` in the `assets` folder line by line to a String List
//            Path filePath = Paths.get("assets/lorem-ipsum.txt");
//            List<String> lines = Files.readAllLines(filePath);
//            System.out.println(lines.get(0)); // Prints the first line of the file
//        } catch (Exception e) {
//            System.out.println("Uh-oh, could not read the file!");
//        }
//    }
//}
