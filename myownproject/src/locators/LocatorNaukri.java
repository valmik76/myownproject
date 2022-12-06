package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorNaukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/recruit/login?msg=TO&URL=https%3A%2F%2Fposting.naukri.com");
		driver.findElement(By.xpath("//li[.='Login/Register']")).click();
		driver.findElement(By.id("loginEmail")).sendKeys("valmik@gmail.com");
		driver.findElement(By.id("password")).sendKeys("valmik@123");
		driver.findElement(By.id("loginBtn")).click();

	}

}
