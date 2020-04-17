package com.greenfoxacademy.basicwebshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Greeting {

  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  public String greeting(Model model) {
    model.addAttribute("name", " My Web Shop!");
    return "greeting";
  }
}
