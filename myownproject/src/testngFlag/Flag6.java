package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	@Test
	  public void login() 
	  {
		  Reporter.log("login method",true);
	  }
	@Test(dependsOnMethods = "login")
	  public void createUser() 
	  {
		  Reporter.log("create user method",true);
	  }
	  @Test(priority = 1)
	  public void logout() 
	  {
		  Reporter.log("logout method",true);
	  }
	  
}
