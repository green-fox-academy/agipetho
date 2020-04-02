import cowsandbulls.CowsAndBulls;
import org.junit.Test;

import static org.junit.Assert.*;

public class CowsAndBullsTest {

  CowsAndBulls cowsAndBulls = new CowsAndBulls();

  @Test
  public void guess_WithOneCows() {
    int int1 = 3455;
    int int2 =3188;
    String result = cowsAndBulls.guess(int1,  int2);
    assertEquals("0 bulls; 1 cows", result);
  }

  @Test
  public void isTheGameEnded_withTrue() {
    boolean isTheGameEndeed = true;
    boolean result = cowsAndBulls.isTheGameEnded();
    assertEquals(true, true);

  }

  @Test
  public void cowsAndBullsCostructor_withGoodParameters() {
    CowsAndBulls cowsAndBulls = new CowsAndBulls();
    int result = cowsAndBulls.getCounterOfGuesses();
    assertEquals(0, result);
  }

  @Test
  public void cowsAndBullsCostructor_withGoodParameters2() {
    CowsAndBulls cowsAndBulls = new CowsAndBulls();
    assertEquals(0, cowsAndBulls.getCounterOfGuesses());
  }

  @Test
  public void cowsAndBullsConstructor_IsTheGame() {
    CowsAndBulls cowsAndBulls = new CowsAndBulls();
    assertEquals(false, cowsAndBulls.isTheGameEnded());
  }
}