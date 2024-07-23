package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RefreshPage {

	@Test
	public void verifyBrowserRefresh() throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.delay(2000);
		r.keyRelease(KeyEvent.VK_F5);
		r.delay(2000);
		driver.quit();
	}

	@Test
	public void scriptToMaximizeBrowser() throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com");
		Thread.sleep(2000);
		String urlString = "https://ebclj.blogspot.com/p/selenium-interview-questions.html";
		driver.navigate().to(urlString);
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Robot r = new Robot();


		
	}

}
