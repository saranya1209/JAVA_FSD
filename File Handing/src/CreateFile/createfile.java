package CreateFile;

import java.io.File;
import java.io.IOException;

public class createfile {
	public static void main(String[] args) {
		
		File myfile = new File("File Handling.txt");
		
		try {
			if (myfile.createNewFile()) {
				System.out.println("File is Created");
			}
			else {
				System.out.println("File is not Created");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
