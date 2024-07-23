package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnotation {

	@Parameters("userName")
	@Test
	public void verifyTestNgAnotation(String userName) {
		System.out.println("User name is : " + userName);

	}

}