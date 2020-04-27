package com.greenfoxacademy.firstmysqltask.repositories;

import com.greenfoxacademy.firstmysqltask.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository <ToDo, Long> {
}
