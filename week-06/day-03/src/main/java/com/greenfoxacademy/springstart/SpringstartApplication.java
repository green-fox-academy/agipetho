package com.greenfoxacademy.springstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SpringstartApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringstartApplication.class, args);

  }

  @ResponseBody
  @RequestMapping(value = "/hello")
  public String hello() {
    return "Hello World!";
  }

}
/*
Go find your generated Application Java file (where your main method is)
Add @Controller to the class
Add a new method called hello
make it public
return a String like Hello World!
add @RequestMapping(value="/hello") and @ResponseBody to your method
Restart the server (Ctrl+C and bootRun again)
Checkout your new fancy HelloWorld web application at http://localhost:8080/hello
 */
