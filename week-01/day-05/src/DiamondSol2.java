public class DiamondSol2 {
  public static void main(String[] args) {
    int numberOfRow = 8;

    drawDiamond(numberOfRow);
  }
//todo: befejezni
  public static void drawDiamond(int number) {

    if (number % 2 == 0) {
      for (int i = 1; i <= number / 2; i++) {
        for (int j = 1; j <= number / 2 - i; j++) {
          System.out.print("-");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
          System.out.print("x");
        }
        System.out.println();
      }

      for (int i = number/2 + 1; i < number; i++) {

      }
    }
  }
}
