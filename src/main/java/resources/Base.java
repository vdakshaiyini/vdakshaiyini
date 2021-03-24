package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	 public WebDriver  driver;
	 public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
	     prop =new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Mavenjava\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browserName");
		String url= prop.getProperty("url");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equals( "firefox")) {
			
		} else if(browserName.equals("IE")) {
			
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	 
}
