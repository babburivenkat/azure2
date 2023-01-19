package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;




import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import testbase.BaseClass;
import utilites.DataProviders;


public class TC_003_LoginDataDrivenTest extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_LoginDDT(String email, String pwd, String exp) {
		logger.info(" Starting TC_003_LoginDataDrivenTest ");

		try {
			HomePage hp = new HomePage(driver);
			hp.clicklogin();
			

			LoginPage lp = new LoginPage(driver);
			lp.setusername(email);
			lp.setpassword(pwd);
			lp.clicklogin();
			
			
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetpage = macc.ismypageexist();// this method is created MyAccountPage
Thread.sleep(2000);
			if (exp.equals("Valid")) {
				if (targetpage == true) {
					macc.clicklogout();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equals("Invalid")) {
				if (targetpage == true) {
					MyAccountPage myaccpage = new MyAccountPage(driver);
					myaccpage.clicklogout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished TC_003_LoginDataDrivenTest");

	}

}