import java.util.List;

public class StringManipulation {

  /*
  .length()
.substring()
.replace()
.charAt()
.equals()
.compareTo()
.toLowerCase()
.contains()
.endsWith()
.startsWith()
.indexOf()
.lastIndexOf()
.split()
   */

  public static void main(String[] args) {
    String test = "A Green Fox Academy egy bootcamp Budapest belvárosában, ahol junior programozóvá válhatsz.";
    String test2 = "A Green Fox Academy egy bootcamp Budapest belvárosában, ahol junior programozóvá válhatsz.";
    String test4 = "A Green Fox Academy egy bootcamp Budapest belvárosában, ahol junior programozóvá válhats";
    String test3 = "A Green Fox Academy";
    String empty = "";
    String alma= "alma";
    String alm = "alm";
    int testLength = test.length();
    System.out.println(testLength);
    System.out.println(test.substring(2, 32));
    String replaced = test.replace("bootcamp", "iskola");
    System.out.println(replaced);
    System.out.println(test.charAt(25));
    boolean isEqual = test.equals(test2);
    boolean isEqual2 = test.equals(test3);
    System.out.println(isEqual);
    System.out.println(isEqual2);
    System.out.println(test.compareTo(test2));
    System.out.println(test.compareTo(test3));
    System.out.println(test.compareTo(test4)); // test4 eggyel rovidebb
    System.out.println(test4.compareTo(test)); //test eggyel hosszabb
    System.out.println(test.charAt(77));
    System.out.println(test.compareTo(empty));
    System.out.println(empty.compareTo(test));
    System.out.println(alma.compareTo(alm));
    System.out.println(alm.compareTo(alma));
    System.out.println(test.toLowerCase());
    System.out.println(test.toUpperCase());
    System.out.println(test.contains("Green"));
    System.out.println(alma.endsWith("ma"));
    System.out.println(test.startsWith("A G"));
    System.out.println(test.indexOf("Green"));
    System.out.println(test.lastIndexOf("sz"));
    String [] listRegex = test.split(" ");

    for ( String word: listRegex) {
      System.out.print(word + " ");
    }
  }
}
