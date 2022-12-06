package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipkartAssignment {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Core i5' and @class='_3879cV']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Brand']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_1Y4Vhm _4FO7b6' and .='HP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and .='Operating System']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Windows 10' and @class='_4921Z t0pPfW']")).click();
		Thread.sleep(3000);
		String priceOfLaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println(priceOfLaptop + "price of laptop");
	}

}
