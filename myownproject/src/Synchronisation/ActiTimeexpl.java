package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeexpl {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1t84yebjco7yy");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String acualLoginPage = driver.getTitle();
		if(acualLoginPage.equals("actiTIME - Login"))
		{
			System.out.println("login page title matched , Test case pass");
		}
		else {
			System.out.println("login page title not matched , test case fail");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String acualHomePage = driver.getTitle();
		if(acualHomePage.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("home page title matched , Test case pass");
		}
		else {
			System.out.println("home page title not matched , test case fail");
		}
	}

}
