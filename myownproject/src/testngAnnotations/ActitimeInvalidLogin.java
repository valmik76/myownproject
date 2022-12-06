package testngAnnotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActitimeInvalidLogin {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=l2jqjvrl5wb7");
	}
	
	@DataProvider
	public Object[][] dataProviderActitime()
	{
		Object[][] data = new Object[5][2];
		
		data[0][0]="admin";
		data[0][1]="manager123";
		
		data[1][0]="admin1223";
		data[1][1]="admin1";
		
		data[2][0]="123manger";
		data[2][1]="admin";
		
		data[3][0]="1234";
		data[3][1]="manage";
		
		data[4][0]="admi";
		data[4][1]="admin12";
		
		return data;
	}


	@Test(dataProvider = "dataProviderActitime")
	public void testInvalidLogin(String username,String password) 
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
}
