package exercise10.FindObjectsInAList;

public class Fox {
  private String name;
  private String color;
  private int age;

  public Fox(String nameOfTheFox, String colorOfTheFox, int ageOfTheFox) {
    this.name = nameOfTheFox;
    this.color = colorOfTheFox;
    this.age = ageOfTheFox;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public int getAge() {
    return age;
  }
}
