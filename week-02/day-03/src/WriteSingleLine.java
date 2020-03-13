import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

//public class WriteSingleLine {
//    public static void main(String[] args) {
// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

//    }
//}
public class WriteSingleLine {
    public static void main(String[] args) throws IOException {
        Path myFile = Paths.get("files/my-file.txt");
        List<String> fileContent = Files.readAllLines(myFile);
        fileContent.add("Agnes Petho");
        for (String line : fileContent) {
            System.out.println(line);
        }
//        Files.write("files/my-file.txt", "Agi");
    }
}