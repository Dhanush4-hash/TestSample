package Programs;

import org.testng.annotations.Test;

public class StringFunctions {

	String s = "Dhanush";

	@Test
	public void verifyLength() {

		System.out.println(s.length());
	}
	
	@Test
	public void verifyCharactAtIndex() {
	System.out.println(s.charAt(2));
	}

}