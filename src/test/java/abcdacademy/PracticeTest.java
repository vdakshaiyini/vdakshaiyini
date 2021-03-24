package abcdacademy;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.PracticePage;
import resources.Base;

public class PracticeTest extends Base {

	@Test (priority=1)
	public void homePage() throws InterruptedException {
		// driver.get(prop.getProperty("url"));
		PracticePage pp = new PracticePage(driver);
		pp.getPractice().click();

	}

	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	/*@AfterTest
	public void closeDriver() {
		driver.close();
	}
/*
	@Test
	public void textBoxTest() throws InterruptedException {

		
		PracticePage pp = new PracticePage(driver);
		// lp.gettextBox().sendKeys(Keys.ENTER);

	Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(pp.gettextBox()).click()
		.keyDown(Keys.SHIFT)
		.sendKeys("test caps").doubleClick()
		.keyDown(Keys.SHIFT)
	     .keyDown(Keys.CONTROL).sendKeys("x")
	     .keyUp(Keys.CONTROL)
	     .build().perform();
		Thread.sleep(2000);
		   a.moveToElement(pp.gettextBox()).click()
	       .keyDown(Keys.CONTROL).sendKeys("v")
	       .keyUp(Keys.CONTROL)
	       .doubleClick()
	       .build().perform();
		Thread.sleep(2000);

	}
	*/
/*	@Test(priority=2)
	public void alertTest() throws InterruptedException
	{
		PracticePage pp = new PracticePage(driver);
		pp.getAlertTextBox().sendKeys("Alert Test");
		Thread.sleep(2000);
		pp.getAlertBox().click();
	//	System.out.println(pp.getAlertTextBox().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		pp.getCancelBox().click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
	}*/
	@Test(priority=2)
	public void radioBtn() throws InterruptedException {
		
		PracticePage pp = new PracticePage(driver);
		pp.getRadioBtn().click();
		
		//driver.switchTo().defaultContent();
	   Select s = new Select(pp.getSelect());
		s.selectByIndex(2);
		Thread.sleep(2000);
		List<WebElement> chList = pp.getChkBox();
        for(WebElement chl : chList) {
       
        	chl.click();
        }
        Thread.sleep(2000);
        
        	for(int j =0;j<chList.size();j++) {
        		Assert.assertTrue(chList.get(j).isSelected());
        		chList.get(j).click();
        		
        		
        	}
        	
        	pp.getTabs().click();
         Set<String> ids= driver.getWindowHandles();
         Iterator<String> handles = ids.iterator();
        
        	String pId = driver.getWindowHandle();
        	while(handles.hasNext()) {
        	String cId= handles.next();
        	String ccid =handles.next();
        Assert.assertTrue(!pId.equals(ccid));
    driver.switchTo().window(cId);
   
      
        	}
        	driver.switchTo().window(pId);
        	Actions a = new Actions(driver);
        	//scrolldown
        	a.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        	a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        	a.moveToElement(pp.getMouseHover()).click().build().
        	perform();
        	
        	/*JavascriptExecutor js = (JavascriptExecutor) driver;
        	js.executeScript("window.scrollBy(0.1000)");*/
        	
        	
        	//driver.findElement(By.xpath("//a[contains(text(),'Reload')]")).click();
        	//driver.findElement(By.linkText("Top")).click();
        
        }
	
	@Test(priority=3)
	public void frameTest()
	{
		PracticePage pp = new PracticePage(driver);
		
		driver.switchTo().frame(pp.frameIds());
		driver.findElement(By.linkText("VIEW ALL COURSES")).click();
		
	}
	}

