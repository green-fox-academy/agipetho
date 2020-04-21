package com.greenfoxacademy.bank_app.models;



public class BankAccount {
  private String name;
  private int balance;
  private String animalType;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
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
}
