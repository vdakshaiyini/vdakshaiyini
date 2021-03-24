package abcdacademy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String uname,String pwd,String text) throws IOException  
	{
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(uname);
		lp.getPassword().sendKeys(pwd);
		System.out.println(text);
		lp.getLogin().click();
		
		
	}
	
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		//driver.get("https://www.licindia.in/Home/Pay-Premium-Online");
	driver.get(prop.getProperty("url"));
	}
	
	@AfterTest
	public void closeDriver()
	
	{
		driver.close();
	}
   @DataProvider
   public Object getData()
   {
	   //row for how many different data types test should run
	   //column for how many values per each test
	   Object[][] data = new Object[2][3];
	   //0th row
	   data[0][0] = "vdakshayini@non restricted user";
	   data[0][1] = "password";
	   data[0][2] = "restricted user";
	   
	   //1st row
	   data[1][0] = "restricted@user";
	   data[1][1] = "pswd";
	   data[1][2] = "non restricted user";
	    
	   return data;
	   
	   
   }
}
