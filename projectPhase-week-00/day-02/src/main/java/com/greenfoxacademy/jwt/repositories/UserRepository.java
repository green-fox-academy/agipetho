package com.greenfoxacademy.jwt.repositories;

import com.greenfoxacademy.jwt.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, String> {
}
