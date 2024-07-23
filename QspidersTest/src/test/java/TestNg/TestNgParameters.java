package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameters {

	@Parameters("parameterName")
	@Test
	public void verifyParameters(String parameterName) {

	}

}
