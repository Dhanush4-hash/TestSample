
package TestNg;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import demolog.Deomlog4j;

public class ReadOnlyTextBox {

	@Test(dependsOnMethods = "verifyDropdowns", invocationCount = 2)
	public void verifyReadOnlyText() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement inputField = driver.findElement(By.xpath("//input[@id='rotb']"));
		inputField.isDisplayed();
		Deomlog4j log = new Deomlog4j();
		log.verifyLogLevels();
		String abc = inputField.getAttribute("value");
		System.out.println("abc is " + abc);
		Point inputFieldLocation = inputField.getLocation();
		System.out.println("inputFieldLocation is " + inputFieldLocation);
		driver.quit();

	}

	@Test()
	public void verifyDropdowns() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDownBtn = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropDown = new Select(dropDownBtn);
		List<WebElement> dropDownOptions = dropDown.getOptions();
		int size = dropDownOptions.size();
		System.out.println("dropDownOptions Count is " + size);
		for (int i = 0; i < size; i++) {
			String otions = dropDownOptions.get(i).getText();
			System.out.println("dropDownOptions are " + otions);

		}
		dropDown.selectByIndex(2);
		Thread.sleep(500);
		dropDown.selectByIndex(1);
		Thread.sleep(500);
		dropDown.selectByVisibleText("Option3");
		Thread.sleep(500);
		driver.quit();

	}

	@Test()
	public void verifyTheTableContents() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		int webTableColoumsCount = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr/th")).size();
		System.out.println("webTableColoumsCount is " + webTableColoumsCount);
		int webTableRowsCount = driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody//tr")).size();
		System.out.println("webTableRowsCount is " + webTableRowsCount);
		driver.quit();

	}

	@Test
	public void verifyMouseHover() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement mousehoverBtn = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions act = new Actions(driver);
		act.moveToElement(mousehoverBtn).perform();
		act.clickAndHold(mousehoverBtn).build().perform();

		Thread.sleep(3000);
		driver.quit();

	}

	@Test
	public void verifySujjestionClass() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement sujjestionTextField = driver
				.findElement(By.xpath("//input[@placeholder='Type to Select Countries']"));
		sujjestionTextField.sendKeys("United S");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		Thread.sleep(1000);
		driver.quit();

	}

	@Test

	public void verifyHtmiBrowser() {

	}

	@Test
	public void verifyHeadLessBrowser() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver(opt);
		String actualUrl = "https://rahulshettyacademy.com/AutomationPractice/";
		driver.get(actualUrl);
		String expectedUrl = driver.getCurrentUrl();
		System.out.println("url is " + expectedUrl);
		assertEquals(actualUrl, expectedUrl);
		String pageTitle = driver.getTitle();
		System.out.println("pageTitle is " + pageTitle);
	}

	@Test(testName = "dhanushSdet")
	public void verifyMousePress() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice/");
		Robot robot = new Robot();
		robot.delay(1000);
		WebElement testExceptions = driver.findElement(By.xpath("//a[.='Test Exceptions']"));
		testExceptions.isDisplayed();
		Actions act = new Actions(driver);
		act.moveToElement(testExceptions).build().perform();
		robot.delay(2000);
		act.moveToElement(testExceptions).click().build().perform();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://practicetestautomation.com/practice-test-exceptions/";
		assertEquals(actualUrl, expectedUrl);
		robot.delay(2000);
		driver.quit();

	}

}