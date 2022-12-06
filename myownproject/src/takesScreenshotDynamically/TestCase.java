package takesScreenshotDynamically;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListener.class)
public class TestCase extends BaseTest{
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test
	public void actitime1()
	{
		
	}
	
	@Test
	public void actitime2()
	{
		
	}
	
	@Test
	public void actitime3()
	{
		Assert.fail();
	}
	
	@Test
	public void actitime4()
	{
		Assert.fail();
	}
	
	@Test
	public void actitime5()
	{
		Assert.fail();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
