package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description ="this method helps to login to the actitime")
  public void loginToActime() 
  {
	  Reporter.log("login to actitime",true);
  }
  @Test(description ="this method helps to logout to the actitime")
  public void logoutToActime() 
  {
	  Reporter.log("logout to actitime",true);
  }

}
