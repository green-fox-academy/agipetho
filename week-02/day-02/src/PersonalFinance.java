import java.util.ArrayList;
import java.util.List;

public class PersonalFinance {
  public static void main(String[] args) {
    ArrayList<Integer> mySpendings = new ArrayList();
    mySpendings.add(500);
    mySpendings.add(1000);
    mySpendings.add(1250);
    mySpendings.add(175);
    mySpendings.add(800);
    mySpendings.add(120);
    System.out.println("How much did we spend? :" + spendingCalc(mySpendings));
    maxMinSpending(mySpendings);
  }

  public static int spendingCalc(ArrayList<Integer> input) {
    int sum = 0;
    for (Integer i : input) {
      sum += i;
    }
    return sum;
  }

  public static void maxMinSpending(List<Integer> input){
    input.sort(Integer::compareTo);
    System.out.println(input.get(0));
    System.out.println(input.get(input.size()-1));
    int sum = 0;
    for (int i = 0; i < input.size()-1 ; i++) {
      sum += input.get(i);
    }
    System.out.println("averge: " + sum/input.size());
  }
}
