/*
Write a Stream Expression to find the uppercase characters in a string!
 */
package exercise6;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {
    String x = "FeriBAba";
    x.chars().filter(c -> Character.isUpperCase(c)).forEach(c -> System.out.print((char) c + " "));

    //System.out.println(strings.stream().map(String::toUpperCase).collect(Collectors.toList()));


  }
}
