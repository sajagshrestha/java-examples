import java.io.*;

class FileHandling {
	public static void main(String args[]) {
		// file write
		try {
			FileWriter file1 = new FileWriter("./test.txt");
			file1.write("hello world");
			file1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("file write success");

		// read the same file
		try {
			FileReader file2 = new FileReader("./test.txt");
			int character = file2.read(); // returns -1 at the end of line
			while (character != -1) {
				System.out.print((char) character);// typecast to character from ASCII
				character = file2.read();// read file again to check end of the line
			}
			file2.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}