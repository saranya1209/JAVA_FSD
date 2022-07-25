package FileRead;

import java.io.FileWriter;
import java.io.IOException;

public class fileread {
	public static void main(String[] args) {
		
		String data = "Welcome to java, Happy learning";
		
		try {
			FileWriter output = new FileWriter("FileHandling.txt");
			output.write(data);
			System.out.println("Data written in text file");
			output.close();
		} catch (IOException e) {
			System.out.println("Data not written in text file");
			e.printStackTrace();
		}
	}

}
