package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpicejetPage {

	
	WebDriver driver;
	
	By dropwDown = By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']");
	By dvalue = By.cssSelector("a[text='Hyderabad (HYD)']");
	By secondDD = By.xpath("//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[1]/li[7]/a[1]");
	//By fromDate = By.xpath("//a[@xpath=\"1\"]");
	
	By fromDate = By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/a[1]");
	
	public SpicejetPage(WebDriver driver)
	{
		 this.driver = driver;
	}
	
	
	public WebElement getDropdown()
	{
		return driver.findElement(dropwDown);
	}
	
	public WebElement getDropdownValue()
	{
		return driver.findElement(dvalue);
	}
	public WebElement getsecondDD()
	{
		return driver.findElement(secondDD);
	}
	public WebElement getFromDate()
	{
		return driver.findElement(fromDate);
	}
}
