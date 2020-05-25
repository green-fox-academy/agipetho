/*Write a function that computes a member of the fibonacci sequence by a given index
    Create tests for multiple test cases.
*/


package fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
  public static int computeFibonacciNNumber(int index) {
    if (index == 0 || index == 1) {
      return index;
    } else {
      return computeFibonacciNNumber(index - 1) + computeFibonacciNNumber(index - 2);
    }
  }

  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();
    fibonacci.computeFibonacciNNumber(12);
  }
}