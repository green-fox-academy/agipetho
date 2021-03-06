package com.greenfoxacademy.basicwebshop.models;

import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItems {

  private List<ShopItem> shopItems;

  public ShopItems() {
    shopItems = new ArrayList<>();

    ShopItem item1 = new ShopItem("Basketball", "Wilson Basketball", 25000, 1);
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

  public List<ShopItem> onlyAvailable() {
    return shopItems.stream()
        .filter(x -> x.getQuantityOfStock() > 0)
        .collect(Collectors.toList());
  }

  public List<ShopItem> cheapestFirst() {
    return shopItems.stream()
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList());
  }

  public List<ShopItem> containsWilson() {
    return shopItems.stream()
        .filter(c -> c.getDescription().contains("Wilson") || c.getName().contains("Wilson"))
        .collect(Collectors.toList());
  }

  public String averageStock() {
    return ("The average stock: " + (shopItems.stream()
        .mapToInt(c -> c.getQuantityOfStock())
        .average()
        .getAsDouble()));
  }

  public String mostExpensive() {
    return ("The most expensive item: " + (shopItems.stream()
        .max(Comparator.comparing(ShopItem::getPrice))
        .get()
        .getName()));
  }

  public List<ShopItem> search(String searchInput) {
    return shopItems.stream()
        .filter(c -> c.getDescription().toLowerCase().contains(searchInput.toLowerCase()) ||
            c.getName().toLowerCase().contains(searchInput.toLowerCase()))
        .collect(Collectors.toList());
  }
}
