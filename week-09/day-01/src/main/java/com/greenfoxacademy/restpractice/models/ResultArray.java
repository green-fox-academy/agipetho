package com.greenfoxacademy.restpractice.models;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ResultArray {

  private int[] result;

  public ResultArray(int [] numbers)  {
    IntStream intStream = Arrays.stream(numbers);
    result = intStream.map(a -> 2 * a).toArray();
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }
}
