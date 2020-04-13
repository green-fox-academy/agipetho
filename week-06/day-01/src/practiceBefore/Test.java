package practiceBefore;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) throws Exception {
    List<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(7);
    myList.add(2);
    myList.add(10);

    BiggerThan f1 = new BiggerThan(1);
    BiggerThan f5 = new BiggerThan(5);
    PrintStuffWithNewLines pnl = new PrintStuffWithNewLines();
    PrintStuffCommaSeparatated pcs = new PrintStuffCommaSeparatated();

    List<Integer> result1 = filter(myList, f1);
    printer(result1, pnl);
    List<Integer> result2 = filter(myList, f5);
    printer(result2, pcs);
  }

  public static List<Integer> filter(List<Integer> listOfIntegers, FancyCallable<Boolean,Integer> callable) throws Exception {
    List<Integer> resultList = new ArrayList<>();
    for (Integer element : listOfIntegers) {
      if(callable.call1(element)){
        resultList.add(element);
      }
    }
    return resultList;
  }

  public static void printer(List<Integer> listOfIntegers, FancyCallable<Boolean,Integer> callable) throws Exception{
    for (Integer element : listOfIntegers){
      callable.call1(element);
    }
  }

}
