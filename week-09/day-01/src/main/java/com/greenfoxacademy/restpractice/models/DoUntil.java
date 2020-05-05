package com.greenfoxacademy.restpractice.models;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public class DoUntil {
  private Integer until;
  //private Integer result;
  //resultnak kulon osztalyt kellene csina;ni
  //kulon a requestnek
  public DoUntil() {
  }
//
////a logikat kulon kell csinalni-controllerben (de nem itt  a legjobb) vagy service-ben
//  public DoUntil(Optional<String> action, int until) {
//    if (action.equals("sum")) {
//      result = 0;
//      for (int i = 1; i <= until; i++) {
//        result += i;
//      }
//    } else if (action.equals("factor")) {
//      result = 1;
//      for (int i = 1; i <= until; i++) {
//        result *= i;
//      }
//    }
//  }
//
  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }
//
//  public Integer getResult() {
//    return result;
//  }
//
//  public void setResult(Integer result) {
//    this.result = result;
//  }
}
