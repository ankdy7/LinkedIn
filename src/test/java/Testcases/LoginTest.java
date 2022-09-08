package Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.LoginPage;

public class LoginTest extends BaseTest {
	
	LoginPage loginpage;

	public LoginTest(){
		super();
	}
	
	

	@BeforeTest
	public void beforeTest() {
		setupDriver();
		loginpage = new LoginPage();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void loginCheck() {
		loginpage.login();
	}
}
