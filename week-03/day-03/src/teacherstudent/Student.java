package teacherstudent;

public class Student {

  public void learn() {
    System.out.println("The student is studying something new");
  }

  public void ask(Teacher teacher) {
    teacher.answer();
  }
}
