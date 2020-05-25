
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Create a function that receives a file name (with the path of the file included) and returns
 * the average of the spending that are recorded in the file in integer format.
 * The function shall return 0 when any error happens during reading the file
 * (cannot open or invalid data)
 * The function shall only consider spending until the row is not equal with "-" (minus) char.
 */
public class MatreviewSpendings {
  public static void main(String[] args) {
    int average = calculateAverageSpending("assets/spending.csv");
    System.out.println(average);
  }

  private static int calculateAverageSpending(String fileName) {
    int average = 0;

    Path filePath = Paths.get(fileName);

    List<String> rows;

    try {
      rows = Files.readAllLines(filePath);
    } catch (IOException e) {
      return 0;
    }

    int spending = 0;
    int count = 0;
    for (int i = 0; i < rows.size(); i++) {
      if (i == 0) {
        continue;
      }

      String[] productData = rows.get(i).split(";");

      if (productData[0].equals("-")) {
        break;
      }

      String price = productData[3];
      try {
        spending += Integer.parseInt(price);
        count++;
      } catch (NumberFormatException e) {
        System.out.println("Something went wrong: Cannot parse: " + price);
        return 0;
      }
    }

    try {
      average = spending / count;
    } catch (ArithmeticException e) {
      return 0;
    }

    return average;
  }
}