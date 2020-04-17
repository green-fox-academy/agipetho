package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebShopController {
  ShopItems bcKormendShopeItems = new ShopItems();
  @RequestMapping(value = "/webshop", method = RequestMethod.GET)
  public String getWebShop() {
    return "webshop";
  }

  @GetMapping("trymodel")
  public String tryModel (Model model){
    //List<String> trialList = Arrays.asList("pelda1", "pelda2");
    model.addAttribute("items", bcKormendShopeItems.getShopItems());
    return "webshop";
  }
}


