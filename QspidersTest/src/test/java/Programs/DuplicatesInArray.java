package Programs;

import java.util.Iterator;
import java.util.Scanner;

import org.testng.annotations.Test;

public class DuplicatesInArray {

	@Test
	public void duplicatesInArray() {

		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz", "abc" };

		for (int i = 0; i < strArray.length - 1; i++) {

			for (int j = i + 1; j < strArray.length; j++) {

				if ((strArray[i].equals(strArray[j])) && (i != j))

				{
					System.out.println(strArray[i]);
				}

			}

		}

	}

	@Test
	public void splitString() {
		String str = "Dhanush is Qa SDET";
		String[] split = str.split(" ");
		// sSystem.out.println("split String is : " + split[i]);
	}

	@Test
	public void splitString1() {
		String str = "Dhanush is Qa SDET";
		String[] split = str.split(" ");
		// sSystem.out.println("split String is : " + split[i]);
	}

	@Test
	public void verifyStringPalliendrome() {
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String originalString = sc.nextLine();
		sc.close();
		char[] originalCharArray = originalString.toCharArray();
		int length = originalCharArray.length;
		String reversedString = "";

		for (int i = length - 1; i >= 0; i--) {
			reversedString = reversedString + originalCharArray[i];
		}
		System.out.println("Original String is : " + originalString);
		System.out.println("Reversed String is : " + reversedString);

		if (reversedString.equals(originalString)) {
			System.out.println(originalString + " Is a palliendrome");
		} else {
			System.out.println(originalString + " Is not a palliendrome");

		}
	}

}