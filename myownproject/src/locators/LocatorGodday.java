package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorGodday {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sso.godaddy.com/?realm=idp&app=dashboard.api&path=%2Fvh-login-redirect&marketid=en-US");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("valmikcborse90@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Valmik@123");
		driver.findElement(By.id("submitBtn")).click();

	}

}
