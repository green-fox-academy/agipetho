package flyable;

public class Helicopter extends Vehicle implements Flyable {

  @Override
  public void land() {
    System.out.println("Helicopter is lading");
  }

  @Override
  public void fly() {
    System.out.println("Helicopter is flying");
  }

  @Override
  public void takeOff() {
    System.out.println("Helicopter is about to take off");
  }
}
