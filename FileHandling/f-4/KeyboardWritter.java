import java.util.Scanner;
import java.io.*;

class KeyboardWriter {
  public static void main(String[] args) {

    /** Take Input form keyBoard */
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    scanner.close();

    // Write file
    try {
      FileWriter file1 = new FileWriter("./test.txt");
      file1.write(text);
      file1.close();
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("file write success");

    StringBuffer msg = new StringBuffer();

    // Read File
    // read the same file
    try {
      FileReader file2 = new FileReader("./test.txt");
      int character = file2.read(); // returns -1 at the end of line
      while (character != -1) {
        msg.append((char) character);// typecast to character from ASCII
        character = file2.read();// read file again to check end of the line
      }
      file2.close();
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      FileWriter f3 = new FileWriter("./write.txt");
      f3.write(msg.toString());
      f3.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}