import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Írj be egy számot!");
    int triangleNumber = scanner.nextInt();

    for (int i = 1; i <= triangleNumber; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    main2();
  }

  public static void main2() {
    int triangleNo = 5;
    String input = "";
    for (int i = 1; i <= triangleNo; i++) {
      input+="*";
      System.out.println(input);
    }
  }
}