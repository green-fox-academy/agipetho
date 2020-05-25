import java.util.Arrays;

//Create a function named is anagram following your current language's style guide.
//        It should take two strings and return a boolean value depending on whether its an anagram or not.
public class Anagram {
  public static void main(String[] args) {
    String firstWord = "dog";
    String secondWord = "god";
    System.out.println(anagram(firstWord, secondWord));
  }

  public static boolean anagram(String a, String b) {
    char[] aArray = a.toCharArray();
    char[] bArray = b.toCharArray();

    Arrays.sort(aArray);
    Arrays.sort(bArray);
    return Arrays.equals(aArray, bArray);
  }
}
