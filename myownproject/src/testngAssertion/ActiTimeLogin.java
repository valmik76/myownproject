package testngAssertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeLogin {
	WebDriver driver;
	@Test
	public void loginToActitime() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=l2jqjvrl5wb7");
		String actualLoginPageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualLoginPageTitle, "actiTIME - Login");//soft assert
		
		WebElement usernameTb = driver.findElement(By.name("username"));
		boolean statusofusernametab = usernameTb.isDisplayed();
		Assert.assertEquals(statusofusernametab, true);//hard assert
		usernameTb.sendKeys("admin");
		
		WebElement passwordTb = driver.findElement(By.name("pwd"));
		boolean statusofpasswordtab = passwordTb.isDisplayed();
		Assert.assertEquals(statusofpasswordtab, true);//hard assert
		passwordTb.sendKeys("manager");
		
		WebElement clickButton = driver.findElement(By.id("loginButton"));
		boolean statusofclickbutton = clickButton.isDisplayed();
		Assert.assertEquals(statusofclickbutton, true);//hard assert
		clickButton.click();
		Thread.sleep(3000);
		
		String actualhomepagetitle = driver.getTitle();
		softassert.assertEquals(actualhomepagetitle, "actiTIME - Enter Time-Track");//soft assert
		
		Reporter.log("create user",true);
		Reporter.log("create reports",true);
		
		softassert.assertAll();//user mandatory line when soft assert is used
	}
}
