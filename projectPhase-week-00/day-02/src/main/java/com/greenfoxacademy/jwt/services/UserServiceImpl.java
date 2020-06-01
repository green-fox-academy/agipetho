package com.greenfoxacademy.jwt.services;

import com.greenfoxacademy.jwt.models.User;
import com.greenfoxacademy.jwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;
  private PasswordEncoder bcryptEncoder;

  @Autowired
  public UserServiceImpl(UserRepository userRepository, PasswordEncoder bcryptEncoder) {
    this.userRepository = userRepository;
    this.bcryptEncoder = bcryptEncoder;
  }

  @Override
  public User saveUser(User user) {
      User newUser = new User();
      newUser.setUserName(user.getUserName());
      newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
      return userRepository.save(newUser);
  }
}
