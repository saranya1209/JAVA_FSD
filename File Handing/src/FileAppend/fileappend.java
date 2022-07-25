package FileAppend;

import java.io.FileWriter;
import java.io.IOException;

public class fileappend {
	public static void main(String[] args) {
		
		String data = "This data is Appended";
		
		try {
			FileWriter output = new FileWriter("FileHandling.txt", true);
			output.write(data);
			System.out.println("Data Appended");
			output.close();
		} catch (IOException e) {
			System.out.println("Data not Appended");
			e.printStackTrace();
		}
	}

}
