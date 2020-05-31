package com.greenfoxacademy.jwt.services;


import com.greenfoxacademy.jwt.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
  User saveUser(User user);

  boolean isUserDTOValid(User user);
}
