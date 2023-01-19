package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
@FindBy(name= "FirstName")
WebElement txtfirstname;
@FindBy(name="Surname")
WebElement txtsurname;
@FindBy(name= "E_post")
WebElement txtepost;
@FindBy(name="Mobile")
WebElement txtmobile;
@FindBy(name="Username")
WebElement txtusername;
@FindBy(name= "Password")
WebElement txtpassword;
@FindBy(name="ConfirmPassword")
WebElement txtconfirmpassword;
@FindBy(xpath="//input[@id='submit']")
WebElement btnsubmit;

@FindBy(xpath="//label[normalize-space()='Registration Successful']")
WebElement msgconfirmation;
	public void setfirstname(String fname) {
		txtfirstname.sendKeys(fname);
	}
	public void setsurname(String surname) {
		txtsurname.sendKeys(surname);
	}
	public void setepost(String epost) {
		txtepost.sendKeys(epost);
	}
	public void setmobile(String mobile) {
		txtmobile.sendKeys(mobile);
		
	}
	public void setusername(String username) {
		txtusername.sendKeys(username);
	}
	public void setpassword(String password) {
		txtpassword.sendKeys(password);
	}
	public void setconfirmpassword(String confirmpassword) {
		txtconfirmpassword.sendKeys(confirmpassword);
	}
public void clickbutton() {
	btnsubmit.click();
}

	public String getConfirmationMsg() {
			try {
				return (msgconfirmation.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}

		}
}