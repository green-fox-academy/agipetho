import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UniquSol2 {

  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34, 2, 22, 2});
    System.out.println(Arrays.toString(unique2(new int[]{1, 11, 34, 11, 52, 61, 1, 34, 2, 22, 2})));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  public static void unique(int[] inputArray) {
    HashMap<Integer, Integer> myHashMap = new HashMap<>();

    for (Integer number : inputArray) {
      Integer counter = myHashMap.get(number);
      myHashMap.put(number, counter == null ? 1 : counter + 1);
    }
    System.out.println(myHashMap.keySet());
  }

  public static int[] unique2(int[] inputArray) {
    Arrays.sort(inputArray);
    int[] resultArray = new int[inputArray.length];
    int lengthOfNewArray = 0;
    for (int i = 0; i < inputArray.length - 1; i++) {
      if (inputArray[i] != inputArray[i + 1]) {
        resultArray[lengthOfNewArray] = inputArray[i];
        lengthOfNewArray++;
      }
    }

    int finalResult[] = Arrays.copyOfRange(resultArray, 0, lengthOfNewArray);
    System.out.println(Arrays.toString(finalResult));
    return finalResult;
  }
}

