import java.util.Arrays;

public class PalindromeBuilder {

  public static void main(String[] args) {
    String input = "greenfox";
    System.out.println(palindromBuilder(input));
    System.out.println(palindromBuilder2(input));
    System.out.println(palindromBuilder3(input));
  }


    public static String palindromBuilder(String baseOfPalindrome) {
      char array[] = baseOfPalindrome.toCharArray();
      String palindrome = "";
      int lengthOfPalindrome = baseOfPalindrome.length();
      for (int i = 0; i < lengthOfPalindrome; i++) {
        palindrome += array[i];
      }
      for (int i = 0; i < lengthOfPalindrome; i++) {
        palindrome += array[lengthOfPalindrome - i - 1];
      }
      return palindrome;
    }


  public static String palindromBuilder2(String input) {
    char[] inputAsArray = input.toCharArray();
    char[] resultArray = new char[inputAsArray.length];
    for (int i = inputAsArray.length - 1; i >= 0; i--) {
      resultArray[inputAsArray.length - 1 - i] = inputAsArray[i];
    }

    String part2 = Arrays.toString(resultArray);
    String palindrome = input + part2;
    return palindrome;
  }

  public static String palindromBuilder3(String input) {
    char[] inputAsArray = input.toCharArray();
    char[] secondArray = new char[inputAsArray.length];
    for (int i = inputAsArray.length - 1; i >= 0; i--) {
      secondArray[inputAsArray.length - 1 - i] = inputAsArray[i];
    }
    for (char c : secondArray) {
      input += c;
    }
    return input;
  }
}
