package com.nutan.tests;

import javax.swing.Popup;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nutan.pages.ElectronicPage;
import com.testing.constant.Constant;
import com.testing.keyword.Keyword;





public class ElectronicPageTests extends ElectronicPage {
	Logger log = Logger.getLogger(ElectronicPageTests.class);

	@BeforeTest
	public void setUp() {
		Keyword.openBrowser("chrome");
		log.info("Browser launch");
		Keyword.maximize();
		Keyword.launchUrl("http://www.flipkart.com");
		log.info("URL  launch successfully");
		Keyword.deleteAllCookies();

	}

	@Test(priority = 1)
	public void verify_PopUp_Close() {
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		ep.clickonPopUp();
		log.info("Pop-up close");

	}

	@Test(priority = 2)
	public void verify_Electronics_Tab() {
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		ep.clickonElectronic();
		log.info("click on Electronic tab successfully");
	}

	@Test(priority = 3)
	public void select_Mobile_Phone() {
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.implicitWait(3);
		ep.clickonVivo();
		log.info("click on mobile successfully");
		// ep.clickonmin();
		// log.info("Click on minimum value");
		// ep.clickonmax();
		// log.info("click on maximum value successfully");
	}

	@Test(priority = 4)
	public void verify_Sort_By_Price() {
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.implicitWait(4);
		ep.clicksonortBy();
		log.info("Sort by price done");
	}

	@Test(priority = 5)
	public void verify_Flipkart_Assured() {
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		ep.clickonAssured();
		log.info("click sucessfully");

	//}

	//@Test(priority = 6)
	//public void verify_To_Cheque_Flipkart_Assured() {
		//ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
	//	Keyword.implicitWait(3);
		//ep.Tocheckque();
	//	log.info("Check successfully");

	}

	@Test(priority = 7)
	public void verify_RAM_Selected() {
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		ep.clickonRAM();
		log.info("RAM Selected");
	}

	@Test(priority = 8)
	public void verify_Customer_Rating() {
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		log.info("ScrollDown Properly");
		ep.clickoncustomerrate();
		log.info("Customer rating selected");

	}
	@Test(priority = 9)
	public void verify_InternalStorage_Mobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnInternalStorage();
		log.info("Click on InternalStorage Successfully");
		ep.clickOnIntStrCheckBox();
		log.info("checkBox successfully clicked");
	}
	@Test(priority = 10)
	public void Verify_BatteryCapacity_Mobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnBatteryCapa();
		log.info("click on BatteryCapa Successfully");
		ep.clickOnBatteryBox();
	}
	@Test(priority = 11)
	public void Verify_NetworkType_OfMobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnNetworkType();
		log.info("suceessfully click on NetworkType");
		ep.clickOnNetworkBox();
		log.info("Sucessfully NetworkTye Box");
	}
	@Test(priority = 12)
	public void Verify_Screen_Size_OfMobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnScreenSize();
		log.info("sucessfully click on ScreenSize");
		ep.clickOnScreenSizeBox();
		log.info("select ScreenSizeCheckBox successfully");
	}
	@Test(priority = 13)
	public void Verify_SimType_OfMobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnSimType();
		log.info("successfully click on SimTpe");
		ep.clickOnSimTypeBox();
		log.info("successfully select SimTypeCheckBox");
	}
	@Test(priority = 14)
	public void Verify_PrimaryCamera_OfMobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnPrimaryCam();
		log.info("sucessfully click on PrimaryCamera");
		ep.clickOnPrimaryCamBox();
		log.info("select PrimaryCamera sucessfully");
	}
	@Test(priority = 15)
	public void Verify_SecondaryCamera_OfMobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnSecondaryCam();
		log.info("successfully click on SecondaryCamera");
		ep.clickOnSecondaryCamBox();
		log.info("SecondaryCamera is selected successfully");
	}
	
	@Test(priority = 16)
	public void Verify_Offers_OfMobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnOffers();
		log.info("successfully click on Offers");
		ep.clickOnOffersCheckBox();
		log.info("OffersCheckBox select Successfully");
	}
	
	@Test(priority = 17)
	public void Verify__ResolutionType_OfMobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnResolutionType();
		log.info("successfully  click on ResolutionType");
	    ep.clickOnResolutionTypeBox();
	    log.info("successfully select ResolutionTypeBox");
	}
	@Test(priority = 18)
	public void Verify__Type_OfMobile(){
		ElectronicPage ep = PageFactory.initElements(Constant.driver, ElectronicPage.class);
		Keyword.scrollDown();
		ep.clickOnType();
		log.info("sucessfully click on Type");
		ep.clickTypeBox();
		log.info("successfully select TypeBox");
	}
	
	
	
	//@AfterTest
//	public void tearDown() {
	//	Keyword.closeBrowser();
}


