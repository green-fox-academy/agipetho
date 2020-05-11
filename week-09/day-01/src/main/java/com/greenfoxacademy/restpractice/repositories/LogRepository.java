package com.greenfoxacademy.restpractice.repositories;


import com.greenfoxacademy.restpractice.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository <Log, Long> {

}
