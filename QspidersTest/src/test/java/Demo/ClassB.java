package Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB {

	@Test
	public void verifyClassBTestA() {
		System.out.println("Demo - ClassBTestA");
	}

	@Test
	public void verifyClassBTestB() {
		System.out.println("Demo - ClassBTestB");
	}

	@BeforeTest
	public void verifyBeforeTest() {
		System.out.println("Demo -- Before Test");
	}

	@AfterTest
	public void verifyAfter() {
		System.out.println("Demo -- AfterTest");
	}

	@BeforeSuite
	public void verifyBeforeSuite() {
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	public void verifyAfterSuite() {
		System.out.println("AfterSuite");
	}

}