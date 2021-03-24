package abcdacademy;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.SpicejetPage;
import resources.Base;

public class SpicejetTest extends Base {

	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

	}
	
	@Test
	public void dynamicDD() throws InterruptedException
	{
		
		SpicejetPage sjet = new SpicejetPage(driver);
		sjet.getDropdown().click();
		Thread.sleep(2000);
		sjet.getDropdownValue().click();
		sjet.getsecondDD().click();
		sjet.getFromDate().click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		driver.findElement(By.xpath("//body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[2]/a[1]")).click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		 
		//adult,child,infant xpaths
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByIndex(4);
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		s1.selectByValue("2");
		Select s2 = new Select (driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']")));
		s2.selectByVisibleText("3");
		
		Select s3 = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s3.selectByIndex(3);
		WebElement chbx = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']"));
		
			if(chbx.isSelected()==false) {
				chbx.click();
			}
		
		/*
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> handles = winids.iterator();
	//	while(handles.hasNext()) 
			String pid = handles.next();
		String cid = handles.next();
		
 		driver.findElement(By.xpath("//body/form[@id='aspnetForm']/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[12]/span[1]/a[1]")).click();
 		
 		//body/form[@id='aspnetForm']/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[12]/span[1]/a[1]
 		driver.switchTo().alert().dismiss();
 		/*driver.switchTo().window(cid);
 		Thread.sleep(2000);
 		driver.close();*/
 		
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();*/
	}
	
}
