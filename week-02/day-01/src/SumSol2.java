/*
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
 */

public class SumSol2 {

  public static void main(String[] args) {
    int number = 6;
    System.out.println(sum(number));
  }

  public static int sum(int number) {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    return sum;
  }
}
