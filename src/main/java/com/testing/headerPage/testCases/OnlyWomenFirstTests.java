package com.testing.headerPage.testCases;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
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

	public static final int expectedPrice =1000;
	Logger log = Logger.getLogger(OnlyWomenFirstTests.class);
	OnlyWomenPage om;
	
	@BeforeTest
	public void setUp() {
		openBrowser("chrome");
		log.info("Browser open");
		launchUrl("https://www.flipkart.com/");
		refresh();
		log.info("URL launch done");
		Keyword.maximize();
		refresh();
		log.info("Window maximize");
		Keyword.implicitWait(5);
		Keyword.deleteAllCookies();
		om=new OnlyWomenPage();
	}
	
	@Test(priority=1, groups="regression")
	public void verify_Women_Saree_Selected() {
	om.closespopUp();
	log.info("Pop-up close");
	om.mouseHoverOnWomen();
	log.info("women tab selected");
	Assert.assertTrue(om.isSareeVisible(),"Saree option is not visible");
	om.clickSarees();
	log.info("Click on sarees in ethnic wear"); 

	}
	@Test(priority=2,groups="regression")
	public void verify_Flipkart_Assured_CheckBox() {
		Assert.assertTrue(om.isCheckBoxEnable(),"Checkbox not enable");
		om.clickOnCkeckbox();
		
		log.info("Checkbox is selected");
		om.takeScreenShot_Of_FailTest_Case("verify_Flipkart_Assured_CheckBox");
	}
	
//	@Test(priority=3,groups="regression")
//	public void verify_Logo_Redirect_To_Homepage() {
//		Assert.assertTrue(om.isLogoDisplay(), "Logo not visible");
//		om.clickOnLogo();
//		log.info("Logo click");
//	}

//	@Test(priority = 4,groups="regression")
//	public void verify_women_Filter_test()  {
//		om.closespopUp();
//		log.info("Pop-up close");
//		om.mouseHoverOnWomen();
//		log.info("women tab selected");
//		Assert.assertTrue(om.isSareeVisible(),"Saree option is not visible");
//		om.clickSarees();
//		log.info("Click on sarees in ethnic wear");
//		explicitWait(10);
//		om.clickOnFilter();
//		log.info("Filter is clicked");
//		om.selectByValue(dropdown, "1000");
//		explicitWait(30);
//		log.info("Particcular value selected");
//		//om.selectByIndex(filter, 3);
//		
//		List<WebElement> prices=driver.findElements(By.cssSelector("._1vC4OE"));
//		//Iterator <WebElement>itr=prices.iterator();
//		for(int i=0;i<prices.size();i++){
//			try{
//			System.out.println(prices.get(i).getText());
//			String price=prices.get(i).getText().replace("₹","0");
//			int p=Integer.valueOf(price);
//			//System.out.println(price);
//			Assert.assertTrue(p<expectedPrice,p+" is grater than 1000");
//			}catch(StaleElementReferenceException ex){
//				driver.navigate().refresh();
//				//Thread.sleep(5000);
//				//System.out.println(itr.next().getText());
//			}
//		}
//	}
	
	
	
	

//	 @AfterTest
//	 public static void tearDown() {
//	 Keyword.closeBrowser();
//	 }

}
