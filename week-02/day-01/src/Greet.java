import java.util.Arrays;

//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Green Fox`
// - Greet `al`
public class Greet {
  public static void main(String[] args) {
    String al = "Agi";
    greet(al);
  }

  public static void greet(String al) {
    System.out.println("Greetings dear, " + al);
  }
}
