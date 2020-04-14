/*
Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
"ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
 */
package exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise7 {
  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
        "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    //with forEach:
    cities.stream()
        .filter(city -> city.startsWith("A"))
        .forEach(System.out::println);

    //with Collector:
    System.out.println(cities.stream()
        .filter(city -> city.startsWith("A"))
        .collect(Collectors.toList()));
  }
}