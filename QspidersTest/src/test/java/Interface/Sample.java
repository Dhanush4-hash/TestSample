package Interface;

public interface Sample {

	public void show();
}

class Test implements Sample {

	public void show() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.show();

	}
}