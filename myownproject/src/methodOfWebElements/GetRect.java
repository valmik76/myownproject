package methodOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		Rectangle rect = news.getRect();
		int h = rect.getHeight();
		int w = rect.getWidth();
		int x = rect.getX();
		int y = rect.getY();
		
		System.out.println("heitht "+h+"  width  "+w+"  xaxis  "+x+"  yaxis   "+y);
	}

}
