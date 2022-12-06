package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
	 FirefoxDriver Driver = new FirefoxDriver();
	 Thread.sleep(8000);
	 Driver.close();
	}

}
