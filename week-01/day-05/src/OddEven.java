import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner szam = new Scanner(System.in);
    System.out.println("Írj be egy számot!");
    int number = szam.nextInt();

    if ((number % 2) == 0) {
      System.out.println("It's even!");
    } else {
      System.out.println("It's odd!");

    }

  }
}
