package ojtexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutosuggestionEx {
	WebDriver driver;
	@Test
	public void loginPage() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Notes\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("mumbai");
	List<WebElement> listofelements=driver.findElements(By.xpath(".//*[@class='autoFill']/li"));
	for (WebElement webElement : listofelements) {
		if(webElement.getText().trim().equals("Borivali East, Mumbai"))
		{
			webElement.click();
			break;
	}

}
	 Thread.sleep(5000);
	
}
}
