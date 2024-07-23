package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassA {

	@Test
	public void verifyClassATestA() {
		System.out.println("Demo - ClassATestA");
	}

	@Test
	public void verifyClassATestB() {
		System.out.println("Demo - ClassATestB");
	}

	@BeforeMethod
	public void verifyClassABm() {
		System.out.println("Demo -- ClassABm");
	}

	@AfterMethod
	public void verifyClassAAm() {
		System.out.println("Demo -- ClassAAm");
	}

	@BeforeClass
	public void verifyBeforeClass() {
		System.out.println("Demo -- ClassA BeforeClass ");
	}

	@AfterClass
	public void verifyAfterClass() {
		System.out.println("Demo -- ClassA AfterClass ");
	}

}