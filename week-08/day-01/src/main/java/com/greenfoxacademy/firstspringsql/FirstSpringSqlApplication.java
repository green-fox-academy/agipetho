package com.greenfoxacademy.firstspringsql;

import com.greenfoxacademy.firstspringsql.models.ToDo;
import com.greenfoxacademy.firstspringsql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringSqlApplication implements CommandLineRunner {

  private ToDoRepository repository;

  public FirstSpringSqlApplication(ToDoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(FirstSpringSqlApplication.class, args);
  }

  @Override
  public void run(String... args) {
    repository.save(new ToDo("learn"));
    repository.save(new ToDo("cook"));
    repository.save(new ToDo("run"));
  }
}
