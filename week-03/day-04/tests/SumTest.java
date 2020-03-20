import org.junit.Test;
import sum.Sum;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {


  Sum sum = new Sum();
  @Test
  public void getSum_WithAnEmptyList() {
    ArrayList<Integer> input = new ArrayList(Arrays.asList());
    int result = sum.getSum(input);
    assertEquals(0, result);
  }
  @Test
  public void getSum_WithOneElement() {
    ArrayList<Integer> input = new ArrayList(Arrays.asList(5));
    int result = sum.getSum(input);
    assertEquals(5, result);
  }
  @Test
  public void getSum_WithAMultipleOnlyPositiveElements() {
    ArrayList<Integer> input = new ArrayList(Arrays.asList(12, 56, 43));
    int result = sum.getSum(input);
    assertEquals(111, result);
  }
  @Test
  public void getSum_WithMultipleMixedElements() {
    ArrayList<Integer> input = new ArrayList(Arrays.asList(5, -78));
    int result = sum.getSum(input);
    assertEquals(-73, result);
  }
  @Test
  public void getSum_WithMultipleNegativeElements() {
    ArrayList<Integer> input = new ArrayList(Arrays.asList(78, -44, -78, -33));
    int result = sum.getSum(input);
    assertEquals(-77, result);
  }
    @Test
    public void getSum_WithOne0() {
      ArrayList<Integer> input = new ArrayList(Arrays.asList(0));
      int result = sum.getSum(input);
      assertEquals(0, result);
    }
    @Test
    public void getSum_WithNull() {
      ArrayList<Integer> input = null;
      int result = sum.getSum(input);
      assertEquals(0, result);
    }
  }