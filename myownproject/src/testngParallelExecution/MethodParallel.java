package testngParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodParallel {
  @Test
  public void method1()
  {
	  Reporter.log("i am from method 1 : "+Thread.currentThread().getId()+"",true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("i am from method 2 : "+Thread.currentThread().getId()+"",true);
  }
}
