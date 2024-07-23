package Programs2;

import org.testng.annotations.Test;

public class SortArray {

	@Test
	public void verifyArraySort() {

		int[] arr = new int[] { 500, 8, 2, 4, 1, 3, 0, 12, 20, 40, -40 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}