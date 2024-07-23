package Maps;

import java.util.Iterator;
import java.util.Scanner;

import org.checkerframework.checker.units.qual.s;
import org.testng.annotations.Test;

public class MulTable {

	@Test
	public void verifyMulTable() {

		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		for (int i = 1; i <=10; i++) {
			
			System.out.println(no*i);
		}

	}

}
