package automationTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver", "chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{
			String child_window=I1.next();
        if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
        System.out.println(driver.switchTo().window(child_window).getTitle());
		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);
		
		
	}

}
