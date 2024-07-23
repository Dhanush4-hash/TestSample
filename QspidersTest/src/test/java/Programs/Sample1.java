package Programs;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {

		/**
		 * copy one array to another
		 */

		int[] arr1 = new int[] { 10, 20, 30, 40, 50 };

		System.out.println("Prining the Original  array : ");

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + " Index " + " " + arr1[i]);

		}

		int length = arr1.length;

		System.out.println("Reversed array is : ");

		for (int i = length - 1; i >= 0; i--) {

			System.out.println(arr1[i]);

		}

	}
}