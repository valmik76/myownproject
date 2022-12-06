package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckReport3 {
  @Test
  public void checkReport3() 
  {
	  Reporter.log("valmik", true);
  }
}
