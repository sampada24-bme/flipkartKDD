package com.testing.headerPage.testCases;

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

	@BeforeTest
	public void setUp() {
		openBrowser("chrome");
		log.info("Browser open");
		launchUrl("https://www.flipkart.com/");
		log.info("URL launch done");
		Keyword.maximize();
		log.info("Window maximize");
		Keyword.implicitWait(5);
		Keyword.deleteAllCookies();
	}

	@Test(priority = 1,groups="regression")
	public void verify_women_test() throws InterruptedException {
		OnlyWomenPage om = PageFactory.initElements(Constant.driver, OnlyWomenPage.class);

		om.closespopUp();
		log.info("Pop-up close");

		om.mouseHoverOnWomen();
		log.info("women tab selected");
		
		Assert.assertTrue(om.isSareeVisible(),"Saree option is not visible");
		om.clickSarees();
		log.info("Click on sarees in ethnic wear");

		explicitWait(10);

		om.clickOnFilter();
		log.info("Filter is clicked");
		om.selectByValue(dropdown, "1000");
		Thread.sleep(3000);
		log.info("Particcular value selected");
		//om.selectByIndex(filter, 3);
		
		List<WebElement> prices=driver.findElements(By.cssSelector("._1vC4OE"));
		//Iterator <WebElement>itr=prices.iterator();
		for(int i=0;i<prices.size();i++){
			try{
			System.out.println(prices.get(i).getText());
			String price=prices.get(i).getText().replace("₹","0");
			int p=Integer.valueOf(price);
			//System.out.println(price);
			Assert.assertTrue(p<expectedPrice,p+" is grater than 1000");
			}catch(StaleElementReferenceException ex){
				driver.navigate().refresh();
				//Thread.sleep(5000);
				//System.out.println(itr.next().getText());
			}
		}
	}

//	@Test(priority=2,groups="regression")
//	public void verify_Logo_Redirect_To_Homepage() {
//		OnlyWomenPage om = PageFactory.initElements(Constant.driver, OnlyWomenPage.class);
//		om.clickOnLogo();
//		log.info("Logo click");
//		Assert.assertTrue(om.isLogoDisplay(), "Logo not visible");
//	}

//	 @AfterTest
//	 public static void tearDown() {
//	 Keyword.closeBrowser();
//	 }

}
