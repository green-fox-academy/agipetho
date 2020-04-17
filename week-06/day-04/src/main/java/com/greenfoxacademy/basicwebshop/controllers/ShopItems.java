package com.greenfoxacademy.basicwebshop.controllers;

import java.util.ArrayList;
import java.util.List;

public class ShopItems {

  private List<ShopItem> shopItems;

  public ShopItems() {
    shopItems = new ArrayList<>();
  }
public void addShopItem(ShopItem shopItem){
    shopItems.add(shopItem);
}

  public List<ShopItem> getShopItems() {
    return shopItems;
  }
}
