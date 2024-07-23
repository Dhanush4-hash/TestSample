package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseRightClick {

	WebDriver driver;

	@BeforeMethod
	public void verifyBrowserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	}

	@Test
	public void verifyMouseRightClick() throws AWTException {
		WebElement blogdTab = driver.findElement(By.xpath("//span[.='Blogs']"));
		Point blogdTabLocation = blogdTab.getLocation();
		int blogdTabXaxisLocation = blogdTabLocation.getX();
		int blogdTabYaxisLocation = blogdTabLocation.getY();
		System.out.println("blogdTabXaxisLocation is : " + blogdTabXaxisLocation);
		System.out.println("blogdTabYaxisLocation is : " + blogdTabYaxisLocation);
		Robot robot = new Robot();
		robot.mouseMove(blogdTabXaxisLocation, 320);
		robot.delay(3000);
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(3000);
	}
	
	@Test
	public void verifyBrowserRefresh() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=' LogIn ']")).sendKeys(Keys.F5);
		Thread.sleep(4000);
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}