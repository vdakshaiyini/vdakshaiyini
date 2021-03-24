package abcdacademy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateTitle extends Base{
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	
	@AfterTest
	public void closeDriver()
	
	{
		driver.close();
	}
	
	@Test
	public void basePageNavigation() throws IOException  
	{
		
		
		driver.manage().window().maximize();
		LandingPage l = new LandingPage(driver);
	  Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	  log.info("successfully validated text message");
	}
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("driver is initialized");
		//driver.get("https://www.licindia.in/Home/Pay-Premium-Online");
	driver.get(prop.getProperty("url"));
	log.info("navigated to home page");
	}
  }
