package automationTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	
	@Test
	public void invalidLogin()
	{
		System.out.println(1);
		BaseClass.enterText(driver, "id", null, null);
		driver.findElement(By.id("email")).sendKeys("wangikarpritam@gmai.com");
		driver.findElement(By.id("pass")).sendKeys("9623197821");
		driver.findElement(By.name("login")).click();
		String expResult=driver.findElement(By.xpath("//*[@id=\"error_box\"]")).getText();
		String actResult="incorrect password";
		Assert.assertEquals(actResult, expResult);
	}

}
