package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorShine {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/myshine/login/");
		driver.findElement(By.id("id_email_login")).sendKeys("valmikcborse90@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Valmik@123");
		driver.findElement(By.cssSelector("button[class='cls_base_1_pw_login_btn ui-btn ui-btn_n btn btn-lg btn-yellow search-btn submitred']" )).click();

	}

}
