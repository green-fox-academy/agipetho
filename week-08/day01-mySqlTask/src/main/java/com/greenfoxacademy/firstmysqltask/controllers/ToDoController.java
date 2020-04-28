package com.greenfoxacademy.firstmysqltask.controllers;

import com.greenfoxacademy.firstmysqltask.models.ToDo;
import com.greenfoxacademy.firstmysqltask.repositories.ToDoRepository;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping (value = "/")
public class ToDoController {
  private ToDoRepository repository;

  @Autowired
  public ToDoController(ToDoRepository repository) {
    this.repository = repository;
  }

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    List<ToDo> activeTodos= new ArrayList<>();
    repository.findAll().forEach(activeTodos::add);
    List<ToDo> activeTodos2 =activeTodos.stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList());
    model.addAttribute("todos", activeTodos2);
    return "todolist";
  }
}
