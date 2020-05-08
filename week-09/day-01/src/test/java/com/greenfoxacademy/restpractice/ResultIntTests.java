package com.greenfoxacademy.restpractice;


import com.greenfoxacademy.restpractice.models.ResultInt;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class ResultIntTests {


  @Test
  public void sumShouldReturnCorrectValue() {
    //Arrange
    int[] numbers = {1, 2, 5, 7};
    ResultInt resultint = new ResultInt();

    //Act
    int result = resultint.sumFunction(numbers);

    //Assert
    Assert.assertEquals(15, result);
  }

  @Test
  public void multiplyShouldReturnCorrectValue() {
    int[] numbers = {1, 2, 5, 7};
    ResultInt resultint = new ResultInt();

    int testResult = resultint.multiplyFunction(numbers);

    Assert.assertEquals(70, testResult);
  }
  @Test
  public void multiplyWith0ShouldReturn0() {
    int[] numbers = {5, 8, 0};
    ResultInt resultint = new ResultInt();

    int result = resultint.multiplyFunction(numbers);

    Assert.assertEquals(0, result);
  }

  @Test
  public void multiplyWithNegativeShouldReturnNegative() {
    int[] numbers = {5, 8, -1};
    ResultInt resultint = new ResultInt();

    int result = resultint.multiplyFunction(numbers);

    Assert.assertEquals(-40, result);
  }

}
