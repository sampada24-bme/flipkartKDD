package sucheta.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testing.constant.Constant;
import com.testing.keyword.Keyword;

import sucheta.pages.MenPages;
public class MenTests extends MenPages{
	Logger log = Logger.getLogger(MenTests.class);

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
		MenPages mp = PageFactory.initElements(Constant.driver,MenPages.class);
		mp.closespopUp();
		log.info("Pop-Up close");

		mp.clickOnLogo();
		log.info("logo click done");

	}


}
