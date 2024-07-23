package ArrayList;

import java.util.ArrayList;

public class RetainAll {

	/*
	 * Retain all will retain all the duplicates in l1 wrt to l2
	 */

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList<>();
		l1.add(10);
		l1.add("Dhanush");
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println("l1 : " + l1);
		ArrayList l2 = new ArrayList<>();
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add("Dhanush");
		System.out.println("l2 : " + l2);
		l1.retainAll(l2);
		System.out.println("After retain l1 is : " + l1);

	}

}