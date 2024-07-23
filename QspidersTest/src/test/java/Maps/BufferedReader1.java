package Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.testng.annotations.Test;

public class BufferedReader1 {

	@Test
	public void verifyBufferedReader() throws IOException {

		System.out.println("entered the string ip :");

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();

		System.out.println("entered string is :" + str);
	}

	@Test
	public void numberIsEvenOrOdd() {

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("even numbers are :" + i);

			}
		}

	}

	@Test
	public void sumOfFirstHundredNumber() {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println("sum of first 100 number is :" + sum);
	}

}