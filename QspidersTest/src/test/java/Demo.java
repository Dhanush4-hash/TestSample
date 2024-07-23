import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;

public class Demo {

	@Test(dataProvider = "SearchProvider")

	public void verifyEnrichCall(String orgName, String countryCode) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();

		List<String> arguments = Arrays.asList("--incognito", "--start-maximized");

		opt.addArguments(arguments);

		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://dmp-us.informaticacloud.com/ma/home");

		Thread.sleep(2000);

		WebElement userNameTxtField = driver.findElement(By.xpath("//input[@class='infaField' and @type='text']"));

		userNameTxtField.isDisplayed();

		WebElement passwordTextField = driver.findElement(By.xpath("//input[@type='password']"));

		userNameTxtField.sendKeys("n.dhanush");

		Thread.sleep(1000);

		passwordTextField.sendKeys("@dnaikSince1998");

		WebElement loginBtn = driver.findElement(By.xpath("//span[.='Log In']"));

		loginBtn.isDisplayed();

		loginBtn.click();

		Thread.sleep(10000);

		String currentUrl = driver.getCurrentUrl();

		System.out.println("currentUrl is " + currentUrl);

		Thread.sleep(16000);

		WebElement newBtn = driver.findElement(By.xpath("//span[.='New']"));

		newBtn.isDisplayed();

		newBtn.isEnabled();

		newBtn.click();

		WebElement organizationBtn = driver.findElement(By.xpath("//div[@data-testid='entity-c360.organization']"));

		organizationBtn.isDisplayed();

		organizationBtn.isEnabled();

		organizationBtn.click();

		WebElement createOrganizationBtn = driver.findElement(By.xpath("//span[.='Create']"));

		createOrganizationBtn.isDisplayed();

		createOrganizationBtn.isEnabled();

		createOrganizationBtn.click();

		Thread.sleep(4000);

		String orgTitle = driver.getTitle();

		System.out.println("orgTitle is " + orgTitle);

		WebElement newOrganizationLbl = driver.findElement(By.xpath("//div[@class='field-wrapper']"));

		newOrganizationLbl.isDisplayed();

		String newOrganizatioText = newOrganizationLbl.getText();

		System.out.println("newOrganizatioText is " + newOrganizatioText);

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(orgName);

		WebElement addAddressICon = driver.findElement(By.xpath(

				"//div[@data-testid='X_EXGS_ADDR_FGROUP-section']//i[@class='d-section__header__toggle-expansion-icon--collapsed']"));

		addAddressICon.isDisplayed();

		addAddressICon.isEnabled();

		addAddressICon.click();

		Thread.sleep(1000);

		WebElement addAddressBtn = driver.findElement(By.xpath(

				"//div[@data-testid='X_EXGS_ADDR_FGROUP-section']//button[@class='d-version-2 d-button d-button--secondary']"));

		addAddressBtn.isDisplayed();

		addAddressBtn.isEnabled();

		addAddressBtn.click();

		Thread.sleep(1000);

		WebElement recomendationPanel = driver.findElement(By.xpath("//i[@class='aicon aicon__chevron-double-down']"));

		recomendationPanel.click();

		Thread.sleep(1000);

		WebElement countryDropdown = driver.findElement(By.xpath(

				"//div[@data-testid='formik-dropdown-X_EXGS_ADDR_FGROUP[0].X_EXGS_ACNTY_NM']//i[@class='d-dropdown__button__icon']"));

		countryDropdown.isDisplayed();

		countryDropdown.click();

		Thread.sleep(1000);

		WebElement countryDropdownOption = driver.findElement(By.xpath(countryCode));

		countryDropdownOption.click();

		WebElement recomendationPanelBtn = driver

				.findElement(By.xpath("//button[@class='slide-container-tab slide-container-tab--recommendations']"));

		recomendationPanelBtn.isDisplayed();

		recomendationPanelBtn.click();

		Thread.sleep(1000);

		WebElement enrichSearchBtn = driver.findElement(By.xpath(

				"//aside[contains(@class,'slide-container slide-container--entered')]//div[1]//div[2]//button[1]//span[1]"));

		enrichSearchBtn.isDisplayed();

		enrichSearchBtn.click();

		Thread.sleep(6000);

		WebElement selectRadioBtn = driver

				.findElement(By.xpath("//*[@id=\"xrefBlock\"]/div/div[1]/div[1]/div/div[1]/div"));

		selectRadioBtn.isDisplayed();

		selectRadioBtn.click();

		WebElement importCancelBtn = driver.findElement(By.xpath("//span[.='Cancel']"));

		importCancelBtn.isDisplayed();

		importCancelBtn.isEnabled();

		WebElement importBtn = driver.findElement(By.xpath("//span[.='Import']"));

		importBtn.isDisplayed();

