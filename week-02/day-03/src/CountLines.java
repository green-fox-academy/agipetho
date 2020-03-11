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
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        String filename = "files/my-file.txt";

        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.size());
            int counter = 0;
            for(String line : lines){
                counter++;
            }
            System.out.println(counter);

        } catch (InputMismatchException e) {
            System.out.println("0");
        }
    }
}
