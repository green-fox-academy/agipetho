package com.greenfoxacademy.redditapp.repositories;

import com.greenfoxacademy.redditapp.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository <User,Long> {
}
