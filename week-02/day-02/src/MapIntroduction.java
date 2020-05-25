
//        Print all the keys
//
//        Print all the values
//
//        Add value D with the key 68
//
//        Print how many key-value pairs are in the map
//
//        Print the value that is associated with key 99
//
//        Remove the key-value pair where with key 97
//
//        Print whether there is an associated value with key 100 or not
//
//        Remove all the key-value pairs

import java.util.HashMap;

public class MapIntroduction {
  public static void main(String[] args) {
    HashMap<Integer, String> myFirstMap = new HashMap<>();
    System.out.println(myFirstMap);
    myFirstMap.put(97, "a");
    myFirstMap.put(98, "b");
    myFirstMap.put(99, "c");
    myFirstMap.put(65, "A");
    myFirstMap.put(66, "B");
    myFirstMap.put(67, "C");
    System.out.println(myFirstMap);

    for (Integer key : myFirstMap.keySet()) {
      System.out.println(key);
    }
  }
}
