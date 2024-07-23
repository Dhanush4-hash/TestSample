package Inheritance;

/**
 * A sub class is inheriting the property from one super class intern this
 * superclass will be Inheriting the property from its superclass
 * 
 */

class Memo {
	int x = 10;

}

class Squid extends Memo {
	void go() {
		System.out.println("Hello");
	}
}

class Dhanush extends Squid {
	void fo() {
		System.out.println("Hi");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Dhanush d = new Dhanush();
		System.out.println(d.x);
		d.go();
		d.fo();
	}

}