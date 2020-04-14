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
    String wikipediaStringWithoutPunctuation = wikipediaString.replaceAll("\\p{Punct}", " ");
    //alternative found by googling:
    // String wikipediaStringWithoutPunctuation = wikipediaString.replaceAll("\\W", "");
    Map<String, Long> mostFrequentWords = Arrays.stream(wikipediaStringWithoutPunctuation.split(" "))
        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

    mostFrequentWords.remove("");

    List<Map.Entry<String, Long>> result = mostFrequentWords.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(100)
        .collect(Collectors.toList());

    System.out.println(result);
  }
}
