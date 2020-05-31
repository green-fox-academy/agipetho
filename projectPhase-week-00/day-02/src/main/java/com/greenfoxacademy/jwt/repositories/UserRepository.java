package com.greenfoxacademy.jwt.repositories;

import com.greenfoxacademy.jwt.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository <User, String> {

  Optional <User> findByUserName(String userName);
}
