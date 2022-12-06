package popUpHandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/user/Desktop/HTML/alertpopup.html");
		Thread.sleep(2000);
		//popup is generated
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		//control is switched to alert popup
		Alert al = driver.switchTo().alert();
		//we get the text of the alert popup
		String text = al.getText();
		//display the text
		System.out.println(text);
		//hit the ok button
		al.dismiss();
		
		//generates the NoAlertPresentException because alert is already handled
	    //al.accept();
		
		
	}

}
