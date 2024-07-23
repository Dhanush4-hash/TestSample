package RobotClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SendKeys {

	WebDriver driver;

	@BeforeMethod
	public void verifyBrowserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	}

	@Test
	public void verifyActionClassSendKeys() throws InterruptedException {
		WebElement userNameInputLocator = driver
				.findElement(By.xpath("//h2[.='LoginSection']/..//div//form//input[@name='userid']"));
		WebElement psedInputLocator = driver
				.findElement(By.xpath("//h2[.='LoginSection']/..//div//form//input[@name='pswrd']"));
		Actions actions = new Actions(driver);
		userNameInputLocator.sendKeys("dhanush");
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		psedInputLocator.sendKeys("globalss");
		actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
