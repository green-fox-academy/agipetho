package com.greenfoxacademy.restpractice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Doubling {
  @JsonProperty("received")
  private int input;
  @JsonProperty("result")
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