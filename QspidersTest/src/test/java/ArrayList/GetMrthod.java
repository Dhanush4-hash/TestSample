package ArrayList;

import java.util.ArrayList;

public class GetMrthod {

	public static void main(String[] args) {

		ArrayList l1 = new ArrayList<>();
		l1.add(10);
		l1.add("Dhanush");
		l1.add(20);
		l1.add(30);
		l1.add(40);

		for (int i = 0; i < l1.size(); i++) {
			Object a1 = l1.get(i);
			System.out.println(a1);
		}

		int size = l1.size();

		System.out.println(" size of the l1 arrayList is :" + size);
		l1.remove(2);
		System.out.println(l1);

	}

}