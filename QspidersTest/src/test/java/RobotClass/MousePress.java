package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MousePress {

	WebDriver driver;

	@BeforeMethod
	public void verifyBrowserLaunch() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@Test
	public void verifyMousePress() throws AWTException {
		WebElement selenium143Link = driver
				.findElement(By.xpath("//a[.='Free Access to InterviewQues/ResumeAssistance/Material']"));
		selenium143Link.isDisplayed();
		Point selenium143LinkLocation = selenium143Link.getLocation();
		int selenium143XaxisLinkLocation = selenium143LinkLocation.getX();
		int selenium143YaxisLinkLocation = selenium143LinkLocation.getY();

		System.out.println("selenium143XaxisLinkLocation is : " + selenium143XaxisLinkLocation);
		System.out.println("selenium143YaxisLinkLocation is : " + selenium143YaxisLinkLocation);

		Robot robot = new Robot();
		
		
		robot.mouseMove(950, 126);

		robot.delay(2000);

		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		robot.delay(4000);

	}

	@AfterMethod

	public void tearDown() {

		driver.close();
	}

}