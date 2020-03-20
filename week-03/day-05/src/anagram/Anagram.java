
/*
Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
Create a test for that.*/

package anagram;

import java.util.Arrays;
public class Anagram {
  public static boolean anagram(String a, String b){
    char [] aArray = a.toCharArray();
    char [] bArray = b.toCharArray();

    Arrays.sort(aArray);
    Arrays.sort(bArray);
    return Arrays.equals(aArray, bArray);
  }
}
