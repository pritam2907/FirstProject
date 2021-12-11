package automationTesting;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookies {

	        @Test
			public void main(String[] args) {
			      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			      WebDriver driver = new ChromeDriver();
			      driver.get("https://www.tutorialspoint.com/index.htm");
			      java.util.Set<Cookie> allCookies=driver.manage().getCookies();
			      System.out.println("count of cookies"+allCookies);
			      driver.manage().deleteAllCookies();
			      
			     
		}

}

