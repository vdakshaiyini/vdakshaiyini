package abcdacademy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateNavigationBar extends Base{
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		//driver.get("https://www.licindia.in/Home/Pay-Premium-Online");
	driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws IOException  
	{
		
		
		driver.manage().window().maximize();
		LandingPage l = new LandingPage(driver);
	  Assert.assertTrue(l.getNavigationbar().isDisplayed());	
	  //Assert.assertFalse(false);
	}
	
	@AfterTest
	public void closeDriver()
	
	{
		driver.close();
	}
}
