
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class ParameticAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many numbers do you want to add?");
    int numberOfNumbers = input.nextInt();
    int sum = 0;
    for (int i = 1; i <= numberOfNumbers; i++) {
      System.out.println("Give me your number - " + i + ":");
      int yourNumber = input.nextInt();
      sum += yourNumber;
    }
    System.out.println("The sum of your numbers is: " + sum + " , and the average is: " + (double) sum / numberOfNumbers + ".");
  }
}
