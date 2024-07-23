package ArrayList;

import java.util.ArrayList;

public class BasicPrograms {

	public static void main(String[] args) {

		ArrayList l1 = new ArrayList<>();
		l1.add(10);
		l1.add("Dhanush");
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		l1.add(2, "hi");
		System.out.println(l1);
		ArrayList l2 = new ArrayList<>();
		l2.add('A');
		l2.add('B');
		l2.add('C');
		l2.add('D');
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		l1.addAll(2, l2);
		System.out.println(l1);
	}

}