package com.testing.headerPage.testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testing.constant.Constant;
import com.testing.headerPage.SignInPage;
import com.testing.keyword.Keyword;
@Test
public class SignInTests extends SignInPage {
Logger log=Logger.getLogger(SignInTests.class);

@BeforeTest
public void setUp() 
{	
	Keyword.openBrowser("chrome");
	log.info("Browser open");
	Keyword.launchUrl("https://www.flipkart.com/");
	log.info("URL launch done");
	Keyword.implicitWait(3);
	Keyword.maximize();
	log.info("Window maximize");
	Keyword.deleteAllCookies();
}
	@Test(priority=1)
	public void Verify_SignIn_Test(){
	SignInPage sp=PageFactory.initElements(Constant.driver,SignInPage.class);
	
	sp.closePopUp();
	log.info("Pop-up closed");
	
	sp.clickOnLogIn();
	log.info("LogIn click");;
	
	sp.clickSignIn();
	log.info("click on sigIn");
	
	sp.ClickMobNo();
	log.info("Enter Mob no");
	
	explicitWait(3);
	
	sp.clickOnCOntinue();
	log.info("click on continue");
	
	sp.enterOTP();
	log.info("OTP enter successfully");
	
	sp.enterPAssword();
	log.info("Password entered");
	
	sp.clickonSignInButton();
	log.info("Sign In Button clicked");

	Assert.assertTrue(sp.isErrorMsgDisplay(),"Not display  Error msg ");
	log.info("Error msg displayed");
	
	}
	@Test(priority=2)
	public void changeMobileNo() {
		SignInPage sp=PageFactory.initElements(Constant.driver,SignInPage.class);
		Assert.assertTrue(sp.isChangeDisplay(),"Not diplay any cange mob no option");
		
		sp.changeMobileNO();
		log.info("Mobile number change successfully");
		
		sp.clickNewMobNo();
		log.info("Mobile no enter successfully");
		
		sp.clickOnCOntinue();
		log.info("CLick on continue");
		
	}
	
	
	
	
	
	
	
	
}
