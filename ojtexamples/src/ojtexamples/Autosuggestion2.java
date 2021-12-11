package ojtexamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggestion2 {

	WebDriver driver;
	@Test
	public void loginPage() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Notes\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
	List<WebElement> listofelements=driver.findElements(By.xpath(".//*[@jsname='bw4e9b']/li"));
	
	for (WebElement webElement : listofelements) {
		if(webElement.getText().trim().equals("selenium download"))
		{
			webElement.click();
			
		}
		
	}
	Thread.sleep(2000);
	driver.quit();
 }
}
