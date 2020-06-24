package com.testing.headerPage.testCases;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testing.constant.Constant;
import com.testing.headerPage.OnlyWomenPage;
import com.testing.keyword.Keyword;

@Test
public class OnlyWomenFirstTests extends OnlyWomenPage {

	Logger log = Logger.getLogger(OnlyWomenFirstTests.class);

	@BeforeTest
	public void setUp() {
		openBrowser("chrome");
		log.info("Browser open");
		launchUrl("https://www.flipkart.com/");
		log.info("URL launch done");
		Keyword.maximize();
		log.info("Window maximize");
		Keyword.deleteAllCookies();
	}

	@Test(priority = 1)
	public void verify_women_test() {
		OnlyWomenPage om = PageFactory.initElements(Constant.driver, OnlyWomenPage.class);

		om.closespopUp();
		log.info("Pop-up close");

		om.mouseHoverOnWomen();
		log.info("women tab selected");

		om.clickSarees();

		om.explicitWait(10);

		om.clickFilter();
		om.selectByValue(filter, "1000");
		om.selectByIndex(filter, 3);

		
	}

	@Test(enabled = false)
	public void verify_Logo_Redirect_To_Homepage() {
		OnlyWomenPage om = PageFactory.initElements(Constant.driver, OnlyWomenPage.class);
		om.clickOnLogo();
		log.info("Logo click");
		Assert.assertTrue(om.isLogoDisplay(), "Logo not visible");
	}

	// @AfterTest
	// public static void tearDown() {
	// Keyword.closeBrowser();
	// }

}
