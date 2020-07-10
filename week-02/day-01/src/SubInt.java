import java.util.Arrays;
import java.util.List;

//public class SubInt {
//    public static void main(String[] args) {
//        //  Create a function that takes a number and an array of integers as a parameter
//        //  Returns the indices of the integers in the array of which the first number is a part of
//        //  Or returns an empty array if the number is not part of any of the integers in the array
//
//        //  Example:
//        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//        //  should print: `[0, 1, 4]`
//        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//        //  should print: '[]'
//    }
//}
public class SubInt {
  public static void main(String[] args) {
    subInt(1, new int[]{1, 11, 34, 52, 61, 85, 101});
    subInt(9, new int[]{1, 11, 34, 52, 61});
  }

  public static void subInt(int searchFor, int[] searchIn) {
    int lengthOfArray = 0;
    int[] result = new int[searchIn.length];
    String searchedNumber = Integer.toString(searchFor);
    for (int i = 0; i < searchIn.length; i++) {
      String searchedInString = Integer.toString(searchIn[i]);
      if (searchedInString.contains(searchedNumber)) {
        result[lengthOfArray] = i;
        lengthOfArray++;
      }
    }
    int[] resultRevertedToArray = Arrays.copyOfRange(result, 0, lengthOfArray);
    System.out.println(Arrays.toString(resultRevertedToArray));
  }
}
