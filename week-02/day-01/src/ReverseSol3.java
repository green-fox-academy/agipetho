import java.util.Arrays;

/*
 int[] numbers = {3, 4, 5, 6, 7};
    int[] reverseNumbers = numbers.clone();
    int j = 0;
    for (int i = numbers.length - 1; i > -1; i--) {
      reverseNumbers[j] = numbers[i];
      j++;
    }
    System.out.println("Before reverse: " + Arrays.toString(numbers));
    System.out.println("After reversing: " + Arrays.toString(reverseNumbers));
 */
public class ReverseSol3 {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    int[] reverseNumbers = new int[numbers.length];
    int j = 0;

    for (int i = numbers.length - 1; i >= 0; i--) {
      reverseNumbers[j] = numbers[i];
      j++;
    }
    System.out.println("Before reverse: " + Arrays.toString(numbers));
    System.out.println("After reversing: " + Arrays.toString(reverseNumbers));
  }
}
