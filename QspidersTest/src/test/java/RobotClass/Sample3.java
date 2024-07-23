package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample3 {

	@Test
	public void verifyPageScrolling() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Robot robot = new Robot();
		robot.mouseWheel(80);
		robot.delay(1000);
		robot.mouseWheel(-80);
		robot.delay(1000);
		driver.close();
	}
	
}
