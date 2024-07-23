package TestNg;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownSelAllOpt {

	@Test
	public void verifySelectAllOpt() throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("incognito");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		String url = "https://trytestingthis.netlify.app/";
		driver.get(url);

		WebElement dropDown = driver.findElement(By.xpath("//select[@id='option']"));
		Select s = new Select(dropDown);
		List<WebElement> dropDownOptions = s.getOptions();
		int dropDownOptionsSize = dropDownOptions.size();

		System.out.println("dropDownOptionsSize is " + dropDownOptionsSize);

		/**
		 * Select last opt in the dropdown
		 */

		s.selectByIndex(dropDownOptionsSize - 1);

		Thread.sleep(2000);

		for (int i = 0; i < dropDownOptionsSize; i++) {
			String dropDownOptionsText = dropDownOptions.get(i).getText();

			System.out.println("dropDownOptionsText is : " + dropDownOptionsText);

			if (dropDownOptionsText.equalsIgnoreCase("option 2")) {
				Thread.sleep(1000);
				s.selectByValue("option 2");
				Thread.sleep(1000);
			}

		}

		/**
		 * Select all opt in the dropdown
		 */

		for (int i = 0; i < dropDownOptionsSize; i++) {
			String dropDownOptionsText = dropDownOptions.get(i).getText();

			s.selectByIndex(i);
			Thread.sleep(1000);

		}

		/**
		 * for-each loop for selecting the dropdown options
		 */

		for (WebElement option : dropDownOptions) {
			String dropOptText = option.getText();
			System.out.println("For-Eah loop dropOptText is : " + dropOptText);

			if (dropOptText.equalsIgnoreCase("Option 2")) {
				option.click();

			} else {
				System.out.println("Option is not selected");
			}

		}

		driver.quit();

	}

}