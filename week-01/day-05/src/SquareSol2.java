public class SquareSol2 {

  public static void main(String[] args) {
    drawSquare(10);
  }

  public static void drawSquare(int number) {
    for (int i = 1; i <= number; i++) {
      System.out.print("%");
    }
    System.out.println();

    for (int i = 2; i <= number - 1; i++) {
      System.out.print("%");
      for (int j = 1; j < number-1; j++) {
        System.out.print("-");
      }
      System.out.println("%");
    }
    System.out.println();

    for (int i = 1; i <= number; i++) {
      System.out.print("%");
    }
  }
}
