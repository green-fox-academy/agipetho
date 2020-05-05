package com.greenfoxacademy.restpractice.models;

import org.springframework.web.bind.annotation.PathVariable;

public class Append {
  private String appendable;
  private String appended;

  public Append(String appendable) {
    this.appendable = appendable;
    this.appended = appendable + "a";
  }


  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
