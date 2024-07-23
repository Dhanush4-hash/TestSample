package demolog;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;

public class Deomlog4j {

	Logger logger = LogManager.getLogger(Deomlog4j.class);

	@Test
	public void verifyLogLevels() {

		logger.info("this is info level log");
		logger.error("this is error level log");
		logger.warn("this is warn level log");
		logger.fatal("this is fatal level log");

	}
	
	@AfterTest()
	public void verifyAfterTest() {
		System.out.println("After Test");
		
	}
	
	@AfterClass()
	public void verifyBeforeClass() {
		System.out.println("After Class");
		
	}
	

}
