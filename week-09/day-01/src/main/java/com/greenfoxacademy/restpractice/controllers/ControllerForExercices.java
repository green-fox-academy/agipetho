/*
You should create a logic that can double the provided number.

Create a GET /doubling endpoint
It should be able to handle a query parameter called input, eg. http://localhost:8080/doubling?input=15
This endpoint should respond with a json object with the doubled amount of the input:
{
"received": 15,
"result": 30
}
If no input is provided it should return:
{
"error": "Please provide an input!"
}
 */
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
You should create a logic that can receive a string and append an A letter to it.

Create a dynamic GET /appenda/{appendable} endpoint
that responds with the appended a:
eg. /appenda/kuty
responds with:
{
  "appended": "kutya"
}
if no appendable is provided, thats a different endpoint -> so the server should respond with 404
 */
/*
This is the continuation of the previous Frontend exercise, you should extend that with a new endpoint.

You should create a logic that can do an action until a specific number

Create a dynamic POST /dountil/{action} endpoint
That receives a number in a json object:
{
  "until": 15
}
and responds with sum or multiplication of all elements until that number:
eg. /dountil/sum with {"until": 5} will respond {"result": 15}
eg. /dountil/factor with {"until": 5} will respond {"result": 120}
if no number is provided:
{
  "error": "Please provide a number!"
}
 */

package com.greenfoxacademy.restpractice.controllers;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
public class ControllerForExercices {

  public ControllerForExercices() {
  }

  @GetMapping("/doubling")
  public int doubling(@RequestParam int input) {
    return input * 2;
  }

  @GetMapping("/greeter")
  public String greeter(@RequestParam String input) {
    return input;
  }

  @GetMapping("/appenda/{appendable}")
  public String appendA(@PathVariable String appendable) {
    String appended = appendable + "a";
    return appended;
  }

  @PostMapping("/dountil/{action}")
  public int doUntil(@PathVariable String action, Integer input) {
    if (action.equals("sum")) {
      if (input%2 ==0) {
        return (input / 2) * (input + 1);
      } else {
        return (input + (input-1) / 2) * input;
      }
    }

    if (action.equals("factor")) {
      int a = 1;
      for (int i = 1; i <= input; i++) {
        a *= i;
      }
      return a;
    }
    return 0;
  }
}
