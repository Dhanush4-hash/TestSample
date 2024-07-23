package Programs2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateInString {

	public static void main(String[] args) {

		String oriString = "coconut";

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

}