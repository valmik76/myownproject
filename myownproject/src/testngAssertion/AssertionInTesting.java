package testngAssertion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTesting {
  @Test
  public void testCase() 
  {
	  Reporter.log("launch the browser",true);
	  Reporter.log("enter the url",true);
	  Reporter.log("verify login page title",true);
	  //Assert.assertEquals(true, false);//hard assert
	  SoftAssert softassert = new SoftAssert();//soft assert
	  softassert.assertEquals(true, false);
	  Reporter.log("enter username",true);
	  Reporter.log("enter password",true);
	  Reporter.log("click on login button",true);
	  Reporter.log("verify home page title",true);
	  Reporter.log("create user",true);
	  Reporter.log("create report",true);
	  
  }
}
