package com.greenfoxacademy.basicwebshop.controllers;

import java.util.ArrayList;
import java.util.List;

public class ShopeItems {

  private List<ShopeItem> shopeitems;

  public ShopeItems() {
    shopeitems = new ArrayList<>();
  }

  public List<ShopeItem> getShopeitems() {
    return shopeitems;
  }
}
