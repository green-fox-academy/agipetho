package com.greenfoxacademy.firstmysqltask;

import com.greenfoxacademy.firstmysqltask.models.ToDo;
import com.greenfoxacademy.firstmysqltask.repositories.ToDoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FirstmysqltaskApplication implements CommandLineRunner {

  private ToDoRepository repository;

  public FirstmysqltaskApplication(ToDoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(FirstmysqltaskApplication.class, args);
  }

  @Override
  public void run(String... args) {
//    repository.save(new ToDo("learn"));
//    repository.save(new ToDo("cook"));
//    repository.save(new ToDo("run"));
  }
}