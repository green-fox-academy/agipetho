package postit;

import java.awt.*;

public class Main {
  public static void main(String[] args) {

    PostIt postIt1 = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
    PostIt postIt2 = new PostIt(Color.PINK, "Awesome", Color.BLACK);
    System.out.println(postIt1.text);

  }
}
