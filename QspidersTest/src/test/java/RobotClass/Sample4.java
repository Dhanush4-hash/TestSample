package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample4 {
	// verify the file upload

	@Test
	public void verifyFileUpload() throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement chooseFileBtn = driver.findElement(By.id("file-upload"));
		Actions actions = new Actions(driver);
		actions.moveToElement(chooseFileBtn).click().build().perform();
		Robot robot = new Robot();
		robot.delay(1000);
		
		driver.close();
	}

}
