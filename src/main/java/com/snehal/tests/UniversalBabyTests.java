package com.snehal.tests;


import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.snehal.pages.UniversalBabyPage;
import com.testing.constant.Constant;
import com.testing.keyword.Keyword;

public class UniversalBabyTests extends UniversalBabyPage {
	Logger log = Logger.getLogger(UniversalBabyTests.class);

	@BeforeMethod
	public void setup() {
		Keyword.openBrowser("chrome");
		Keyword.launchUrl("https://www.flipkart.com");
		Keyword.maximize();
		Keyword.implicitWait(4000);
		log.info("Successfully Open Flipkart Site....");
	}
	/*
	@Test(priority=0)
		public void tc_01_verify_login_popup_close() {

			UniversalBabyPage ub=PageFactory.initElements(Constant.driver, UniversalBabyPage.class);
			ub.popupClose();
			Assert.assertTrue(true, "Login Popup not close..");
			}

		@Test(priority=1)
		public void tc_02_verify_logo_is_Displayed() {
			UniversalBabyPage ub=PageFactory.initElements(Constant.driver, UniversalBabyPage.class);
			ub.popupClose();
			ub.mouseHoverOnly("BabyandKids");
			log.info("Mouse hover on Baby and kids");
			ub.mouseHoverClick("Ethnicwear");
			Assert.assertTrue(ub.isLogoDisplayed(), "Logo is not display..");
			log.info("Flipkart Logo is Displayed..");
		}
		
		@Test(priority=2)
		public void tc_03_verify_babyandkids_tab_present_in_homepage() {
			UniversalBabyPage ub=PageFactory.initElements(Constant.driver, UniversalBabyPage.class);
			ub.popupClose();
			Assert.assertTrue(ub.BabyandKids.isDisplayed(), "Baby & Kids tab not present on homepage");
		}
		
	@Test(priority=3)
	public void tc_04_verify_previous_Filter_is_Displayed() {
		UniversalBabyPage ub=PageFactory.initElements(Constant.driver, UniversalBabyPage.class);
		ub.popupClose();
		ub.mouseHoverOnly("BabyandKids");
		log.info("Mouse hover on Baby and kids");
	ub.explicitWait(2000);
		ub.mouseHoverClick("Ethnicwear");
		//ub.explicitWait(000);
		Assert.assertTrue(ub.isFilterDisplayed(), "Previous filter is not selected");
	}
	*/
	@Test
	public void tc_04_verify_product_images_display_when_clickon_Ethnicwear() {
		UniversalBabyPage ub=PageFactory.initElements(Constant.driver, UniversalBabyPage.class);
		ub.popupClose();
		ub.mouseHoverOnly("BabyandKids");
		log.info("Mouse hover on Baby&Kids");
		ub.explicitWait(3000);
		ub.mouseHoverClick("Ethnicwear");
		//ub.explicitWait(4000);
		//boolean img =ub.getImageList();
		Assert.assertTrue(ub.productImageDisplayed());
	}
	
	
	/*
	@Test
		public void tc_05_verify_product_images_display_when_clickon_Ethnicwear() {
			UniversalBabyPage ub=PageFactory.initElements(Constant.driver, UniversalBabyPage.class);
			ub.popupClose();
			//ub.explicitWait(2000);
			ub.mouseHoverOnly("BabyandKids");
			log.info("Mouse hover on Baby&Kids");
			ub.explicitWait(2000);
			ub.mouseHoverClick("Ethnicwear");
		//	ub.explicitWait(2000);
			boolean img =isProductImageDisplayed();
			Assert.assertTrue(img);
		}*/


		/*@AfterMethod
		public void tearDown() {
			Keyword.closeBrowser();
		}*/
}

