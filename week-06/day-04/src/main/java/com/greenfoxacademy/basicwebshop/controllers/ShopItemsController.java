package com.greenfoxacademy.basicwebshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShopItemsController {

  
  @RequestMapping(value = "/web/greeting", method = RequestMethod.GET)
  public String greeting(Model model) {

    ShopItems bcKormendShopeItems = new ShopItems();
    ShopItem item1 = new ShopItem("Basketball", "Whilson Basketball", 25000, 1);
    ShopItem item2 = new ShopItem("Souvenir", "Souvenir with ZsebeFeri pic", 2000, 5);
    ShopItem item3 = new ShopItem("Isotonic drink", "Isotonic drink for athlets", 500, 100);
    ShopItem item4 = new ShopItem("Home Kit", "BC Kormend Official home kit", 48000, 2);
    ShopItem item5 = new ShopItem("Baseball cap", "Adidas baseball cap", 4200, 0);

    bcKormendShopeItems.addShopItem(item1);
    bcKormendShopeItems.addShopItem(item2);
    bcKormendShopeItems.addShopItem(item3);
    bcKormendShopeItems.addShopItem(item4);
    bcKormendShopeItems.addShopItem(item5);

    model.addAttribute("name", " World");
    return "greeting";
  }
}


