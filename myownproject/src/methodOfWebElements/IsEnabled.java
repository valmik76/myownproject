package methodOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		WebElement loginbtn = driver.findElement(By.xpath("//button[@class='_acan _acap _acas']"));
	    boolean lgnbtn = loginbtn.isEnabled();
	    System.out.println(lgnbtn);
		
	}

}
