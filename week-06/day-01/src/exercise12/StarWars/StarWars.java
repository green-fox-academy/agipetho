/*
The swcharacters.csv file contains the list of characters appeared in the Star Wars universe.

"BBY" stands for Before the Battle of Yavin, it's the "year zero" in the Galactic Standard Calendar.
For the age calculation let's assume that it's "year zero" and every character lives for the sake of simplicity.

Create Stream expressions to perform the following exercises:

Print the name of the heaviest character (if the mass is unknown, ignore that character)
Print the average height of the male characters
Print the average height of the female characters
💪 Get the age distribution of the characters by gender (where the gender can be "male", "female" and "other")
The age groups are: "below 21", "between 21 and 40", "above 40" and "unknown"
The result should be a Map<String, Map<String, Integer>>
 */

package exercise12.StarWars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StarWars {
  public static void main(String[] args) {
    String fileName = "files/sw.txt";
    Path filePath = Paths.get(fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something went wrong with reading");
      System.exit(-1);
    }
    lines.stream()
        .
    // String[] elementsOfTheLine = line.split(" ");

  }
}
/*
 public static Map<String, Long> getFirstTenCommonWord(String fileName) {
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(Paths.get(fileName));
    } catch (NoSuchFileException e) {
      System.out.println("File doesn't exists");
      System.exit(-1);
    } catch (IOException e) {
      System.out.println("Something went wrong with reading");
      System.exit(-1);
    }
    Map<String, Long> firstHoundredCommonWordWithFrequencies =
        lines.stream()
            .flatMap(line -> Arrays.stream(line.split(" ")))
            .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
            .filter(word -> word.length() > 0)
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
            .entrySet()
            .stream()
            .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
            .limit(100)
            .collect(Collectors.toMap(
                word -> word.getKey(),
                word -> word.getValue(),
                (k, v) -> {
                  throw new IllegalStateException(String.format("Duplicate key %s", k));
                },
                LinkedHashMap::new
            ));
    return firstHoundredCommonWordWithFrequencies;
  }
 */