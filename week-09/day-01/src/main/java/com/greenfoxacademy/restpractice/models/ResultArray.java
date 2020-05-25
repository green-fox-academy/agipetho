package com.greenfoxacademy.restpractice.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ResultArray {

  private int[] result;

  public ResultArray(int[] numbers) {
    result = Arrays.stream(numbers).map(a -> 2 * a).toArray();
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }
}
