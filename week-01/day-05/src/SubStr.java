import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type the text you would like to search in");
    String input = scanner.nextLine();
    System.out.println("Type the substring you would like to search for");
    String q = scanner.nextLine();
    System.out.println(subStr(input, q));
    }
    public static int subStr(String input, String q) {
        return input.indexOf(q);
    }
}
//
//    public static int subStr(String input, String q) {
//        if (input.contains(q)) {
//            int indexOfStart = input.indexOf(q);
//            return indexOfStart;
//        }else {
//            return -1;
//        }
//    }
//    }
