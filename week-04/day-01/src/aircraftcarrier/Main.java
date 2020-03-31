package aircraftcarrier;

public class Main {

  public static void main(String[] args) {
    Carrier carrier = new Carrier(500, 100);
    carrier.add("F35");
    carrier.getStatus();
    carrier.fill();
    carrier.getStatus();
    carrier.fight(carrier);
    carrier.getStatus();
  }
}
