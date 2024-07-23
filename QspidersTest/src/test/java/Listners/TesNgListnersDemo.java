package Listners;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TesNgListners.class)
public class TesNgListnersDemo {

	@Test
	public void verofyTutorialsNinjaUrl() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String actualUrl = "https://tutorialsninja.com/demo/";
		driver.get(actualUrl);
		String expUrl = driver.getCurrentUrl();
		System.out.println("actualUrl Url is : " + actualUrl);
		System.out.println("Expected Url is : " + expUrl);
		assertEquals(actualUrl, expUrl);
		WebElement dekstopTab = driver.findElement(By.xpath("//a[.='Desktops']"));
		dekstopTab.isDisplayed();
		dekstopTab.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement searchInputLocator = driver.findElement(By.xpath("//input[@name='search']"));
		searchInputLocator.sendKeys("Dhanush");

		searchInputLocator.sendKeys(Keys.CONTROL + "ax");
		Thread.sleep(2000);
		driver.quit();

	}

	@Test
	public void revString() {

		String str = "Dhanush";
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		String revString = "";

		for (int i = length - 1; i >= 0; i--) {
			revString = revString + charArray[i];
		}

		if (revString.equals(str)) {
			System.out.println("Given string is paliendrome");

		} else {
			System.out.println("Given string is not paliendrome");

		}

		System.out.println(revString);
	}

}