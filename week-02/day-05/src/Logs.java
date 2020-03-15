// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Logs {
  public static void main(String[] args) {

    System.out.println(getIPAddresses("files/logs.txt"));
    System.out.println(getIPAddresses("files/logs.txt").size());
    System.out.println(ratioCalculator("files/logs.txt"));
  }

  public static Set<String> getIPAddresses(String filepath) {
    Path filePathSource = Paths.get(filepath);
    // IP address -> no. of occurrences of the given IP address in the log file
    HashMap<String, Integer> addressesIP = new HashMap<>();
    try {
      List<String> logLines = Files.readAllLines(filePathSource);
      for (String line : logLines) {
        String[] elementsOfTheLine = line.split(" ");
        String currentIPAddress = elementsOfTheLine[8];
        // let's store the number of occurrences of the given IP address as the value of the hashmap
        Integer i = addressesIP.get(currentIPAddress);
        addressesIP.put(currentIPAddress, ((i == null) ? 1 : i + 1));
      }
    } catch (IOException e) {
      System.out.println("No such file or directory");
    }
    return addressesIP.keySet();
  }

  public static double ratioCalculator(String filepath) {
    Path filePathSource = Paths.get(filepath);
    double numberOfGet = 0;
    double numberOfPost = 0;
    try {
      List<String> logLines = Files.readAllLines(filePathSource);
      for (String line : logLines) {
        String[] elementsOfTheLine = line.split(" ");
        String currentIGetPost = elementsOfTheLine[11];
        if (currentIGetPost.equals("GET")) {
          numberOfGet += 1;
        } else {
          numberOfPost += 1;
        }
      }
    } catch (IOException e) {
      System.out.println("No such file or directory");
    }
    return numberOfGet / (numberOfGet + numberOfPost);
  }
}
