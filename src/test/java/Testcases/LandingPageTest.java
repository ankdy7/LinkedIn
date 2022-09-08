package Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.LandingPage;
import PageObjects.LoginPage;

public class LandingPageTest extends BaseTest {
	LoginPage loginpage;
	LandingPage landingpage;

	public LandingPageTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
		setupDriver();
		loginpage = new LoginPage();
		loginpage.login();
		landingpage = new LandingPage();


	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}

	@Test(priority = 0)
	public void searchTest() throws InterruptedException {

		landingpage.search();
		landingpage.clickDropdown();
	}
	
	
}
