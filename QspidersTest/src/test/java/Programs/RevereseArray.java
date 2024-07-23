package Programs;

public class RevereseArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 7, 9, 11 };

		System.out.println(" printing the original array : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println(" printing the reversed array : ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");

		}

	}

}