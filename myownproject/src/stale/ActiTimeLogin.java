package stale;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=l2jqjvrl5wb7");
		Thread.sleep(3000);
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("admin");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		usn.clear();
		usn.sendKeys("valmik");
	}

}
