package Annotations;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class ParameterAnotation {

	@Test
	@org.testng.annotations.Parameters("Myname")
	public void verifyParameterAnotation(@Optional("Mahesh") String Myname) {

		System.out.println("what is your name : My name is : " + Myname);

	}

}
