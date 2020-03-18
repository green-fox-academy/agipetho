/*Create Station and Car classes
Station
gasAmount
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car
gasAmount
capacity
create constructor for Car where:
initialize gasAmount -> 0
initialize capacity -> 100*/

package petrolstation;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    System.out.println(Station.gasAmount);
    System.out.println(car.gasAmount);
    Station.refill(car);
    System.out.println(Station.gasAmount);
    System.out.println(car.gasAmount);
  }
}
