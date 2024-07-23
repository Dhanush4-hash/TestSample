package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollWindow {

	@Test
	public void verifyPageScroll() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i <= 4; i++) {
			js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(1000);
		}

		for (int i = 0; i <= 4; i++) {
			js.executeScript("window.scrollBy(0,-300)");
			Thread.sleep(1000);
		}
		
		Thread.sleep(2000);
		WebElement searchTxtField = driver.findElement(By.xpath("//input[@class='gsc-input']"));
		js.executeScript("arguments[0].value='Hi dhanush'", searchTxtField);

		WebElement alertBtn = driver.findElement(By.xpath("//input[@id='alert1']"));
		js.executeScript("arguments[0].click()", alertBtn);
		Thread.sleep(2000);

		driver.quit();
	}

}
