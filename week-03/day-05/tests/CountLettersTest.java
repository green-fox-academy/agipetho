import countletters.CountLetters;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
  CountLetters countLetters = new CountLetters();
  @Test
  public void createDictionary_withGoodExample() {
    String testWord = "array";
    HashMap<Character, Integer> inputWordArray= new HashMap<>();
    inputWordArray.put('a', 2);
    inputWordArray.put('r', 2);
    inputWordArray.put('y', 1);

    HashMap<Character, Integer> result = countLetters.createDictionary(testWord);
    assertEquals(inputWordArray, result);
  }

  @Test
  public void createDictionary_withWrongExample() {
    String testWord = "array";
    HashMap<Character, Integer> inputWordArray= new HashMap<>();
    inputWordArray.put('a', 3);
    inputWordArray.put('r', 2);
    inputWordArray.put('y', 1);

    HashMap<Character, Integer> result = countLetters.createDictionary(testWord);
    assertEquals(inputWordArray, result);
  }
}