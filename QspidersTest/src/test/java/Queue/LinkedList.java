package Queue;

public class LinkedList {

	public static void main(String[] args) {

		java.util.LinkedList l1 = new java.util.LinkedList<>();

		l1.add(10.56);
		l1.add('A');
		l1.add("Dhanush");
		l1.add(null);
		l1.add('A');

		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1);

		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);

	}

}