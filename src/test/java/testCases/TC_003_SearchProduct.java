package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchProduct;
import testBase.BaseClass;

public class TC_003_SearchProduct extends BaseClass {
	
	@Test(groups="Regression")
	public void verify_searchProduct() throws InterruptedException
	{

	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	hp.clicklogin(); //Login link under MyAccount
	//Login page
	LoginPage lp=new LoginPage(driver);
	logger.info("Entering valid email and password..");
	lp.setEmail(p.getProperty("email"));
	lp.setPassword(p.getProperty("password"));
	
	lp.clickLogin(); //Login button
	logger.info("clicked on ligin button..");
	
	SearchProduct sp=new SearchProduct(driver);
	sp.searchbox();//search box entered mac
	logger.info("**** search box entered mac  ****");
	sp.searchbutton();
	logger.info("****clicked on search button  ****");
	Thread.sleep(3000);
	String confirmsg = sp.getCnfMsg();
	Assert.assertEquals(confirmsg, "Search - mac", "Confirmation message mismatch");
	logger.info("**** Finished TC_003_SearchProduct ****");
		}
	
}
