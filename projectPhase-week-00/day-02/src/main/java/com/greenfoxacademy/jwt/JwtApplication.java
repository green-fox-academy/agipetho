package com.greenfoxacademy.jwt;

import com.greenfoxacademy.jwt.models.User;
import com.greenfoxacademy.jwt.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApplication implements CommandLineRunner {

  private UserService userService;

  @Autowired
  public JwtApplication(UserService userService) {
    this.userService = userService;
  }

  public static void main(String[] args) {
    SpringApplication.run(JwtApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    if (System.getenv("ACTIVE_PROFILE").equals("test")){
      userService.saveUser(new User("Kati", "kiskati"));
      userService.saveUser(new User("Pali", "nappali"));
      userService.saveUser(new User("Klari", "klarika"));
    }
  }

}
