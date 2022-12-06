package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=23ps8indakign");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//a[contains(@class,'content a')]")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
	}

}
