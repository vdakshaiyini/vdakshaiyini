package pageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
	WebDriver driver;

	By practice = By.xpath("//a[contains(text(),'Practice')]");
	By textBox = By.xpath("//input[@id='autocomplete']");
	By alertBox = By.xpath("//input[@id='name']");
	By alertBtn = By.xpath("//input[@id='alertbtn']");
	By cancelBtn = By.xpath("//input[@id='confirmbtn']");
	By radioBtn = By.xpath("//body/div[1]/div[1]/fieldset[1]/label[3]");
	By selectBox = By.xpath("//select[@id='dropdown-class-example']");
	By checkBox = By.xpath("//input[@type='checkbox']");
	By newTab = By.xpath("//a[@id='opentab']");
	By newWin = By.xpath("//button[@id='openwindow']");
	By mouseHover = By.xpath("//button[@id='mousehover']");
	By frame = By.tagName("iframe-name");

	public PracticePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement frameIds() {
		return driver.findElement(frame);
	}

	public WebElement getMouseHover() {
		return driver.findElement(mouseHover);
	}

	public WebElement getWins() {
		return driver.findElement(newWin);
	}

	public WebElement getTabs() {
		return driver.findElement(newTab);
	}

	public List<WebElement> getChkBox() {
		return driver.findElements(checkBox);
	}

	public WebElement getSelect() {
		return driver.findElement(selectBox);
	}

	public WebElement gettextBox() {
		return driver.findElement(textBox);
	}

	public WebElement getRadioBtn() {
		return driver.findElement(radioBtn);
	}

	public WebElement getPractice() {
		return driver.findElement(practice);
	}

	public WebElement getAlertTextBox() {
		return driver.findElement(alertBox);
	}

	public WebElement getAlertBox() {
		return driver.findElement(alertBtn);
	}

	public WebElement getCancelBox() {

		return driver.findElement(cancelBtn);
	}

}
