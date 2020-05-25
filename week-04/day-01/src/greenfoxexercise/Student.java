/*
Create a Student class that has the same fields and methods as the Person class, and has the following additional

fields:
previousOrganization: the name of the student’s previous company / school
skippedDays: the number of days skipped from the course
methods:
getGoal(): prints out "Be a junior software developer."
introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
skipDays(numberOfDays): increases skippedDays by numberOfDays
The Student class has the following constructors:

Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0
 */
package greenfoxexercise;

import javax.xml.namespace.QName;

public class Student extends Person {
  private String previousOrganisation;
  private int skippedDays;

  public Student(String name, int age, boolean gender, String previousOrganisation) {
    super(name, age, gender);
    this.previousOrganisation = previousOrganisation;
    skippedDays = 0;
  }

  public Student() {
    super("Jane Doe", 30, false);
    previousOrganisation = "The Scool of Life";
    skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + getName() + " , a " + getAge() + " year old " + ((isAMale) ? "male" : "female") + " from " + previousOrganisation + " who skipped " + skippedDays + " days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    return skippedDays += numberOfDays;
  }
}
