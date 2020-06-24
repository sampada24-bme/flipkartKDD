package com.testing.headerPage.testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testing.constant.Constant;
import com.testing.headerPage.AfterLogInPage;
import com.testing.keyword.Keyword;

public class AfterLogInTests extends AfterLogInPage {

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

	@Test
	public void verify_Click_on_Curties() {
		AfterLogInPage ap = PageFactory.initElements(Constant.driver, AfterLogInPage.class);
		ap.closespopUp();
		ap.mouseHoverOnWomen();
		Assert.assertTrue(ap.kurtiesVisible(), "Kurties option not available");
		ap.clickOnKurtasKurtis();
		log.info("Kurtis selected");

	}

}
