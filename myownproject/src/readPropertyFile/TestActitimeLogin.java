package readPropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeLogin {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=l2jqjvrl5wb7");
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData("./data/config.properties", "username");
		driver.findElement(By.name("username")).sendKeys(validUsername);
		String validPassword = flib.readPropertyData("./data/config.properties", "password");
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		driver.findElement(By.id("loginButton")).click();
	}
}
