package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Popups {

	WebDriver driver;

	@BeforeMethod
	public void verifyBrowserLaunh() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@AfterMethod
	public void verifyTearDown() {
		driver.quit();
	}

	@Test
	public void verifyAlertPopUp() throws InterruptedException {
		WebElement alertBtn = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		alertBtn.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		String alertPopUpText = alert.getText();
		System.out.println("alertPopUpText is: " + alertPopUpText);
		alert.accept();
		Thread.sleep(1000);
	}

	@Test
	public void verifyConfirmPopUp() throws InterruptedException {
		WebElement confirmBtn = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		confirmBtn.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(1000);
		confirmBtn.click();
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(1000);
	}

}