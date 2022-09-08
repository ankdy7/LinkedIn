package PageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;

public class SearchPage extends BaseTest {

	List<WebElement> connectButtons;

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='See all people results']")
	WebElement allResults;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//span[text()='Send']")
	WebElement sendButton;
	
	@FindBy(xpath = "(//li[@class='artdeco-pagination__indicator artdeco-pagination__indicator--number ember-view'])[8]")
	WebElement threeDots;
	
	

	public void clickConnect() throws InterruptedException {
		
		Thread.sleep(5000);
		allResults.click();
		Thread.sleep(5000);
		/*Actions act = new Actions(driver);
		System.out.println(threeDots.isDisplayed());
		System.out.println(threeDots.isEnabled());
		
		act.moveToElement(threeDots).build().perform();
		//threeDots.click();
		Thread.sleep(5000);*/
		/*connectButtons = driver.findElements(By.xpath("//span[text()='Connect']"));
		Iterator<WebElement> it = connectButtons.iterator();
		while (it.hasNext()) {
			driver.findElement(By.xpath(it.next().toString())).click();
			System.out.println("click connect");
		}
		*/
		
		for(int i=1;i<=10;i++) {
			if(driver.findElement(By.xpath("(//span[text()='Connect'])["+i+"]")).isDisplayed()==true) {
				driver.findElement(By.xpath("(//span[text()='Connect'])["+i+"]")).click();
			}
			else
				continue;
			Thread.sleep(2000);
			sendButton.click();
		}
		

		nextButton.click();

	}

}
