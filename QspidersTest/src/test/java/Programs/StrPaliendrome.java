package Programs;

import java.util.Scanner;

import org.hamcrest.core.Is;

public class StrPaliendrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String originalString = sc.nextLine();
		sc.close();
		System.out.println("originalString is : " + originalString);
		char[] ca = originalString.toCharArray();
		int size = ca.length;
		String revString = "";
		for (int i = size - 1; i >= 0; i--) {
			revString = revString + ca[i];

		}
		System.out.println("revString is : " + revString);

		if (originalString.equals(revString)) {
			System.out.println(originalString + " is paliendrome");
		} else {
			System.out.println(originalString + " is not paliendrome");

		}

	}
}