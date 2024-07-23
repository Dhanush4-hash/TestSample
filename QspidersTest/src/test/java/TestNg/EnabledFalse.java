package TestNg;

import org.testng.annotations.Test;

public class EnabledFalse {

	@Test
	public void verifytestAnotation() {
		System.out.println("verifytestAnotation");
	}

	@Test(enabled = false)
	public void verifyEnabledFalse() {
		System.out.println("verifyEnabledFalse");
	}

}