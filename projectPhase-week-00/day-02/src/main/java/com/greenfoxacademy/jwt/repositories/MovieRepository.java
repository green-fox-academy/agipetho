package com.greenfoxacademy.jwt.repositories;


import com.greenfoxacademy.jwt.models.MoviePerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MoviePerson,Long> {
}
