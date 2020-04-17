package com.greenfoxacademy.basicwebshop.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItems {

  private List<ShopItem> shopItems;

  public ShopItems() {
    shopItems = new ArrayList<>();

    ShopItem item1 = new ShopItem("Basketball", "Whilson Basketball", 25000, 1);
    ShopItem item2 = new ShopItem("Souvenir", "Souvenir with ZsebeFeri pic", 2000, 5);
    ShopItem item3 = new ShopItem("Isotonic drink", "Isotonic drink for athlets", 500, 100);
    ShopItem item4 = new ShopItem("Home Kit", "BC Kormend Official home kit", 48000, 2);
    ShopItem item5 = new ShopItem("Baseball cap", "Adidas baseball cap", 4200, 0);
   shopItems.add(item1);
   shopItems.add(item2);
   shopItems.add(item3);
   shopItems.add(item4);
   shopItems.add(item5);

  }

  public void addShopItem(ShopItem shopItem) {
    shopItems.add(shopItem);
  }

  public List<ShopItem> getShopItems() {
    return shopItems;
  }

  //TODO: here comes all the streams....

  public List<ShopItem> onlyAvailable(){
    return shopItems.stream()
        .filter(x -> x.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
  }
}
