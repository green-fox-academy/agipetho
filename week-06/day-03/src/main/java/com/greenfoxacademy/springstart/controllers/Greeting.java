/*
Add com.greenfoxacademy.springstart.controllers package to your Spring project.
Create Greeting class with long id and String content fields.
Create getters for the fields
Create a constructor using all fields
Add HelloRESTController class to com.greenfoxacademy.springstart.controllers package
and add @RestController annotation to this class.
Add greeting method and use @RequestMapping annotation.
Create and return a Greeting object when it is called.
Recompile app (use the "Make Project (Ctrl-F9" at the top of your project if you've edited the existing project and are restarting)
Open http://localhost:8080/greeting in your web browser
Your output should look like:
{
  "id": 1,
  "content": "Hello, World!"
}
 */
package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private long id;
  private String content;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
