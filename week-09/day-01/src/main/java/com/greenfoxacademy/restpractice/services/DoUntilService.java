package com.greenfoxacademy.restpractice.services;


import com.greenfoxacademy.restpractice.models.DoUntilRequest;
import com.greenfoxacademy.restpractice.models.DoUntilResult;
import org.springframework.stereotype.Service;


//TODO: build a proper service for DoUntil
@Service
public class DoUntilService {
  DoUntilRequest doUntilRequest;
  DoUntilResult doUntilResult;

  public Integer generateDoUntil(String action, int until) {
    int result = 0;
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
    return result;
  }
}
