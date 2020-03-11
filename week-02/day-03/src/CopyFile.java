import java.nio.file.Path;
import java.nio.file.Paths;

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
public class CopyFile {
    public static void main(String[] args) {
        fileCopier();
    }

    public static void fileCopier (String filename1, String filename2){
        Path path1 = Paths.get("files/my-file.txt");
        Path path2 = Paths.get();
    }

}
