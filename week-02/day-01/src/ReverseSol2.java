import java.util.Arrays;

/*
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`
 */
public class ReverseSol2 {

  public static void main(String[] args) {
    int [] numbers = {3, 4, 5, 6, 7};
    int [] reversed = new int [numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      reversed[i] = numbers[numbers.length-1-i];
    }

    System.out.println(Arrays.toString(reversed));
  }
}
