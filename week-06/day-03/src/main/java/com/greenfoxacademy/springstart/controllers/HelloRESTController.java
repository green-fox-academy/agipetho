/*
Add HelloRESTController class to com.greenfoxacademy.springstart.controllers package
and add @RestController annotation to this class.
Add greeting method and use @RequestMapping annotation.
Create and return a Greeting object when it is called.
Recompile app (use the "Make Project (Ctrl-F9" at the top of your project if
you've edited the existing project and are restarting)
Open http://localhost:8080/greeting in your web browser
Your output should look like:
{
  "id": 1,
  "content": "Hello, World!"
}
 */
/*
Please improve your previous app to greet you and get the name from url query parameter.
You should use @RequestParam annotation
 */
package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  @RequestMapping(value = ("/greeting"))
  public Greeting greeting(Long id, @RequestParam String name) {
    return new Greeting(1L, "Hello, " + name);
  }
}
