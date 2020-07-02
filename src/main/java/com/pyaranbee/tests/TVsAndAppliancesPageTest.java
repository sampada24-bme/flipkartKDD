package com.pyaranbee.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pyaranbee.pages.OnlyTVsAndAppliancesPage;
import com.testing.constant.Constant;
import com.testing.headerPage.testCases.OnlyWomenFirstTests;
import com.testing.keyword.Keyword;

@Test
public class TVsAndAppliancesPageTest extends OnlyTVsAndAppliancesPage {
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

	@Test(priority = 0)
	public void verify_popUp_Close() {
		OnlyTVsAndAppliancesPage tp = PageFactory.initElements(Constant.driver, OnlyTVsAndAppliancesPage.class);
		tp.closespopUp();
		log.info("Pop-Up close");

		tp.clickOnLogo();
		log.info("logo click done");

	}

	@Test(priority = 1)
	public void verify_TVsAndAppliances_Tab() throws InterruptedException {
		OnlyTVsAndAppliancesPage tp = PageFactory.initElements(Constant.driver, OnlyTVsAndAppliancesPage.class);
		tp.mouseHoverOnTVsAndAppliancesn();
		log.info("mouseHover on TVs & Appliances tab successfully");

		Assert.assertTrue(tp.isFullyAutomaticFrontLoad(), "washingmachine option is not visible");
		tp.clickonFullyAutomaticFrontLoad();
		log.info("Click on FullyAutomaticFrontLoad in washingmachine");

		explicitWait(10);

		/*
		 * tp.clickonFilter(); log.info("Filter is clicked");
		 * tp.selectByValue(dropdown,"25000"); log.info("Particular value selected");
		 * 
		 * }
		 */

	}
}
