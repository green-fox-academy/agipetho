import apples.Apples;

import static org.junit.Assert.*;

public class ApplesTest {

  @org.junit.Test
  public void getApple_withName_true() {
    Apples apple1 = new Apples("johnatan", "red");
    assertEquals("johnatan", apple1.getName());
  }
}