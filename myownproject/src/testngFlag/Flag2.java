package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test
  public void a() 
  {
	  Reporter.log("i am from a",true);
  }
  @Test
  public void b() 
  {
	  Reporter.log("i am from b",true);
  }
  @Test
  public void c() 
  {
	  Reporter.log("i am from c",true);
  }
  @Test
  public void d() 
  {
	  Reporter.log("i am from d",true);
  }
  @Test
  public void e() 
  {
	  Reporter.log("i am from e",true);
  }
  @Test
  public void f() 
  {
	  Reporter.log("i am from f",true);
  }
  @Test
  public void g() 
  {
	  Reporter.log("i am from g",true);
  }
}
