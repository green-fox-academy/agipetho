package com.greenfoxacademy.basicwebshop.controllers;

public class ShopeItem {
  private String name;
  private String description;
  private int price;
  private int quantityOfStock;

  public ShopeItem(String name, String description, int price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }
}
