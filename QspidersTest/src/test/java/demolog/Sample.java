package demolog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {

	Logger logger = LogManager.getLogger(Sample.class);
	WebDriver driver;

	@BeforeMethod()
	public void verifyBrowserLaunch() {
		logger.info("Before method is executed");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName();
		String browserVersion = cap.getBrowserVersion();
		logger.info("Test execution browserName is :" + browserName);
		logger.info("Test execution browserVersion is :" + browserVersion);
		logger.info(browserName + " browser is launched");
		logger.info(browserName + " browser is got maximized");
	}

	@Test(dataProvider = "SoftwareNames")
	public void verifyStableVersions(String softwareName) throws InterruptedException {
		driver.get("https://www.selenium.dev/downloads/");
		logger.info("URL is entered in the Chrome browser");
		logger.info("Test execution for the " + softwareName + " is started");
		Thread.sleep(1000);
		WebElement softwareStableVersion = driver.findElement(
				By.xpath("//p[.='" + softwareName + "']/..//p[contains(.,'Stable')]//a[@class='card-link']"));
		softwareStableVersion.isDisplayed();
		logger.info("Relative X path is found for the " + softwareName + " Software");
		String javaStableVersionText = softwareStableVersion.getText();
		logger.debug(
				"Stable Version of the Selenium for the " + softwareName + " Languge is : " + javaStableVersionText);
	}

	@DataProvider(name = "SoftwareNames")
	public Object[][] softwareNames() {
		return new Object[][] { { "C#" }, { "Java" }, { "Python" }, { "JavaScript" }, { "Ruby" } };
	}

	@AfterMethod()
	public void verifyAfterMethod() {
		driver.quit();
		logger.info("After Method method is executed");
		logger.info("Browser is closed");
	}

	@BeforeSuite()
	public void beforeSuite() {
		logger.info("BeforeSuite  is executed");

	}

	@AfterSuite()
	public void verifyAfterSuite() {
		logger.info("AfterSuite method is executed");
	}

}