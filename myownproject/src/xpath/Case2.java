package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sso.godaddy.com/?realm=idp&app=dashboard.api&path=%2Fvh-login-redirect&marketid=en-US");
		driver.findElement(By.xpath("//button[@id='non-progessive-sign-in']")).click();
		

	}

}
