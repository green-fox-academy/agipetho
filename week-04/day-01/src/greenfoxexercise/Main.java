package greenfoxexercise;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

   /* Person person = new Person();
    person.introduce();

    Student student = new Student();
    int numberOfDays = 2;
    student.skipDays(numberOfDays);
    student.introduce();

    Mentor mentor = new Mentor();
    mentor.introduce();
    mentor.getGoal();

    Sponsor sponsor = new Sponsor();
    sponsor.hire();
    sponsor.introduce();
    sponsor.getGoal();

    Cohort cohort = new Cohort("stable");
    cohort.addStudent(student);
    cohort.addMentor(mentor);
    cohort.info();*/

    //System.out.println(-------------);

    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, true);
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, true, "BME");
    people.add(john);
    Student student = new Student();
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, true, "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    people.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, true, "SpaceX");
    people.add(elon);

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }

    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for(Person person : people) {
      person.introduce();
      person.getGoal();
    }

    Cohort awesome = new Cohort("AWESOME");
    awesome.addStudent(student);
    awesome.addStudent(john);
    awesome.addMentor(mentor);
    awesome.addMentor(gandhi);
    awesome.info();
  }
}
