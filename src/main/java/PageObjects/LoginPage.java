package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;

public class LoginPage extends BaseTest{
	
	@FindBy(xpath = "//input[@autocomplete='username']")
	WebElement username;

	@FindBy(xpath = "//input[@autocomplete='current-password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='sign-in-form__submit-button']")
	WebElement signIn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		
	
	username.sendKeys(prop.getProperty("username"));
	System.out.println("entered username");
	password.sendKeys(prop.getProperty("password"));
	System.out.println("entered password");
	signIn.click();
		
	}
}
	
