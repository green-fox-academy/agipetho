/*
// # Useful Utilities

// Create a controller with 4 endpoints where the user can use the useful utilities.

// ## First steps
// - Have a main page at `/useful`
// - This should contain links to all available utilities detailed below

// Use this `UtilityService` as a dependency for your controller.

 */

package com.greenfoxacademy.di.usefulutilities.controllers;

import com.greenfoxacademy.di.usefulutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/useful")
public class UtilityController {
  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("")
  public String renderMain() {
    return "main";
  }

  @GetMapping("/colored")
  public String renderColored(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "main";
  }

  @GetMapping("/email")
  public String renderEMail(Model model, @RequestParam String email) {
    model.addAttribute("inputemail", email);
    model.addAttribute("isValidEmail", utilityService.isValidEmail(email));
    return "email";
  }

  @GetMapping("/caesar")
  public String renderCaesar() {
    return "main";
  }

}
