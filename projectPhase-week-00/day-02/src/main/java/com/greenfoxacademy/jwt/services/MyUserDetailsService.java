package com.greenfoxacademy.jwt.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class  MyUserDetailsService implements UserDetailsService {
  //return user (from database or hardcoded one)
  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    //username, password, list of authorities
    return new User("jeno", "jeno", new ArrayList<>());
  }
}
