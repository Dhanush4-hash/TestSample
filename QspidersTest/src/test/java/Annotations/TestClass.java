package Annotations;

import org.testng.annotations.Test;

public class TestClass extends GenericClass {
	
	@Test
	public void verifyHomePage() {
		System.out.println("user in home page");
	}
	
	@Test
	public void verifyAccountCreate() {
		System.out.println("Account created");
	}

}
