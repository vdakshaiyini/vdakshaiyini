
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
   public WebDriver driver;
   By signin= By.cssSelector("a[href*='sign_in']");
   By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
 //header/div[2]/div[1]/nav[1]/ul[1] 
   By navigationBar = By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]");
   
   public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	   this.driver=driver;
}


public WebElement getLogin() {
	   return driver.findElement(signin);
	   
   }
   
public WebElement getTitle() {
	   return driver.findElement(title);
	   
}
public WebElement getNavigationbar() {
	   return driver.findElement(navigationBar);
	   
}
}
