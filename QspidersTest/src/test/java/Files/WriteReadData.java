package Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadData {

	/*
	 * Wap to read and write the data from file
	 */

	public static void main(String[] args) throws IOException {

		File f1 = new File("C:\\Saasttesting\\dhanush\\dn.txt");
		FileWriter fW = new FileWriter(f1);
		fW.write("Heelo");
		fW.write("\n hi");
		fW.flush();
		System.out.println("data was written");

		FileReader fr = new FileReader(f1);

		char[] arr = new char[(int) f1.length()];

		fr.read(arr);

		String s1 = new String(arr);

		System.out.println(s1);

	}

}