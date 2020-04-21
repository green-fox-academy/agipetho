/*
In your controller create the first endpoint called /show
Instantiate a new BankAccount("Simba", 2000, "lion")
Java: Add this BankAccount to the model
C#: Add this BankAccount to the View
Create a template where you show the fields of the BankAccount
 */

package com.greenfoxacademy.bank_app.controllers;

import com.greenfoxacademy.bank_app.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
  private List<BankAccount> bankAccounts = new ArrayList<>();

  public BankAccountController() {
    bankAccounts.add(new BankAccount("Simba", 2000, "Lion", true, true));
    bankAccounts.add(new BankAccount("car2", 1000, "Lion", false, false));
    bankAccounts.add(new BankAccount("car3", 4000, "Wolf", true, false));
    bankAccounts.add(new BankAccount("car4", 5000, "Lion", true, true));
    bankAccounts.add(new BankAccount("car5", 600, "Elephant", false, true
    ));
  }

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showBooks(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "bankaccount";
  }

  @RequestMapping(path = "/greeting", method = RequestMethod.GET)
  public String greeting(Model model) {
    model.addAttribute("formatted", "<em>HTML</em>");
    model.addAttribute("formatted2", "<b>Enjoy yourself!</b>");
    return "greeting";
  }
}
