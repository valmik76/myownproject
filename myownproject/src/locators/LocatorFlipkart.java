package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFlipkart {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("9012345557");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("valmik@123");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

	}

}
