package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUdemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/");
		driver.findElement(By.name("email")).sendKeys("valmik90@gmail.com");
		driver.findElement(By.name("password")).sendKeys("valmik@123");
		driver.findElement(By.name("submit")).click();

	}

}
