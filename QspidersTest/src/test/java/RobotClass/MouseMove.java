package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MouseMove {

	@Test
	public void verifyMouseMove() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogdTab = driver.findElement(By.xpath("//span[.='Blogs']"));
		Point blogdTabLocation = blogdTab.getLocation();
		int blogdTabXaxisLocation = blogdTabLocation.getX();
		int blogdTabYaxisLocation = blogdTabLocation.getY();
		System.out.println("blogdTabXaxisLocation is : " + blogdTabXaxisLocation);
		System.out.println("blogdTabYaxisLocation is : " + blogdTabYaxisLocation);
		Robot robot = new Robot();
		robot.mouseMove(blogdTabXaxisLocation, 320);
		robot.delay(3000);
		List<WebElement> seleniumOptions = driver.findElements(By.xpath("//div[@id='cssmenu']//li//ul//li"));

		int seleniumOptionsSize = seleniumOptions.size();
		System.out.println("seleniumOptionsSize is : " + seleniumOptionsSize);

		for (int i = 0; i < seleniumOptionsSize; i++) {
			String seleniumOptionsText = seleniumOptions.get(i).getText();
			System.out.println("seleniumOptionsText is : " + seleniumOptionsText);
		}

		driver.quit();
	}

}