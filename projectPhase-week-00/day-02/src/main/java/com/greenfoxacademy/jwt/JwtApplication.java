package com.greenfoxacademy.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApplication {

  public static void main(String[] args) {
    SpringApplication.run(JwtApplication.class, args);
  }

//  @Override
//  public void run(String... args) throws Exception {
//    if (System.getenv("ACTIVE_PROFILE").equals("Test")){
//      humanRepository.save(new Human("Bill", "male", 12));
//      humanRepository.save(new Human("John", "male", 26));
//      humanRepository.save(new Human("Alexa", "female", 35));
//    }
//  }

}
