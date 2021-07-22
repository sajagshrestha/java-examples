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

    // Read File
    // read the same file
    try {
      FileReader file2 = new FileReader("./test.txt");
      int characterCount = file2.read(); // returns -1 at the end of line
      while (characterCount != -1) {
        System.out.print((char) characterCount);// typecast to character from ASCII
        characterCount = file2.read();// read file again to check end of the line
      }
      file2.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}