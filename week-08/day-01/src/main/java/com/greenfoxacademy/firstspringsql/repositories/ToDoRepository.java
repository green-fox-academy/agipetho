package com.greenfoxacademy.firstspringsql.repositories;

import com.greenfoxacademy.firstspringsql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
