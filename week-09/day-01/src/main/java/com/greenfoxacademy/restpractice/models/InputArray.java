package com.greenfoxacademy.restpractice.models;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InputArray {

  private String what;
  private int[] numbers;

  public InputArray(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }


  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}






/*



  Create a POST /arrays endpoint
That receives a relatively complex json object:
{
  "what": "sum",
  "numbers": [1, 2, 5, 10]
}
what can be 3 things: sum, multiply, double
and responds with sum or multiplication of all elements in the numbers or with another array with the doubled elements:
eg. /arrays with {"what": "sum", "numbers": [1,2,5,10]} will respond {"result": 18}
eg. /arrays with {"what": "multiply", "numbers": [1,2,5,10]} will respond {"result": 100}
eg. /arrays with {"what": "double", "numbers": [1,2,5,10]} will respond {"result": [2,4,10,20]}
if no what (or numbers) is provided:
{
  "error": "Please provide what to do with the numbers!"
}
 */
