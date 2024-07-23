package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyAsericSimble {

	@Test
	public void verifyTheSucessMessage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://play1.automationcamp.ir/advanced.html");
		WebElement asteRiskSymbol = driver.findElement(By.xpath("//label[@class='star-rating']"));
		String asteRiskSymbolText = asteRiskSymbol.getText();
		System.out.println("asteRiskSymbolText is :"+asteRiskSymbolText);
		WebElement enterRatingLocator = driver.findElement(By.xpath("//input[@class='form-control shadow-sm']"));
		enterRatingLocator.isDisplayed();
		enterRatingLocator.sendKeys(asteRiskSymbolText);
		WebElement clearRatingButton = driver.findElement(By.xpath("//button[@id='check_rating']"));
		clearRatingButton.isDisplayed();
		clearRatingButton.isDisplayed();
		clearRatingButton.click();
		WebElement successMessage = driver.findElement(By.xpath("validate_rating"));
		successMessage.isDisplayed();
		driver.close();
	}

}
