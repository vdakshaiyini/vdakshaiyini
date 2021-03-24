package abcdacademy;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.PageFactoryPage;
import resources.Base;

public class PageFactoryTest extends Base {
	
	@BeforeTest
	public void init() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void factoryTest()
	{
		PageFactoryPage pf = new PageFactoryPage(driver);
		pf.getEmailId().sendKeys("test");
	}
}
