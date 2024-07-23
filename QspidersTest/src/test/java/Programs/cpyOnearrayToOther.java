package Programs;

public class cpyOnearrayToOther {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 10, 20, 30, 40 };

		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("printing first array : ");

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("printing second array : ");
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}