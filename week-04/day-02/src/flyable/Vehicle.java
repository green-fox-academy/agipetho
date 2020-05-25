/*Create an abstract Vehicle class
it should have at least 3 fields

 */

package flyable;

public abstract class Vehicle {
  protected String brand;
  protected int maxSpeed;
  protected int maxPeople;

  public Vehicle() {

  }

  public Vehicle(String brand, int maxSpeed, int maxPeople) {
    this.brand = brand;
    this.maxSpeed = maxSpeed;
    this.maxPeople = maxPeople;
  }

  public static void main(String[] args) {
    Helicopter helicopter1 = new Helicopter();
    helicopter1.fly();
  }

}
