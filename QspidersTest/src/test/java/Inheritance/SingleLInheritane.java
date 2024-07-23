package Inheritance;

/**
 * A Sub class is inheriting the property from one Super class is called Single
 * Level Inheritance
 */

class Sample {
	int x = 10;
}

class Demo extends Sample {
	void fo() {
		System.out.println("Hi ");
	}
}

public class SingleLInheritane {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.x);
		d.fo();
	}

}