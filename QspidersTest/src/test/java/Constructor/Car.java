package Constructor;

public class Car {

	String name;
	int cost;
	String model;

	public Car(String n, int c, String m) {

		name = n;
		cost = c;
		model = m;

	}

	public static void main(String[] args) {
		Car ca = new Car("Benz", 100000, "x57840");
		System.out.println(ca.model);
		System.out.println(ca.cost);
		System.out.println(ca.model);

	}

}
