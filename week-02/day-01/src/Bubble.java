import java.util.Arrays;

public class Bubble {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
  int [] result = bubble(new int[]{34, 12, 24, 9, 5});
    for (int number : result ) {
      System.out.print(number + " ");
    }

    //  should print [5, 9, 12, 24, 34]
    System.out.println();
   int [] result2 = advancedBubble(new int[]{34, 12, 24, 9, 5}, true);
    System.out.println(Arrays.toString(result2));
    //  should print [34, 24, 12, 9, 5]
  }

  public static int[] bubble(int[] input) {
    Arrays.sort(input);
    return input;
  }

  public static int[] advancedBubble(int[] input, boolean isTrue) {
    Arrays.sort(input);
    if (isTrue) {
      int[] result = new int[input.length];
      for (int i = 0; i < input.length; i++) {
        result[i] = input[input.length - 1 - i];
      }
      return result;
    } else {
      return input;
    }
  }
}
