package javascriptExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		
		WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
		
		//flashing
		//JavaScriptUtil.flash(joinfree, driver);
		
		//draw border and screenshot
		//JavaScriptUtil.drawBorder(joinfree, driver);
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dest = new File("./screenShots/scrnshot.png");
		//Files.copy(src, dest);
		
		//capture title of the page
		System.out.println(driver.getTitle());//1st way
		String title = JavaScriptUtil.getTitleByJS(driver); //2nd way by using JSEx
		System.out.println(title);
		
		
		//clicking on element
		//WebElement loginbtn = driver.findElement(By.xpath("(//a[@class='btn border'])[1]"));
		//JavaScriptUtil.clickElementByJS(loginbtn, driver);
		
		
		//generate alert
		//JavaScriptUtil.generateAlert(driver, "you clicked login button");
		
		
		//refreshing the page
		//driver.navigate().refresh();  //1st way
		
		//JavaScriptUtil.refreshPage(driver);
		
		
		
		//scrollIntoview
		//WebElement element = driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		//JavaScriptUtil.scrollIntoview(element, driver );
		
		//scolldown till end of the page
		JavaScriptUtil.scrollPageDown(driver);
		
	}
	
}
