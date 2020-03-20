/*Create a class what is capable of playing exactly one game of Cows and Bulls (CAB). The player have to guess a 4 digit number. For every digit that the player guessed correctly in the correct place, they have a “cow”. For every digit the player guessed correctly in the wrong place is a “bull.” If the player types a number that does not exist, that guess will not have any result.

    Example: If the number to be found is "7624" and the player types "7296", the result is: "1 cow, 2 bull".

    The CAB object should have a random 4 digit number, which is the goal to guess.
    The CAB object should have a state where the game state is stored (playing, finished).
    The CAB object should have a counter where it counts the guesses.
    The CAB object should have a guess method, which returns a string of the guess result
    All methods, including constructor should be tested
*/

package cowsandbulls;

import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {

  boolean isTheGameEnded;
  int counterOfGuesses;


  public CowsAndBulls() {
    isTheGameEnded = false;
    counterOfGuesses = 0;
  }

  public boolean isTheGameEnded() {
    return isTheGameEnded;
  }

  public String guess(int guessedNumber, int numberOfCAB) {
    String randomNumberString = Integer.toString(numberOfCAB);
    String guessesNumberString = Integer.toString(guessedNumber);
    String formattedguessesNumberString = String.format("%04d", guessedNumber); //formatted-et tovabbvinni
    int counterOfCows = 0;
    int counterOfBulls = 0;
    for (int i = 0; i < formattedguessesNumberString.length(); i++) {
      //positional match
      if (formattedguessesNumberString.charAt(i) == randomNumberString.charAt(i)) {
        counterOfCows += 1;
        //simple match - place is different
      } else if (randomNumberString.contains(String.valueOf(formattedguessesNumberString.charAt(i)))
          && formattedguessesNumberString.charAt(i) != randomNumberString.charAt(i)) {
        counterOfBulls++;
      }
    }
    if (counterOfCows == 4) {
      isTheGameEnded = true;
      return "You won!";
    }
    return (counterOfBulls + " bulls; " + counterOfCows + " cows");
  }
}
