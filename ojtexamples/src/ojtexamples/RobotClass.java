package ojtexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotClass {
	
	@Test
	public void loginTest() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Notes\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		WebElement element=driver.findElement(By.tagName("img"));
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
