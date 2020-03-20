/*Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
    Create a test for that.
*/

package countletters;

import com.sun.jdi.Value;

import java.awt.image.Kernel;
import java.security.Key;
import java.util.HashMap;

public class CountLetters {
  public static HashMap<Character, Integer> createDictionary(String inputWord) {
    HashMap<Character, Integer> dictionaryHashMap = new HashMap();
    for (int i = 0; i < inputWord.length(); i++) {
      if (dictionaryHashMap.containsKey(inputWord.charAt(i))){
        dictionaryHashMap.replace(inputWord.charAt(i),dictionaryHashMap.get(inputWord.charAt(i))+1 );
      }else {
        dictionaryHashMap.put(inputWord.charAt(i),1);
      }
    }
    return dictionaryHashMap;
  }
}
