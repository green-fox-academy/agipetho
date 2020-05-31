package com.greenfoxacademy.jwt.services;

import com.greenfoxacademy.jwt.models.User;
import com.greenfoxacademy.jwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User saveUser(User user) {
    return null;
  }

  @Override
  public boolean isUserDTOValid(User user) {
    return false;
  }
}
