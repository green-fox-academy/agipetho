package com.greenfoxacademy.di.coloringaround;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class RedColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
