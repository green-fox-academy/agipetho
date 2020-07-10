public class DrawDiagonalSol2 {

  public static void main(String[] args) {
    drawDiagonal(4);
  }

  public static void drawDiagonal(int number) {
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= number; j++) {
        if (i == 1) {
          System.out.print("%");
        } else if (i == number) {
          System.out.print("%");
        } else {
          if (j == 1 || j == i || j == number) {
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
