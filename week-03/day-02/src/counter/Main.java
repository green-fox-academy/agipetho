package counter;

public class Main {
  public static void main(String[] args) {
    Counter counter1 = new Counter();
    Counter counter2 = new Counter(45);

    counter2.add(41);
    counter1.add();
    counter1.get();
    counter2.reset();
  }
}
