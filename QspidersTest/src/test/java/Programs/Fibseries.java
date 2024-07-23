package Programs;

import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Fibseries {

	@Test
	public void verifyFibonaciSeries() {
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		for (int i = 0; i <= 10; i++) {
			fib3 = fib1 + fib2;
			System.out.println(fib3);
			fib1 = fib2;
			fib2 = fib3;
		}

	}

	@Test
	public void verifyDuplicateCharInString() {
		String str = "cocount";

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		StringBuffer s = new StringBuffer();
		for (Character character : set) {
			s.append(character);
		}
		System.out.println("Before Removal of the dulpcates the String is: " + str);
		System.out.println("After Removal of the dulpcates the String is: " + s);

	}

}