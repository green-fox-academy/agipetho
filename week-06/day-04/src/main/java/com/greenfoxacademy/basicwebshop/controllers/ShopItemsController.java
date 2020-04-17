package com.greenfoxacademy.basicwebshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShopItemsController {
  ShopeItem item1 = new ShopeItem("Basketball", "Whilson Basketball", 25000, 1);
  ShopeItem item2 = new ShopeItem("Souvenir", "Souvenir with ZsebeFeri pic", 2000, 5);
  ShopeItem item3 = new ShopeItem("Isotonic drink", "Isotonic drink for athlets", 500, 100);
  ShopeItem item4 = new ShopeItem("Home Kit", "BC Kormend Official home kit", 48000, 2);
  ShopeItem item5 = new ShopeItem("Baseball cap", "Adidas baseball cap", 4200, 0);

//    bcKormendShopeItems.add(item1);
//    bcKormendShopeItems.add(item2);
//    bcKormendShopeItems.add(item3);
//    bcKormendShopeItems.add(item4);
//    bcKormendShopeItems.add(item5);


  @RequestMapping(value = "/web/greeting", method = RequestMethod.GET)
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    return "greeting";
  }
}


