package methodOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nothing phone 1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[.='Nothing Phone (1) (White, 256 GB)'])[1]")).click();
		Thread.sleep(4000);
		Set<String> bothHandles = driver.getWindowHandles();
		for(String handle:bothHandles)
		{
			if (!parentHandle.equals(handle)) 
			{
				driver.switchTo().window(handle);	
			}
			else 
			{

			}
		}
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='_1fGeJ5 PP89tw'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("425423");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(4000);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO' and text()='Remove']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ' and text()='Remove']")).click();

	}
} 
