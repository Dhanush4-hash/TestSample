package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GenericClass {
	WebDriver driver = null;

	@Test
	public void genericMethod() {
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium best cources", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebElement googleText = driver.findElement(By.xpath("//a[@title='Go to Google Home']"));
		int googleTextLocation = googleText.getLocation().getX();
		System.out.println("googleTextLocation is :"+googleTextLocation);
		
	}

}
