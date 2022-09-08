package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;

public class LandingPage extends BaseTest {

	//WebDriverWait wait;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchBox;
	
	@FindBy(xpath = "//li-icon[@type='chevron-down']")
	WebElement messageDropdown;
	
	
	
	public LandingPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void search() throws InterruptedException {
	
		Thread.sleep(5000);
		searchBox.sendKeys(prop.getProperty("searchKeyword"));
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public void clickDropdown() {
		messageDropdown.click();
	}
	
	
	
	
	
}
