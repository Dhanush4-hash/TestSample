package Programs;

public class MaxMinArray {

	public static void main(String[] args) {

		int[] a = new int[] { 0, 12, 25, 45, 100, 100, 1, 2543, 34302, 24502 };
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				max = a[i];
			}

			if (min > a[i]) {
				min = a[i];
			}

		}

		System.out.println("Maximun element in the array is : " + max);
		System.out.println("Maximun element in the array is : " + min);

	}

}
