package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selectallchkbox {

	@Test
	public void verifyTheSelectChkBox() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> chekBoxes = driver.findElements(By.xpath("//legend[.='Checkbox Example']/..//label//input"));
		int chekBoxesSize = chekBoxes.size();
		System.out.println("chekBoxesSize is: " + chekBoxesSize);
		for (WebElement webElement : chekBoxes) {
			webElement.click();
			Thread.sleep(1000);
		}
		driver.quit();
	}

}