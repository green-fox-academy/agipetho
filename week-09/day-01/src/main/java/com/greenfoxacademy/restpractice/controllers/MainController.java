/*
Create a MainController with a single endpoint to /
render index.html here
 */
package com.greenfoxacademy.restpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

  public MainController() {
  }

  @GetMapping("/")
  public String getIndexHtml() {
    return "index";
  }
}
