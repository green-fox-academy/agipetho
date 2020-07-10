public class PyramidSol2 {

  public static void main(String[] args) {
    int numberOfRowOfPyramid = 5;

    for (int i = 1; i <= numberOfRowOfPyramid; i++) {
      for (int j = 1; j <= numberOfRowOfPyramid - i; j++) {
        System.out.print("-");
      }
      for (int k = 1; k <= ((2 * i) - 1); k++) {
        System.out.print("x");
      }
      System.out.println();
    }
  }
}
