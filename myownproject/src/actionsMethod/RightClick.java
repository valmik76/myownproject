package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=l2jqjvrl5wb7");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement menu = driver.findElement(By.name("username"));
		Actions act = new Actions(driver);
		act.contextClick(menu).perform();
	}

}
