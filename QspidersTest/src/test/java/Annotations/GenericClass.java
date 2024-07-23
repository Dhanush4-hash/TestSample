package Annotations;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericClass {

	WebDriver driver;

	@BeforeMethod
	public void verifyLogin() throws InterruptedException {
		Reporter.log("Login to appliations");
		System.out.println("Login");

		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.8.0");
		Thread.sleep(1000);
	}

	@AfterMethod
	public void verifyTearDown() {
		System.out.println("Logout");
		driver.quit();
	}

}