import fibonacci.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  Fibonacci fibonacci = new Fibonacci();

  @Test
  public void computeFibonacciNNumber_withSimpleIndex_goodResult() {
    int testIndex = 4;
    int result = Fibonacci.computeFibonacciNNumber(testIndex);
    assertEquals(3, result);
  }
  @Test
  public void computeFibonacciNNumber_at0() {
    int testIndex = 0;
    int result = Fibonacci.computeFibonacciNNumber(testIndex);
    assertEquals(0, result);
  }
  @Test
  public void computeFibonacciNNumber_at1() {
    int testIndex = 1;
    int result = Fibonacci.computeFibonacciNNumber(testIndex);
    assertEquals(1, result);
  }

  @Test
  public void computeFibonacciNNumber_atABigNumber() {
    int testIndex = 12;
    int result = Fibonacci.computeFibonacciNNumber(testIndex);
    assertEquals(144, result);
  }
}