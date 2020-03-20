import anagram.Anagram;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anagram = new Anagram();

  @org.junit.Test
  public void anagram_WithPositiveResult() {
    String string1 = "dog";
    String string2 = "god";
    boolean result = anagram.anagram(string1, string2);
    assertEquals(true, result);
  }
  @org.junit.Test
  public void anagram_WithNegativeResult() {
    String string1 = "dog";
    String string2 = "goi";
    boolean result = anagram.anagram(string1, string2);
    assertEquals(false, result);
  }



}