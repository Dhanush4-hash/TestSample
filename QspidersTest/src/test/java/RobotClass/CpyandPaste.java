package RobotClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CpyandPaste {

	@Test
	public void verifyKeyEvents() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		WebElement fullNameInputLocator = driver.findElement(By.xpath("//input[@id='userName']"));
		fullNameInputLocator.sendKeys("dhanush");
		WebElement emailIdInputLocator = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB);
		act.build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
