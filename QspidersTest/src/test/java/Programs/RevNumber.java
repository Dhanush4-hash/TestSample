package Programs;

import java.util.Scanner;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class RevNumber {

	@Test
	public void verifyNumberPalliendrome() {
		int no = 141;
		int cpy = 141;
		System.out.println("Original number is: " + no);
		int rem = 0;
		int rev = 0;
		while (no != 0) {
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}

		System.out.println("Reversed number is: " + rev);

		if (cpy == rev) {
			System.out.println(no + " is a palliendrome");
		} else {
			System.out.println(no + " is a not palliendrome");

		}

	}

	@Test
	public void verifyStringPaliendrome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String originalString = scanner.nextLine();

		scanner.close();
		char[] ca = originalString.toCharArray();
		int length = ca.length;
		String reversedString = "";

		for (int i = length - 1; i > ca.length; i--) {
			reversedString = reversedString + ca[i];
		}
		System.out.println("Original String is: " + originalString);
		System.out.println("ReversedString String is: " + reversedString);

		if (originalString.equals(reversedString)) {
			System.out.println(originalString + " is a palliendrome");
		} else {
			System.out.println(originalString + " is not a palliendrome");

		}

	}

	@Test
	public void verifySumOfArrayNumbers() {
		int[] arr = new int[] { 1, 2, 3, 4 };
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		System.out.println("Sum of all the array elements are: " + sum);

	}

}