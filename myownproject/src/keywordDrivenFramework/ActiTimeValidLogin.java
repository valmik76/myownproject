package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flip = new Flib();
		String validUsename = flip.readPropertyData(PROP_PATH, "username");
		String validPassword = flip.readPropertyData(PROP_PATH, "password");
		
		driver.findElement(By.name("username")).sendKeys(validUsename);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		driver.findElement(By.id("loginButton")).click();
		
		bt.tearDown();
	}

}
