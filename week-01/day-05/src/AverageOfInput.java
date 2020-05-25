
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    Scanner numbers = new Scanner(System.in);
    int a = 0;
    for (int i = 1; i <= 5; i++) {
      System.out.println("Type your " + i + ". number:");
      a += numbers.nextInt();
    }
    System.out.println("The sum of your numbers is equal to: " + a + " And the average of them is equal to " + (float) +a / 5);
  }
}
