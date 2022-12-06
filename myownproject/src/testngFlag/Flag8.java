package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;
 
public class Flag8 {
  @Test(groups = "Functional")
  public void ft1() 
  {
	  Reporter.log("functional test case 1 executed",true);
  }
  @Test(groups = "Integration")
  public void it1() 
  {
	  Reporter.log("integration test case 1 executed",true);
  } 
  @Test(groups = "Smoke")
  public void st1() 
  {
	  Reporter.log("smoke test case 1 executed",true);
  }
  //----------------------------------------------------------
  
  @Test(groups = "Functional")
  public void ft2() 
  {
	  Reporter.log("functional test case 2 executed",true);
  }
  @Test(groups = "Integration")
  public void it2() 
  {
	  Reporter.log("integration test case 2 executed",true);
  } 
  @Test(groups = "Smoke")
  public void st2() 
  {
	  Reporter.log("smoke test case 2 executed",true);
  }
  //-----------------------------------------------------------
  
  @Test(groups = "Functional")
  public void ft3() 
  {
	  Reporter.log("functional test case 3 executed",true);
  }
  @Test(groups = "Integration")
  public void it3() 
  {
	  Reporter.log("integration test case 3 executed",true);
  } 
  @Test(groups = "Smoke")
  public void st3() 
  {
	  Reporter.log("smoke test case 3 executed",true);
  }
}
