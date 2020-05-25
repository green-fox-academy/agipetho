import java.util.Scanner;

public class DrawChessTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many rows? ");
    int numberofRows = input.nextInt();

    for (int i = 1; i <= numberofRows; i++) {
      if (i % 2 == 0) {
        System.out.print(" ");
      }
      System.out.print("% % % %");
      System.out.println("");
    }
  }
}
