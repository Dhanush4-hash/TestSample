package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver = null;

	@org.testng.annotations.Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.printf("Thread Number is : %d of %s\n", Thread.currentThread().getId(), browserName);
			genericMethod(browserName);
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.out.printf("Thread Number is : %d of %s\n", Thread.currentThread().getId(), browserName);
			genericMethod(browserName);

		}

		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			System.out.printf("Thread Number is : %d of %s\n", Thread.currentThread().getId(), browserName);
			genericMethod(browserName);
		}

	}

	@Test
	public void verifyBrowser() throws InterruptedException {
		System.out.println("Hi dhanush");
		Thread.sleep(500);

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();

	}

	@Test(enabled = false)
	public void genericMethod(String browserName) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium best cources", Keys.ENTER);
		WebElement googleText = driver.findElement(By.xpath("//a[@title='Go to Google Home']"));
		int googleTextLocation = googleText.getLocation().getX();
		System.out.println("googleTextLocation for " + browserName + " is " + googleTextLocation);
	}

}