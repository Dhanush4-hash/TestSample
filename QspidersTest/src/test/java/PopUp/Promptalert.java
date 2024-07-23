package PopUp;

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

public class Promptalert {

	WebDriver driver;

	@BeforeMethod
	public void verifyBrowserSetUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	}

	@Test
	public void verifyPromptAlert() throws InterruptedException {
		WebElement promptBtn = driver.findElement(By.xpath("//input[@id='prompt']"));
		promptBtn.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hi dhanush");
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		promptBtn.click();
		Thread.sleep(2000);
	//	Alert alert1 = driver.switchTo().alert();
		alert.sendKeys("Hi dhanush");
		Thread.sleep(4000);
		alert.accept();
		Thread.sleep(1000);
	}

	@AfterMethod
	public void verifyTearDown() {
		driver.quit();
	}

}
