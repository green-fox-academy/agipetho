package petrolstation;

public class Station {
  static int gasAmount = 56000;

  public static void refill(Car car){
    gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
    //refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
  }
}
