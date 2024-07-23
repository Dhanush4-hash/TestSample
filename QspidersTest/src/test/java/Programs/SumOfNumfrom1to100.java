package Programs;

import org.testng.annotations.Test;

public class SumOfNumfrom1to100 {

	@Test
	public void verifySumOfNumbers() {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println("totalSum of numbers from 1 to 100 is : " + sum);
	}

	@Test
	public void verify1to5Numbers() {

		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

	}

	@Test
	public void evenNumbers() {
		for (int i = 50; i >= 1; i--) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
	}

}