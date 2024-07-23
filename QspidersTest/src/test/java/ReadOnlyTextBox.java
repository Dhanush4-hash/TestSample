import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadOnlyTextBox {

	@Test(priority = 6,  dependsOnMethods= "verifyDropdowns")
	public void verifyReadOnlyText() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement inputField = driver.findElement(By.xpath("//input[@id='rotb']"));
		inputField.isDisplayed();
		String abc = inputField.getAttribute("value");
		System.out.println("abc is " + abc);
		Point inputFieldLocation = inputField.getLocation();
		System.out.println("inputFieldLocation is " + inputFieldLocation);
		driver.quit();

	}

	@Test(priority = 1)
	public void verifyDropdowns() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDownBtn = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropDown = new Select(dropDownBtn);
		dropDown.selectByIndex(2);
		Thread.sleep(500);
		dropDown.selectByIndex(1);
		Thread.sleep(500);
		dropDown.selectByVisibleText("Option3");
		Thread.sleep(500);
		driver.quit();

	}

	@Test(priority = 10)
	public void verifyTheTableContents() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int webTableColoumsCount = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr/th")).size();
		System.out.println("webTableColoumsCount is " + webTableColoumsCount);
		int webTableRowsCount = driver.findElements(By.xpath("//div[@class='tableFixHead']//tbody//tr")).size();
		System.out.println("webTableRowsCount is " + webTableRowsCount);
		driver.quit();

	}

	@Test(priority = 3)
	public void verifyMouseHover() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement mousehoverBtn = driver.findElement(By.xpath("//button[@id='mousehover']"));
		Actions act = new Actions(driver);
		act.moveToElement(mousehoverBtn).perform();
		Thread.sleep(1000);
		driver.quit();

	}

	@Test(priority = 4)
	public void verifySujjestionClass() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement sujjestionTextField = driver
				.findElement(By.xpath("//input[@placeholder='Type to Select Countries']"));
		sujjestionTextField.sendKeys("United S");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		Thread.sleep(1000);
		driver.quit();

	}
	
	@BeforeSuite()
		public void verifyBeforeSuite() {
			System.out.println("before suite");
			
		}
	
	@BeforeTest()
	public void verifyBeforeTest() {
		System.out.println("before Test");
		
	}
	
	
		
	}

