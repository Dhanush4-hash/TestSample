import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IncognitoBrowser {
	
	@Test(invocationCount = 2)
	public void verifyChromeIncognitoMode() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		List<String> arguments = Arrays.asList("--incognito", "--start-maximized");
		opt.addArguments(arguments);
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://dmp-us.informaticacloud.com/ma/home");
		Thread.sleep(1000);
		String incognitoPageTitle = driver.getTitle();
		System.out.println("incognitoPageTitle is "+incognitoPageTitle);
		driver.close();
	}
	
	@BeforeClass()
	public void verifyBeforeClass() {
		System.out.println("before Class");
		
	}
	
	@BeforeMethod()
	public void verifyBeforeTest() {
		System.out.println("before Method");
		
	}

}
