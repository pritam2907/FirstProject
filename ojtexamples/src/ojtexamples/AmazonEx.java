package ojtexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonEx {
	WebDriver driver;
	@Test
	public void loginPage() {
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Notes\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=549521667087&hvpos=&hvnetw=g&hvrand=6011626793680567853&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299648&hvtargid=kwd-64107830&hydadcr=14452_2238348&gclid=EAIaIQobChMIvL-XmKXJ8wIVUylyCh3dSwS8EAAYASAAEgLEEvD_BwE");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
}
