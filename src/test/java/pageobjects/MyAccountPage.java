package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Dashboard']")
	WebElement msgheading;
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement lnklogout;
	
	public boolean ismypageexist() {
		try {
		return (msgheading.isDisplayed());
	}catch(Exception e) {
		return (false);
	}
	}
	
	public void clicklogout(){
		lnklogout.click();
	}
	
	
}


	