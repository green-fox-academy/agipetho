/*
// # Useful Utilities

// Create a controller with 4 endpoints where the user can use the useful utilities.

// ## First steps
// - Have a main page at `/useful`
// - This should contain links to all available utilities detailed below

// Use this `UtilityService` as a dependency for your controller.

 */

package com.greenfoxacademy.di.usefulutilities.controllers;

import com.greenfoxacademy.di.usefulutilities.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/useful")
public class UtilityController {
  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @RequestMapping("")
  public String renderMain() {
    //mapped to hostname:port/useful
    return "main";
  }

  @RequestMapping("/colored")
  public String renderColored(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "main";
  }


  /*
  // ## Email validator
// - Have an endpoint at `/useful/email` with a queryparam
// - Have a link at the main page to an example: `/useful/email?email=is@this.valid`
// - Create a `validateEmail()` method in the `UtilityService`
//     - check if the string contains a `@` and a `.`
// - Display the following to the user
//     - `is@this.valid is a valid email address` in green
//     - `not_valid_email.com is not a valid email address` in red
   */

  @RequestMapping("/email")
  public String renderEMail() {
    //mapped to hostname:port/home/index/
    return "main";
  }

  @RequestMapping("/caesar")
  public String renderCaesar() {
    //mapped to hostname:port/home/index/
    return "main";
  }

}
