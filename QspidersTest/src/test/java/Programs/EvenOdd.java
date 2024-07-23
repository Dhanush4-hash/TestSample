package Programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();
		scanner.close();
		if (num % 2 == 0) {
			System.out.print("even numbers are : " + num);
		}

		else if (num % 2 != 0) {
			System.out.print("odd numbers are : " + num);

		}

	}

}