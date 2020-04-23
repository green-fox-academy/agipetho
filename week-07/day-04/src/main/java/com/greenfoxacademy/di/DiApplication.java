package com.greenfoxacademy.di;

import com.greenfoxacademy.di.helloDI.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {

  private Printer printer;

  @Autowired
  public DiApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
  }
}
/*
@SpringBootApplication
public class DependencyinjectionApplication implements CommandLineRunner {
  private Printer printer;
  @Autowired
  DependencyinjectionApplication(Printer printer) {
    this.printer = printer;
  }
  public static void main(String[] args) {
    SpringApplication.run(DependencyinjectionApplication.class, args);
  }
  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
  }
}
*/
