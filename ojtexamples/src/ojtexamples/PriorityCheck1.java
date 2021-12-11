package ojtexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityCheck1 {
	@Test(groups = "login")
	public void loginTest()
	{
		System.out.println("Test01");
		Assert.assertEquals(2, 2);
	}
	@Test(groups = "login" )
	public void dashTest()
	{
		System.out.println("Test02");
		Assert.assertEquals(2, 2);
		
	}
	@Test(groups = "login")
	public void userTest()
	{
		System.out.println("Test03");
		Assert.assertEquals(2, 2);
	}

}