		importBtn.isEnabled();

		importBtn.click();

		Thread.sleep(6000);

		WebElement confirmCancelBtn = driver

				.findElement(By.xpath("//button[@data-testid='confirmation-dialog-cancel']"));

		confirmCancelBtn.isDisplayed();

		confirmCancelBtn.isEnabled();

		WebElement confirmImportBtn = driver

				.findElement(By.xpath("//button[@data-testid='confirmation-dialog-import']"));

		confirmImportBtn.isDisplayed();

		confirmImportBtn.isEnabled();

		confirmImportBtn.click();

		Thread.sleep(9000);

		WebElement importStatusBtn = driver.findElement(By.xpath("//span[.='OK']"));

		importStatusBtn.isDisplayed();

		importStatusBtn.isEnabled();

		importStatusBtn.click();

		Thread.sleep(5000);

		WebElement uiPrimaryName = driver.findElement(

				By.xpath("//div[@data-testid='name-field-err-wrapper']//div[@data-testid='name-wrapper']"));

		uiPrimaryName.isDisplayed();

		String uiPrimaryNameText = uiPrimaryName.getText();

		System.out.println("uiPrimaryNameText is " + uiPrimaryNameText);

		/*
		 * 
		 * WebElement importPanel =
		 * 
		 * driver.findElement(By.xpath("//i[@class='aicon aicon__chevron-double-down']")
		 * 
		 * ); importPanel.click();
		 * 
		 */

		WebElement enrichmentStatus = driver.findElement(By.xpath(

				"//body/div[@id='root']/div[contains(@class,'d-shell d-shell--vertical')]/main[contains(@class,'d-shell__main')]/div[contains(@class,'d-shell__page__content record-shell-page')]/div[contains(@class,'')]/div/form[contains(@class,'page-container')]/div[contains(@class,'header-without-panel rp-tab-container')]/div[@id='tab-panel-container-2']/div[17]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]"));

		enrichmentStatus.isDisplayed();

		enrichmentStatus.isEnabled();

		enrichmentStatus.click();

		enrichmentStatus.click();

		/*
		 * 
		 * WebElement enrichmentStatusIcon = driver.findElement( By.xpath(
		 * 
		 * "//div[@id='d_sectionContent_ZhdpW2DN']//div[2]//div[1]//span[1]//button[1]//i[1]"
		 * 
		 * )); enrichmentStatusIcon.click(); Thread.sleep(1000);
		 * 
		 * enrichmentStatusIcon.click();
		 * 
		 */
		WebElement matchStatusGroup = driver.findElement(By.xpath(
				"//div[@data-testid='X_EXGS_DNB_ERICHMNT_STS_FGROUP[0].X_EXGS_ERICHMNT_STS-wrapper']//div[.='RT_MATCHED']"));
		matchStatusGroup.isDisplayed();
		String matchStatusGroupText = matchStatusGroup.getText();
		WebElement enrichmentStatusGroup = driver.findElement(By.xpath(
				"//div[@data-testid='X_EXGS_DNB_ERICHMNT_STS_FGROUP[1].X_EXGS_ERICHMNT_STS-wrapper']//div[.='RT_ENRICHED']"));
		matchStatusGroup.isDisplayed();
		String enrichmentStatusGroupText = enrichmentStatusGroup.getText();
		System.out.println("Enrich statue for " + orgName + " Customer Record is " + enrichmentStatusGroupText);
		System.out.println("Match statue for " + orgName + " Customer Record is " + matchStatusGroupText);
		driver.quit();

	}

	@DataProvider(name = "SearchProvider")

	public Object[][] getDataFromDataprovider() {

		return new Object[][]

		{ { "Gopro, Inc.", "//span[.='United States']" },

				{ "Horseshoe Bay Resort Destinations, LLC", "//span[.='United States']" },
				{ "Oracle Corporation", "//span[.='United States']" }, { "Google", "//span[.='United States']" },
				{ "County of Potter", "//span[.='United States']" },
				{ "Hensel Phelps Construction Co", "//span[.='United States']" },
				{ "Dell", "//span[.='United States']" }, { "volvo", "//span[.='United States']" },
				{ "Mercedes benz", "//span[.='United States']" }, { "Scania", "//span[.='United States']" },
				{ "Chrome", "//span[.='United States']" }, { "Firefox", "//span[.='United States']" },
				{ "Audi", "//span[.='United States']" }, { "Bmw", "//span[.='United States']" },
				{ "Microsoft Edge", "//span[.='United States']" }, { "Snipping tool", "//span[.='United States']" },
				{ "Postman", "//span[.='United States']" }, { "Jp morgan", "//span[.='United States']" },
				{ "IBM", "//span[.='United States']" }, { "Service now", "//span[.='United States']" } };

	}

}
