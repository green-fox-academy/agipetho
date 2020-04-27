package com.greenfoxacademy.firstmysqltask.controllers;

import com.greenfoxacademy.firstmysqltask.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (value = "/")
public class ToDoController {
  private ToDoRepository repository;

  @Autowired
  public ToDoController(ToDoRepository repository) {
    this.repository = repository;
  }

  /*
  In the list method of the Controller use the repository to find all elements
   and add them to the model as "todos" attribute
   */
  @GetMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos",repository.findAll());
    return "todolist";
  }
}
