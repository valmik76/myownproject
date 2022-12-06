package keywordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		int rc = flib.getRowCountMethod(EXCEL_PATH, "invaliddata");
		
		for (int i = 1; i <=rc; i++) {
			String invalidusername = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 0);
			driver.findElement(By.name("username")).sendKeys(invalidusername);
			Thread.sleep(2000);
			String invalidpassword = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
	}

}
