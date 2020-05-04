package com.greenfoxacademy.restpractice.models;

public class Doubling {
  private int input;
  private int output;

  public Doubling(int input) {
    this.input = input;
    this.output = 2 * this.input;
  }

  public int getInput() {
    return input;
  }

  public void setInput(int input) {
    this.input = input;
  }

  public int getOutput() {
    return output;
  }

  public void setOutput(int output) {
    this.output = output;
  }
}