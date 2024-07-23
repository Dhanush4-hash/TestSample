package Files;

import java.io.File;

public class CreateDeletefolder {

	/*
	 * Wap to create a folder , check whether it exist and delete the folder
	 */

	public static void main(String[] args) {

		File f1 = new File("C:\\Saasttesting\\Files");

		if (f1.mkdirs()) {

			System.out.println("folder is reated");
		}

		else {
			System.out.println("folder is not reated");

		}

		if (f1.exists()) {
			System.out.println("folder exists");

		} else {
			System.out.println("folder doesnot  exists");

		}

		if (f1.delete()) {
			System.out.println("folder is deleted");

		} else {
			System.out.println("folder is not deleted");

		}

	}

}