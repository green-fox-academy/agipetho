package com.greenfoxacademy.restpractice.models;

public class DoUntilResult {
  private int result;

  public DoUntilResult(String action, int until) {
    if (action.equals("sum")) {
      result = 0;
      for (int i = 1; i <= until; i++) {
        result += i;
      }
    } else if (action.equals("factor")) {
      result = 1;
      for (int i = 1; i <= until; i++) {
        result *= i;
      }
    }
  }

  public void setResult(int result) {
    this.result = result;
  }

  public Integer getResult() {
    return result;
  }
}
