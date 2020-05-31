package com.greenfoxacademy.jwt.services;

import com.greenfoxacademy.jwt.repositories.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
  //return user (from database or hardcoded one)

  private UserRepository userRepository;

  public MyUserDetailsService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    Optional<com.greenfoxacademy.jwt.models.User> myUser = userRepository.findByUserName(userName);
    if (myUser.isPresent()) {
      //username, password, list of authorities
      return new User(myUser.get().getUserName(), myUser.get().getPassword(), new ArrayList<>());
    } else {
      return null;
    }
  }
}
