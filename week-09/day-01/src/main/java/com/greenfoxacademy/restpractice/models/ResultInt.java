package com.greenfoxacademy.restpractice.models;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ResultInt {

  private int result;

  public ResultInt (String what, int[] numbers) {
    switch (what) {
      case "sum":
        result = sumFunction(numbers);
        break;
      case "multiply":
        result = multiplyFunction(numbers);
        break;
      default:
        result = 0;
    }
  }

  public int sumFunction(int[] numbers) {
    IntStream intStream = Arrays.stream(numbers);
    return intStream.sum();
  }

  public int multiplyFunction(int[] numbers) {
    IntStream intStream = Arrays.stream(numbers);
    return intStream.reduce(1, (a, b) -> a * b);
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
