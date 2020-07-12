import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
  public static void main(String[] args) {
    HashMap<String, String> telephoneBook = new HashMap<>();
    telephoneBook.put("William A. Lathan", "405-709-1865");
    telephoneBook.put("John K. Miller", "402-247-8568");
    telephoneBook.put("Hortensia E. Foster", "606-481-6467");
    telephoneBook.put("Amanda D. Newland", "319-243-5613");
    telephoneBook.put("Brooke P. Askew", "307-687-2982");

    System.out.println("John K. Miller's phone number is: " + telephoneBook.get("John K. Miller"));

    for (HashMap.Entry<String, String> item : telephoneBook.entrySet()) {
      if (item.getValue().equals("307-687-2982")) {
        System.out.println(item.getKey());
      }
    }
//another solution:
    for (String k : telephoneBook.keySet()) {
      if (telephoneBook.get(k).equals("307-687-2982")) {
        System.out.println(k);
      }
    }

    if (telephoneBook.containsKey("Chris E. Meyers")) {
      System.out.println("Do we know Chris E. Meyers' phone number? YES!");
    } else {
      System.out.println("Do we know Chris E. Meyers' phone number? NOOOOO!");
    }
  }
}
