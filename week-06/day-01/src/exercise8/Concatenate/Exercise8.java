
/*
Write a Stream Expression to concatenate a Character list to a string!
 */
package exercise8.Concatenate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    List<Character> characterList = Arrays.asList('a', 'p', 'p', 'l', 'e');
    System.out.println(characterList.stream()
        .map(x -> x.toString()).collect(Collectors.joining()));
  }
}
