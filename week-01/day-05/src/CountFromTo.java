// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

//import javax.swing.*;

import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Give me your first number!");
    int number1 = input1.nextInt();

    for (int i = 1; i < 999999; i++) {
      Scanner input2 = new Scanner(System.in);
      System.out.println("Give me your second number!");
      int number2 = input2.nextInt();
      if (number2 <= number1) {
        System.out.println("The second number should be bigger. Give me your second number again!");
      } else {
        for (int j = number1; j < number2; j++) {
          System.out.println(j);
        }
        return;
      }
    }
  }
}
