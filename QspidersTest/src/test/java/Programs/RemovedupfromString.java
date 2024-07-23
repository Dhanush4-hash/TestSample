package Programs;

import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class RemovedupfromString {

	
	@Test
	public void verifySample() {
		String oriString = "Coconut";

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < oriString.length(); i++) {
			set.add(oriString.charAt(i));

		}

		StringBuffer sb = new StringBuffer();

		for (Character character : set) {

			sb.append(character);
		}

		System.out.println("String Before removing dupliates: " + oriString);
		System.out.println("String After removing dupliates:  " + sb);
	}
	
	
	
	
	@Test
	public void verifyDuplicateRemovalInString() {

		/**
		 * Using set
		 */
		String str = "coconut";

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		StringBuffer s = new StringBuffer();
		for (Character character : set) {
			s.append(character);
		}
		System.out.println(s);

	}

	@Test
	public void removeDupFromString() {
		String str = "apple is fruit";
		char[] ca = str.toCharArray();

		for (int i = 0; i < ca.length; i++) {
			for (int j = i + 1; j < ca.length; j++) {
				if (ca[i] == ca[j]) {
					System.out.println(ca[j]);
				}
			}
		}

	}

}