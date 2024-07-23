package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frames {

	@Test
	public void verifyiFrame() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		iframe1.isDisplayed();
		Thread.sleep(1000);
		driver.switchTo().frame(iframe1);

		Thread.sleep(1000);
		WebElement moreDropDown = driver
				.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[@class='dropdown-toggle']//i"));
		moreDropDown.isDisplayed();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(moreDropDown);

		Thread.sleep(4000);

		driver.switchTo().defaultContent();
		Thread.sleep(1000);

		WebElement mouseHover = driver.findElement(By.xpath("//button[.='Mouse Hover']"));
		mouseHover.isDisplayed();

		driver.quit();
	}

}