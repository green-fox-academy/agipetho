package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String reverseString;

  public Gnirts(String string) {
    this.reverseString = reverse(string);
  }

  private String reverse(String string) {
    char[] stringArray = string.toCharArray();
    char[] reversedStringArray = new char[stringArray.length];
    for (int i = 0; i < stringArray.length; i++) {
      reversedStringArray[i] = stringArray[stringArray.length - 1 - i];
    }
    return new String(reversedStringArray);
  }

  @Override
  public int length() {
    return reverseString.length();
  }

  @Override
  public char charAt(int index) {
    return reverseString.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }

  @Override
  public IntStream chars() {
    return null;
  }

  @Override
  public IntStream codePoints() {
    return null;
  }
}
