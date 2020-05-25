import static org.junit.Assert.*;

public class CarTest {

  @org.junit.Test
  public void calculateDistance() {
    Car volvo = new Car("Volvo", 180);
    assertEquals(360, volvo.calculateDistance(2));
  }
}