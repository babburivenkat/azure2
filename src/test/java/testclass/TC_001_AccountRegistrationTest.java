package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;
import testbase.BaseClass;


public class TC_001_AccountRegistrationTest extends BaseClass{
	@Test(groups= {"Regression","Master"})
	public void test_account_Registration() throws InterruptedException
	{
		logger.debug("application logs");
		logger.info("******* Starting TC_001_AccountRegistrationTest *******" );
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clicksignup();
		logger.info("clicked on signup");
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("providng customer details");
		regpage.setfirstname(randomeString().toUpperCase());
		
		regpage.setsurname(randomeString().toUpperCase());
		
		regpage.setepost(randomeString()+"@gmail.com");// randomly generated the email
		
		regpage.setmobile(randomeNumber());
		regpage.setusername(randomeString().toUpperCase());
		
		String password=randomAlphaNumeric();
		regpage.setpassword(password);
	    regpage.setconfirmpassword(password);
		regpage.clickbutton();
		logger.info("clicked on continue button");
		String confmsg=regpage.getConfirmationMsg();
		logger.info("validating info");
		Assert.assertEquals(confmsg, "Registration Successful");
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
			
		}
		
		logger.info("finished");
	}
	
	
}