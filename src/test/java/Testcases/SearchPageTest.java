package Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import PageObjects.SearchPage;

public class SearchPageTest extends BaseTest{
	LoginPage loginpage;
	LandingPage landingpage;
	SearchPage searchpage;

	public SearchPageTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		setupDriver();
		loginpage = new LoginPage();
		loginpage.login();
		landingpage = new LandingPage();
		landingpage.search();
		landingpage.clickDropdown();

	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void connectTest() throws InterruptedException {
		searchpage = new SearchPage();
		searchpage.clickConnect();
	}
}
