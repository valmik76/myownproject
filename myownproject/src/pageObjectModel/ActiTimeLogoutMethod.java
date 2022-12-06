package pageObjectModel;

import java.io.IOException;

public class ActiTimeLogoutMethod extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
	    Flib flip = new Flib();
	    String validusername = flip.readPropertyData(PROP_PATH, "username");
	    String validpassword = flip.readPropertyData(PROP_PATH, "password");
		lp.validLoginTOActiTime(validusername, validpassword);
		
		HomePage hp = new HomePage(driver);
		hp.logOutmethod();
	}

}
