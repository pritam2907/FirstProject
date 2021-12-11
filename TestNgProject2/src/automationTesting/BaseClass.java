package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	static WebDriver driver=null;
	public WebDriver selectBrowser(String brName)
	{
		if("chrome".equals(brName)) {
			 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			 driver=new ChromeDriver();
			}
			else if("firefox".equals(brName) || "mozilla".equals(brName)) {
				 System.setProperty("webdriver.firefox.driver","firefoxdriver.exe");
				 driver=new FirefoxDriver();
			}
			else if ("edge".equals(brName)){
				System.setProperty("webdriver.edge.driver","edgedriver.exe");
				driver=new EdgeDriver();
			}
			else {
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				 driver=new ChromeDriver();
			}
			return driver;
	}
	@BeforeTest
	public static void openBrowser()
	{
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	public static void enterText(WebDriver driver,String locName,String locValue,String datatoenter) {
    	System.out.println(4);
    	if(locName.equals("id")) {
    	driver.findElement(By.id(locName)).sendKeys(datatoenter);             
    }
    	else if(locName.equals("xpath")) {
        	driver.findElement(By.xpath(locName)).sendKeys(datatoenter);
}
    	else if(locName.equals("name")) {
        	driver.findElement(By.name(locName)).sendKeys(datatoenter);
   }
}

}
