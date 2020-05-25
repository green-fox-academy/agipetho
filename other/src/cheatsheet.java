
//my cheatsheet

// equal: nem ==, hanem:
        if(currentIGetPost.equals("GET")){
            numberOfGet+=1;

//  I. File IO

//for each
            for(String line:lines){
            System.out.println(line);
            }
//IO Exeption
            catch(IOException e){
            System.out.println("Unable to read file: my-file.txt");
            }

// write the file into Path + iterate + write the file into another

//DOUBLE

public class Doubled {
  public static void main(String[] args) {
    duplicatedDecoder("files/Duplicated.txt", "files/Duplicated_decoded.txt");
  }

  public static void duplicatedDecoder(String filepathSource, String filepathDestination) {
    Path filePathFrom = Paths.get(filepathSource);
    Path filePathTo = Paths.get(filepathDestination);
    try {                                                      // we decompose text to lines, lines to characters
      // we build a parallel structure for the output
      List<String> lines = Files.readAllLines(filePathFrom); // lines == List of strings -- so we can iterate by lines
      List<String> linesDecoded = new ArrayList<String>(); // same for output, ArrayList is an implementation of the List interface
      for (String line : lines) {                                     // for each line:
        char[] characters = line.toCharArray();                     // convert the line to charArray
        char[] charactersDecoded = new char[characters.length / 2]; // set up the same structure for the output with 1/2 length
        for (int i = 0; i < characters.length; i += 2) {  // for each character in the line:
          charactersDecoded[i / 2] = characters[i];     // copy every second char from the original line to the output char-array
        }
        // at this point we have the decoded line in the output char-array
        // store the line:
        linesDecoded.add(new String(charactersDecoded)); // Files.write expects a list of strings so we need to convert the char-array to a string
      }
      Files.write(filePathTo, linesDecoded);
    } catch (IOException e) {
      System.out.println("could not read file");
    }
  }
}



/*REVERSED

    try {
    List<String> lines = Files.readAllLines(filepathSource);
    List<String> linesDecoded = new ArrayList<String>();
    for (String line : lines) {
    char[] characters = line.toCharArray();
    char[] charactersDecoded = new char[characters.length];
    for (int i = 0; i < characters.length; i++) {
    charactersDecoded[i] = characters[characters.length - 1 - i];
    }
    linesDecoded.add(new String(charactersDecoded));
    }
    Files.write(filepathDestination, linesDecoded);

    REVERSED ORDER
    try {
    List<String> lines = Files.readAllLines(filepathSource);
    List<String> linesDecoded = new ArrayList<String>();
    for (int i = 0; i < lines.size(); i++) {
    linesDecoded.add(lines.get(lines.size()-i-1));

    //alternative:
    //String currentLine = lines.get((lines.size()-i-1));
    //linesDecoded.add(currentLine);
    }
    Files.write(filepathDestination, linesDecoded);
    } */


