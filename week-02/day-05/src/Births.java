
// Create a function that
// - takes the name of a CSV file as a parameter,
//   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
// - returns the year when the most births happened.
//   - if there were multiple years with the same number of births then return any one of them

// You can find such a CSV file in this directory named births.csv
// If you pass "births.csv" to your function, then the result should be either 2006, or 2016


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Births {
  public static void main(String[] args) {
    try {
      System.out.println(whenTheMostBirthhappened("files/births.csv"));
    } catch (IOException e) {
      System.out.println("IO error");
    }
  }

  public static int whenTheMostBirthhappened(String filepath) throws java.io.IOException {
    Path filePath = Paths.get(filepath);
    List<String> linesOfTheFiles;
    HashMap<Integer, Integer> whichIsTheMorePopularYear = new HashMap();

    linesOfTheFiles = Files.readAllLines(filePath);
    for (String line : linesOfTheFiles) {
      try {
        String[] elementsOfTheLines = line.split(";");
        String currentBirthInfo = elementsOfTheLines[1];
        String[] currentArrayWithBirthInfo = currentBirthInfo.split("-");
        String currentYearInfo = currentArrayWithBirthInfo[0];
        Integer intCurrentYearInfo = Integer.parseInt(currentYearInfo);
        Integer counter = whichIsTheMorePopularYear.get(intCurrentYearInfo);
        whichIsTheMorePopularYear.put(intCurrentYearInfo, ((counter == null) ? 1 : counter + 1));
      } catch (NumberFormatException e) {
        System.out.println("Cannot be parsed: " + line);
        //continue with next iteration
      }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Out of bound of length: " + line);
        ////continue with next iteration
      }
    }
    HashMap.Entry<Integer, Integer> maxEntry = null;
    for (HashMap.Entry<Integer, Integer> entry : whichIsTheMorePopularYear.entrySet()) {
      if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
        maxEntry = entry;
      }
    }
    return maxEntry.getKey();
  }
}