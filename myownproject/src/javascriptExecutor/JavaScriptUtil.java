package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
	public static void flash(WebElement element , WebDriver driver) 
	{
		String bgcolour = element.getCssValue("background-color");//green
		
		for (int i = 0; i < 500; i++) 
		{
			changeColour("#000000",element,driver);//1
			changeColour(bgcolour,element,driver);//2
		}
	}
	
	public static void changeColour(String colour,WebElement element , WebDriver driver) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor= '"+colour+"'",element);
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}
	
	public static void drawBorder(WebElement element , WebDriver driver) 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}

	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void clickElementByJS(WebElement element , WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void generateAlert(WebDriver driver , String message)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('" +message+ "')");
	}
	
	
	public static void refreshPage(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	public static void scrollIntoview(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
