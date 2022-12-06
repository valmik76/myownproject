package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BluestoneMsgIcon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://bluestone.com");
		Thread.sleep(2000);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//html[@class='fc-widget-normal']")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("valmik");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("valmik90@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("1234567879");
		
	}

}
