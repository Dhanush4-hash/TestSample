package Programs;

import java.util.Scanner;

public class Arrays1 {

	/*
	 * Wap to create a array of the User defined size and take the i/p from the User
	 * and in the given ip find the number and its position
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("enter the sze of the array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements  of the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the number to be searched : ");
		int x = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				System.out.println(" x found at the index : " + i);

			}
		}

	}

}