public class Car {

  String brand;
  int maxSpeed;

  public Car(String brand, int maxSpeed) {
    this.brand = brand;
    this.maxSpeed = maxSpeed;
  }

  public int calculateDistance(int time) {
    return (time * maxSpeed);
  }
}
