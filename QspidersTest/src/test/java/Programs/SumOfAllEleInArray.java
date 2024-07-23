package Programs;

import org.testng.annotations.Test;

public class SumOfAllEleInArray {

	@Test
	public void sumOfAllEleInArray() {

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
		arr[3] = 10;
		arr[4] = 10;

		int sum = 0;

		for (int i : arr) {

			sum = sum + i;

		}

		System.out.println("Sum of the array elements is : " + sum);

	}

	@Test
	public void copyArray() {

		int[] arr1 = new int[] { 10, 20, 30, 40 };

		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("Printing first array : ");

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + " " + arr1[i]);
		}

		System.out.println("Printing second array : ");

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(i + " " + arr2[i]);
		}

	}

}