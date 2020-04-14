
/*
Write a Stream Expression to find the frequency of characters in a given string!
 */
package exercise9.FindFrequencyInAString;


import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise9 {
  public static void main(String[] args) {
    String string = "Write a Stream Expression to find the frequency of characters in a given string!";

    Map<String, Long> frequentChars = Arrays.stream(string.split(""))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    frequentChars.forEach((k, v) -> System.out.println(k + ":" + v));
    //     .forEach((k, v) -> System.out.println(k + ":" + v);
  }
}

