
// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type two different numbers!");
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    boolean isFirstBigger = (number1 > number2);
    if (isFirstBigger == true) {
      System.out.println("The bigger one is: " + number1);
    } else {
      System.out.println("The bigger one is: " + number2);
    }

  }
}
