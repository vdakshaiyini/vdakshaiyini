package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryPage {

	
	public WebDriver driver;
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/a[1]")
	WebElement username;
	
	public PageFactoryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getEmailId() {
	return username;	
	}
	
}
