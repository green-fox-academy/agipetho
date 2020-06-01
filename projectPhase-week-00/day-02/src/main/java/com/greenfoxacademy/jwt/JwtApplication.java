package com.greenfoxacademy.jwt;

import com.greenfoxacademy.jwt.models.User;
import com.greenfoxacademy.jwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApplication implements CommandLineRunner {

  private UserRepository userRepository;

  @Autowired
  public JwtApplication(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(JwtApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    if (System.getenv("ACTIVE_PROFILE").equals("test")){
      userRepository.save(new User("Kati", "kiskati"));
      userRepository.save(new User("Pali", "nappali"));
      userRepository.save(new User("Klari", "klarika"));
    }
  }

}
