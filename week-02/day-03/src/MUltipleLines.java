// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class MUltipleLines {
    public static void main(String[] args) {
        multipleLineGenerator("files/my-file.txt", "korte", 8);
    }

    public static void multipleLineGenerator(String path, String word, int number) {
        try {
            Path filePath = Paths.get(path);
            List<String> lines = Files.readAllLines(filePath);

            for (int i = 0; i < number; i++) {
                lines.add(word);
            }
            Files.write(filePath, lines);
        } catch (IOException e){
            System.out.println("could not read file");
        }
    }
}
