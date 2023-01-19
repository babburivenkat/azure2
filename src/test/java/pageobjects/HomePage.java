package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath="//a[normalize-space()='Sign Up']")
	WebElement lnksignup;
     @FindBy(xpath="//a[normalize-space()='Login']")
     WebElement lnklogin;
	// Action Methods
	public void clicksignup() {
		lnksignup.click();
	}
public void clicklogin() {
	lnklogin.click();
}
	
	
}
