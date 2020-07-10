public class DrawChessTableSol2 {

  public static void main(String[] args) {
    drawChessTable();
  }

  public static void drawChessTable() {
    for (int i = 1; i <= 12; i++) {
      for (int j = 1; j <= 12; j++) {
        if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
          System.out.print("%");
        } else {
          System.out.print("-");
        }
      }
      System.out.println();
    }
  }
}
