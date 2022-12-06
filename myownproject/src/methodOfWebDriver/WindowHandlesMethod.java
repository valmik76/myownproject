package methodOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Set<String> allHandles = driver.getWindowHandles();
		for(Object handle:allHandles) 
		{
			System.out.println(handle+"is bcz of getWindowHandles");	
		}

	}

}
