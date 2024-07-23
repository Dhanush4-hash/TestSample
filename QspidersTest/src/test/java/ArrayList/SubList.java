package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SubList {

	public static void main(String[] args) {

		ArrayList l1 = new ArrayList<>();
		l1.add(10);
		l1.add("Dhanush");
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);

		System.out.println("l1 : " + l1);

		List l2 = l1.subList(1, 3);

		System.out.println("sub list of l1 is : " + l2);
	}

}