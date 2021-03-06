
//public class TakesLonger {
//    public static void main(String... args) {
//        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

// When saving this quote a disk error has occurred. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

//        System.out.println(quote);
//    }
//}
public class TakesLonger {
  public static void main(String[] args) {
    StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
    quote = quote.insert(20, " always takes longer than");
    System.out.println(quote);

    String original = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String result = original.replace("It you", "It always takes longer than you");
    System.out.println(result);

    String originalString = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    String stringToBeInserted= "always takes longer than ";
    int index = 20;
    String newString = originalString.substring(0, index + 1)
        + stringToBeInserted
        + originalString.substring(index + 1);
    System.out.println(newString);
  }
}
