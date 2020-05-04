/*
/*
This is the continuation of the previous Frontend exercise, you should extend that with a new endpoint.

You should create a logic that can greet someone by his/her name and title.

Create a GET /greeter endpoint
that can receive a query parameter like name=Petike&title=student
and responds with an awesome greeting json object:
{
  "welcome_message": "Oh, hi there Petike, my dear student!"
}
if any of the data is missing, respond with one of the following error messages and a 400 status code:
{
  "error": "Please provide a name and a title!"
}
{
  "error": "Please provide a title!"
}
```
```json
{
  "error": "Please provide a name!"
}
 */
/*
 */
package com.greenfoxacademy.restpractice.models;

public class Greeting {
  private String name;
  private String title;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  private String message;

  public Greeting(String name, String title) {
    this.name = name;
    this.title = title;
    message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
