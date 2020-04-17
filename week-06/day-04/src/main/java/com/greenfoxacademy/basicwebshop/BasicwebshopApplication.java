package com.greenfoxacademy.basicwebshop;

import com.greenfoxacademy.basicwebshop.models.ShopItems;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class BasicwebshopApplication {

  public static void main(String[] args) {
    SpringApplication.run(BasicwebshopApplication.class, args);
    ShopItems bcKormendShopeItems = new ShopItems();
  }
}
