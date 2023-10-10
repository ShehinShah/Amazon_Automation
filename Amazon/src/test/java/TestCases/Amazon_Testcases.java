package TestCases;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomaionCore.Base_Class;

public class Amazon_Testcases extends  Base_Class{

	public WebDriver driver;
	@BeforeMethod
	public void intialization() throws Exception

	{
		driver=browserInstialization("chrome");
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void tc01()
	{
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.quit();
		//driver.close();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click(); //to locate a web element and click
		driver.findElement(By.name("email")).sendKeys("7356822651");
		driver.findElement(By.className("a-button-input")).click();
		//driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
	
		
	}
}
