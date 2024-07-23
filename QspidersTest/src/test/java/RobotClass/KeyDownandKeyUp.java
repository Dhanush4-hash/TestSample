package RobotClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyDownandKeyUp {

	@Test
	public void verifyKeyUpAndKeyDown() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		WebElement compendiumdevLink = driver.findElement(By.xpath("//a[.='compendiumdev']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(compendiumdevLink).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

		Thread.sleep(2000);


		driver.quit();
	}

}
