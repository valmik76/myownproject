package methodOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=l2jqjvrl5wb7");
		Thread.sleep(4000);
		WebElement lgnbtn = driver.findElement(By.id("loginButton"));
		String property = lgnbtn.getCssValue("width");
		System.out.println(property);
	
	}
}
