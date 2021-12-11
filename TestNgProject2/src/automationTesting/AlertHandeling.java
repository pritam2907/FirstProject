package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandeling {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SELENIUM/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//button[@style='width:100px;']")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Balwant");
		driver.findElement(By.xpath("//input[@placeholder='Mobile']")).sendKeys("9623197821");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("wangikarpritam@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Java/J2EE']")).sendKeys("JAVA");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		WebElement sel=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		Select select=new Select(sel);
		Thread.sleep(2000);
		select.selectByValue("Delhi");
		driver.findElement(By.xpath("//input[@placeholder='Password' ]")).sendKeys("973759");
		driver.findElement(By.xpath("//input[@placeholder='FriendMobile' ]")).sendKeys("9373949048");
		driver.findElement(By.xpath("//button[@type='submit' ]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		
		
		
				
	}
}
