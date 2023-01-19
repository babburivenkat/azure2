package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
@FindBy(name="Username")
WebElement txtusername;
@FindBy(name="Password")
WebElement txtpassword;
@FindBy(name="login")
WebElement btnlogin;

public void setusername(String username) {
	txtusername.sendKeys("username");
}

public void setpassword(String password) {
	txtpassword.sendKeys("password");
}

public void clicklogin(){
	btnlogin.click();
}

	
}