package cowsandbulls;


import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Random random = new Random();
    int numberOfCAB =1000+random.nextInt(8999); //not to have 3-digit random numbers, any other solution?
    //int n = (int) Math.random()*9999 + 1000;
    System.out.println(numberOfCAB); // this is just for me to check
    CowsAndBulls cowsAndBulls = new CowsAndBulls();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Guess a 4-digit number!");
      int guessedNumber = scanner.nextInt();
      String result = cowsAndBulls.guess(guessedNumber,numberOfCAB);
      System.out.println(result);
      if (cowsAndBulls.isTheGameEnded()) {
        return;
      }
    }
  }
}
