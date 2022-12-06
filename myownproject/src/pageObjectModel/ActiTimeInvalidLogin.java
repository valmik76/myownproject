package pageObjectModel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();
		int rc = flib.getRowCountMethod(EXCEL_PATH, "invaliddata");

		for (int i = 1; i <= rc; i++) {
			String invalidusername = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 0);
			String invalidpassword = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 1);
			lp.invalidLoginTOActiTime(invalidusername, invalidpassword);
		} 

		bt.tearDown();


	}

}
