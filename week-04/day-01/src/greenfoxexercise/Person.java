
/*
Create a Person class with the following fields:

name: the name of the person
age: the age of the person (whole number)
gender: the gender of the person (male / female)
And the following methods:

introduce(): prints out "Hi, I'm name, a age year old gender."
getGoal(): prints out "My goal is: Live for the moment!"
And the following constructors:

Person(name, age, gender)
Person(): sets name to Jane Doe, age to 30, gender to female
 */

package greenfoxexercise;

public class Person {
  private String name;
  private int age;
  boolean isAMale;

  public Person(String name, int age, boolean isAMale) {
    this.name = name;
    this.age = age;
    this.isAMale = isAMale;
  }

  public Person() {
    name = "Jane Doe";
    age = 30;
    isAMale =false;
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + ((isAMale) ? "male" : "female" + "." ));
  }

  public void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAMale(boolean AMale) {
    isAMale = AMale;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean isAMale() {
    return isAMale;
  }
}
