import java.util.ArrayList;

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
  }

  public static int spendingCalc(ArrayList<Integer> input) {
    int sum = 0;
    for (Integer i : input) {
      sum += i;
    }
    return sum;
  }
}
