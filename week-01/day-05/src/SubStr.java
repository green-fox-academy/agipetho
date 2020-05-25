import java.util.Scanner;

public class SubStr {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type the text you would like to search in");
    String input = scanner.nextLine();
    System.out.println("Type the substring you would like to search for");
    String q = scanner.nextLine();
    System.out.println(input.indexOf(q));
  }
}

