
//public class TodoPrint {
//    public static void main(String... args){
//        String todoText = " - Buy milk\n";
// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

//        System.out.println(todoText);
//    }
public class TodoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk\n";
    String add1 = "My to do:\n";
    String add2 = " - Download games\n";
    String add3 = " - Diablo\n";
    add3 = add3.indent(4);

    todoText = add1.concat(todoText);
    todoText = todoText.concat(add2);
    todoText = todoText.concat(add3);
    System.out.println(todoText);
  }
}
