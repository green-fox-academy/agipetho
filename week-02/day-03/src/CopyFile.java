import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
public class CopyFile {
    public static void main(String[] args) throws IOException {
        if (fileCopier("files/my-file.txt", "files/my-secondfile.txt")) {
            System.out.println("Hurray!!!!");
        }
        else{
            System.out.println(":(");
        }
    }

    public static boolean fileCopier(String filepathOrigin, String filepathDestination) {
        Path filePathOrigin = Paths.get(filepathOrigin);
        Path filePathDestination = Paths.get(filepathDestination);
        try {
            List<String> content = Files.readAllLines(filePathOrigin);
            Files.write(filePathDestination, content);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}

