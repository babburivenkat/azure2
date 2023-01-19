package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;




import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import testbase.BaseClass;


public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"Sanity","Master"})
	public void test_Login()
	{
		logger.info("Starting TC_002_LoginTest");
		
		try
		{				
			HomePage hp=new HomePage(driver);
			hp.clicklogin();	
			LoginPage lp=new LoginPage(driver);
	     	lp.setusername(rb.getString("username"));
			lp.setpassword(rb.getString("password"));
			lp.clicklogin();
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetpage=macc.ismypageexist();		
			Assert.assertEquals(targetpage, true);
			
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" Finished TC_002_LoginTest");
		
	}
	
	
}
