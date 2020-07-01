package com.snehal.pages;


import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.testing.keyword.Keyword;

public class UniversalBabyPage extends Keyword{
	Logger log=Logger.getLogger(UniversalBabyPage.class);
	@FindBy(css = "img[alt='Flipkart']")
	private WebElement flipkartLogo;
	@FindBy(xpath="//img[@src='https://rukminim1.flixcart.com/image/610/732/jumzc7k0/kids-ethnic-set/m/w/t/13-14-years-7022-black-aj-dezines-original-imafd9cuhmw5yqfc.jpeg?q=50']")
	//@FindBy(xpath="//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div[1]/div/img")
	public WebElement productImage;
	//@FindBy(xpath="//div[@class='_3ZJShS _31bMyl']/img")
	//public WebElement productImages;
	@FindBy(how = How.CSS, using = "input[name='q']")
	private WebElement searchComponent;
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement popUp;
	//@FindBy(xpath="//div[contains(text(),'Baby Boys & Baby Girls')]")
	
	@FindBy(xpath="//div[@class='_2xEnNW']")
	public WebElement prevFilter;
	
	@FindBy(xpath="//span[contains(text(),'Baby & Kids')]")
	public WebElement BabyandKids;
	//@FindBy(xpath="//a[contains(text(),'Ethnic Wear')]")
	@FindBy(xpath="//li[4]/a[contains(text(),'Ethnic Wear')]")
	public WebElement Ethnicwear;
	@FindBy(xpath="/html/body/div/div/div[2]/div/ul/li[5]/ul/li/ul/li/ul/li[4]/a[@title='Ethnic Wear']")
  private WebElement Ethnicwearnew;
	//@FindBy(xpath="//a[contains(text(),'Polos & T-Shirts')]")
		//public WebElement PoloandTshirts;
		//private WebElement x;
	@FindBy(xpath="//img[@class='_3togXc']")
	public List<WebElement> Listimg;

		public void clickOnLogo() {
			flipkartLogo.click();
		}
	     public void clickOnBabyandds() {
			BabyandKids.click();
		}
	     public void clickOnEthnicwear() {
			Ethnicwearnew.click();

		}
	     //For how many images display on page
	     public boolean getImageList() {
	    	// Keyword.explicitWait(2000);
	    	 System.out.println("No of images:"+Listimg.size());
			if(Listimg.size()>0) {
				return true;
			}else {
				return false;
			}
		}
	     //public void clickOnPoloandTshirts() {
			//PoloandTshirts.click();
		//}
	  /*   public void mouseHover(String locatorName) {
			action =new Actions(driver);
			action.moveToElement(getWebElement(locatorName)).perform();

		}
	 	public void mouseHoverClick(String locatorName) {
			action = new Actions(driver);
			action.moveToElement(getWebElement(locatorName)).click().build().perform();
		}*/
		public void popupClose() {
			popUp.click();
			log.info("Login Popup close successfuly");
		}
		//For product image display or not 
		public boolean productImageDisplayed() {
			Keyword.explicitWait(4000);
			if(productImage.isDisplayed()) {
				log.info("Product image display");
				return true;
			}else {
				log.info("Product image not display");
				return false;
			}
		}
		
		public boolean isProductImageDisplayed() {
	//	try{ 
			Keyword.explicitWait(4000);
				if(productImage.isDisplayed()) {
				return true;
			}
			else {
				return false;
			}
		//	}catch(Exception e) {
		//		return false;
			//	}	
		}
		public boolean isFilterDisplayed() {
			return prevFilter.isDisplayed();
		}

		
		public boolean isLogoDisplayed() {
			return flipkartLogo.isDisplayed();
		}

		 public void setSearchComponent() { 
			 this.searchComponent =getWebElement("searchComponent");
		}

}
