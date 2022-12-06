package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorMonster {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hiring.monster.com/signin.aspx");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("valmikcborse90@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Valmik@123");
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

	}

}
