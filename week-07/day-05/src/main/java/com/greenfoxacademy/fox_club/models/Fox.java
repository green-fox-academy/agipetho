package com.greenfoxacademy.fox_club.models;

import java.util.List;

public class Fox {
private String name;
private List<Trick> listOfTricks;
private Food food;
private Drink drink;

public Fox(String name){
}

  public String getName() {
    return name;
  }

  public List<Trick> getListOfTricks() {
    return listOfTricks;
  }

  public Food getFood() {
    return food;
  }

  public Drink getDrink() {
    return drink;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setListOfTricks(List<Trick> listOfTricks) {
    this.listOfTricks = listOfTricks;
  }

  public void setFood(Food food) {
    this.food = food;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }
}

