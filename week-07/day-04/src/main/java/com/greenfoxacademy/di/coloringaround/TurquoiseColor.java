package com.greenfoxacademy.di.coloringaround;

import com.greenfoxacademy.di.helloDI.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurquoiseColor implements MyColor {
  private Printer printer;

  @Autowired
  public TurquoiseColor(Printer printer) {
    this.printer = printer;
  }


  @Override
  public void printColor() {
    printer.log("It is turqouise in color...");
  }
}
