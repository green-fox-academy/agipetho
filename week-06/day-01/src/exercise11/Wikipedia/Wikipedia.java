/*
Create a Stream expression which reads all text from this file, and prints
the 100 most common words in descending order.
Keep in mind that the text contains punctuation characters which should be ignored.
 */
package exercise11.Wikipedia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Wikipedia {
  public static void main(String[] args) {

    String fileName = "files/wikipedia.txt";
    Path filePath = Paths.get(fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    String wikipediaString = lines.toString();
    Map<String, Long> mostFrequentWords = lines.stream()
        .flatMap(line -> Arrays.stream(line.split(" ")))
        .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
        .filter(word -> word.length() > 0)
        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));


    List<Map.Entry<String, Long>> result = mostFrequentWords.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(100)
        .collect(Collectors.toList());

    System.out.println(result);
  }
}
