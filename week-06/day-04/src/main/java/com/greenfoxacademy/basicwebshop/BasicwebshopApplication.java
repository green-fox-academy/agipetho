package com.greenfoxacademy.basicwebshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class BasicwebshopApplication {

  public static void main(String[] args) {
    SpringApplication.run(BasicwebshopApplication.class, args);
  }


  @RequestMapping(value = "/webshop", method = RequestMethod.GET)
  public String webshop(Model model) {
    model.addAttribute("name", " My Web Shop - to be improved!");
    return "webshop";
  }
}
