package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(invocationCount = 100)
  public void verifyLoginButtonEnableDisableStatus() 
  {
	  Reporter.log("disabled...",true);
  }
}
