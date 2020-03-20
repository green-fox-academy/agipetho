package cowsandbulls;


import java.util.Random;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    CowsAndBulls cowsAndBulls = new CowsAndBulls();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Guess a 4-digit number!");
      int guessedNumber = scanner.nextInt();
      String result = cowsAndBulls.guess(guessedNumber);
      System.out.println(result);
      if (cowsAndBulls.isTheGameEnded()){
        return;
      }
    }
  }
}
