package RobotClass;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {
	// Script to verify the Screnshot  by specifying the x y z co ordinates

	@Test
	public void verifyScreenShot() throws AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		Robot robot=new Robot();
		Rectangle rectangle=new Rectangle(25, 400, 500, 500);
		BufferedImage srcImage = robot.createScreenCapture(rectangle);
		ImageIO.write(srcImage, "JPG", new File("./Screenshots/robot10.jpg"));
		driver.quit();
	}

}
