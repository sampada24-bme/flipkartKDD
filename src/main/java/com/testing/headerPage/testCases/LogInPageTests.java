package com.testing.headerPage.testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testing.constant.Constant;
import com.testing.headerPage.*;
import com.testing.keyword.Keyword;

public class LogInPageTests extends LogInPage {
	Logger log = Logger.getLogger(LogInPageTests.class);
     LogInPage hp;
	@BeforeTest
	public void setUp() {
		Keyword.openBrowser("chrome");
		Keyword.launchUrl("https://www.flipkart.com/");
		Keyword.maximize();
		log.info("URL launch successfully");
		hp=new LogInPage();
	}

	@Test(priority = 1)
	public void verify_PopUP_Close() {

		//LogInPage hp = PageFactory.initElements(Constant.driver, LogInPage.class);
		Assert.assertTrue(hp.popUpVisible(), "Pop-Up is not visible");
		hp.closespopUp();
		log.info("Pop-Up close");

	}

	@Test(priority = 2)
	public void verify_Logo() {
		//LogInPage hp = PageFactory.initElements(Constant.driver, LogInPage.class);
		Assert.assertTrue(hp.isLogoDisplay(), "Logo not available");
		hp.clickOnLogo();
		log.info("logo click done");
	}

	@Test(priority = 3)
	public void verify_successfull_LogIn() {
		//LogInPage hp = PageFactory.initElements(Constant.driver, LogInPage.class);
		hp.clickOnLogInButton();
		log.info("Log In Click");

		hp.clickOnEmailPhone();
		log.info("Entered email");

		hp.clcikOnPAssword();
		log.info("Entered password");

		Assert.assertTrue(hp.isLogInSubmitVisible(), "Log-In submit button is not there");
		hp.clickOnLogInSubmit();
		log.info("Click on log in submit");
		
	}

	@Test(priority = 4)
	public void verify_Search_product() {
		//LogInPage hp = PageFactory.initElements(Constant.driver, LogInPage.class);

		hp.enterProductToSearch("shoes");
		log.info("Product search successfully");
		Keyword.explicitWait(3);
		Assert.assertTrue(hp.isSearchButtonEnable(), "Search button not visible");
		hp.clickOnSearchButton();
		log.info("search button work fine");
	}

	@AfterTest
	public void tearDown() {
		closeBrowser();

	}

}
