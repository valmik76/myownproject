package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
	    Flib flip = new Flib();
	    String validusername = flip.readPropertyData(PROP_PATH, "username");
	    String validpassword = flip.readPropertyData(PROP_PATH, "password");
		lp.validLoginToActiTime(validusername, validpassword);
		
	}

}
