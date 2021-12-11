package ojtexamples;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Redbus {
	WebDriver driver;
	@Test
	public void loginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\SELENIUM\\\\Notes\\\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("signin-block"));
	    driver.findElement(By.id("signInLink")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		driver.findElement(By.id("newFbId")).click();
		Set<String>element=driver.getWindowHandles();
		Iterator<String>it=element.iterator();
		String parentwindow=it.next();
		System.out.println(parentwindow);
		String childwindow=it.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		driver.findElement(By.id("email")).sendKeys("wangikarpritam@gail.com");
		driver.findElement(By.id("pass")).sendKeys("9763001707");
		driver.findElement(By.xpath("/input[@type='submit']")).click();
		
		
	}

}
