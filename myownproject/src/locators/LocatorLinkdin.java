package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLinkdin {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.id("username")).sendKeys("valmikcborse90@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Valmik@123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
