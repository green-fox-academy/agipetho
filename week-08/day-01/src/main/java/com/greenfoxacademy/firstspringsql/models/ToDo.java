package com.greenfoxacademy.firstspringsql.models;

import javax.persistence.*;

/*
Map the Todo class to the embedded database
Use relevant annotations
Make the id field auto-generated, incrementing value
In the list method of the Controller use the repository to find all elements and add them to the model as "todos" attribute
 */
@Entity
@Table
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public ToDo() {
  }

  public ToDo(String title) {
    this.title = title;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setIsDone(boolean done) {
    isDone = done;
  }
}
