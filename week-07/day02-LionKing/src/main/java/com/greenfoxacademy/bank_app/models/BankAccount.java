package com.greenfoxacademy.bank_app.models;


public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private boolean isAKing;
  private boolean isGoodGuy;

  public BankAccount(String name, int balance, String animalType, boolean isAKing, boolean isGoodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isAKing = isAKing;
    this.isGoodGuy = isGoodGuy;
  }

  public boolean getIsGoodGuy() {
    return isGoodGuy;
  }

  public void setGoodGuy(boolean goodGuy) {
    isGoodGuy = goodGuy;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean getIsAKing() {
    return isAKing;
  }

  public void setIsAKing(boolean AKing) {
    isAKing = AKing;
  }
}
