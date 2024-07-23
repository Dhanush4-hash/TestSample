package Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	/*
	 * wap to create a file
	 */

	public static void main(String[] args) {

		File f1 = new File("C:\\Saasttesting\\dhanush\\dn.txt");

		try {
			if (f1.createNewFile()) {
				System.out.println("file is created");
			} else {
				System.out.println("file is not created");

			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}