//Create a list ('List A') which contains the following values
//        Apple, Avocado, Blueberries, Durian, Lychee
//        Create a new list ('List B') with the values of List A
//        Print out whether List A contains Durian or not
//        Remove Durian from List B
//        Add Kiwifruit to List A after the 4th element
//        Compare the size of List A and List B
//        Get the index of Avocado from List A
//        Get the index of Durian from List B
//        Add Passion Fruit and Pomelo to List B in a single statement
//        Print out the 3rd element from List A
//        import java.util.ArrayList;

import java.util.ArrayList;

public class ListIntroduction2 {
  public static void main(String[] args) {
    ArrayList<String> listA = new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");

    ArrayList<String> listB = (ArrayList<String>) listA.clone();

    boolean contain = listA.contains("Durian");
    System.out.println(contain);

    listB.remove(3);
    System.out.println(listA);
    System.out.println(listB);

    listA.add(3, "Kiwifruit");
    System.out.println(listA);
    System.out.println(listB);

    boolean whichIsBigger = listA.size() >= listB.size();
    System.out.println(whichIsBigger);

    System.out.println(listA.indexOf("Avocado"));
    System.out.println(listB.indexOf("Durian"));

    listB.add("Passionfruit, Pomelo");
    System.out.println(listB);
    System.out.println(listA.get(3));
  }
}
