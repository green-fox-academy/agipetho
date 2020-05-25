import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Írj be egy számot!");
    int squareNumber = scanner.nextInt();

    for (int i = 1; i <= squareNumber; i++) {

      for (int j = 1; j <= squareNumber; j++) {
        if (i == 1) {
          System.out.print("%");
        } else if (i == squareNumber) {
          System.out.print("%");
        } else {
          if (j == 1 || j == i || j == squareNumber) {
            System.out.print("%");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
