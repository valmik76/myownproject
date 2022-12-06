package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckReport1 {
  @Test
  public void checkReport1() 
  {
	  Reporter.log("check report" ,true);
  }
}
