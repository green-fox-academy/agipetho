
/*
Create a Shifter class implementing this interface
This charsequence can be set up with a string (that is to be shifted) and a number (which will tell how many to shift)
Implement the methods so the returned results of them will be shifted
Shifter s = new Shifter("example", 2);
System.out.println(s.charAt(0));
// should print out: a
 */
package CharSequence;

import java.util.stream.IntStream;

public class Shifter implements CharSequence {
  String stringShifted;
  int index;

  public Shifter(String stringToShifted, int index) {
    this.stringShifted = stringShifter(stringToShifted, index);
    this.index = index;
  }

  private String stringShifter(String stringShifted, int index) {
    char[] stringArrayToBeShifted = stringShifted.toCharArray();
    char[] shiftedStringArray = new char[stringArrayToBeShifted.length];
    for (int i = 0; i < stringArrayToBeShifted.length; i++) {
      shiftedStringArray[i] = stringArrayToBeShifted[(i + index) % stringArrayToBeShifted.length];
    }
    return new String(shiftedStringArray);
  }


  @Override
  public int length() {
    return stringShifted.length();
  }

  @Override
  public char charAt(int index) {

    return stringShifted.charAt(index);
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
