package ojtexamples;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	@Test
	public void Test01() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Notes\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/logout.html");
		driver.findElement(By.xpath("//img[@height='150px']")).isDisplayed();
		Assert.assertEquals(driver.findElement(By.xpath("//img[@height='150px']")).isDisplayed(), true);
		
	}
	@Test
	public void Test02()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Notes\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/logout.html");
		driver.manage().window().maximize();
	    Assert.assertEquals(driver.findElement(By.xpath("//b[text()='Java By Kiran']")).isDisplayed(), true);
	}
	@Test
	public void Test03()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Notes\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/logout.html");
		driver.manage().window().maximize();
	    Assert.assertEquals(driver.findElement(By.xpath("//h4[text()='JAVA | SELENIUM | PYTHON']")).isDisplayed(), true);
	}
	@Test
	public void Test04()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Notes\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/logout.html");
		driver.manage().window().maximize();
	    Assert.assertEquals(driver.findElement(By.xpath("//p[@class='login-box-msg']")).isDisplayed(), true);
	}

}
