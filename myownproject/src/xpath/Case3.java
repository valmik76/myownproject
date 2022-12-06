package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[contains(@name ,'user')]")).sendKeys("9012345556");
		driver.findElement(By.xpath("//input[contains(@name ,'word')]")).sendKeys("valmik@123");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
