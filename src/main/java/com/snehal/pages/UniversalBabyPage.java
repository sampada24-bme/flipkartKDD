package com.snehal.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.testing.keyword.Keyword;

public class UniversalBabyPage extends Keyword{
	Logger log=Logger.getLogger(UniversalBabyPage.class);
	@FindBy(css = "img[alt='Flipkart']")
	private WebElement flipkartLogo;
	@FindBy(xpath="//img[@src='https://rukminim1.flixcart.com/image/610/732/jumzc7k0/kids-ethnic-set/m/w/t/13-14-years-7022-black-aj-dezines-original-imafd9cuhmw5yqfc.jpeg?q=50']")
	private WebElement productImage;
	@FindBy(how = How.CSS, using = "input[name='q']")
	private WebElement searchComponent;
	@FindBy(css = "button[class='_2AkmmA _29YdH8']")
	private WebElement popUp;
	
	@FindBy(xpath="//span[contains(text(),'Baby & Kids')]")
	public WebElement BabyandKids;
	@FindBy(xpath="//a[contains(text(),'Ethnic Wear')]")
	public WebElement Ethnicwear;
	@FindBy(xpath="/html/body/div/div/div[2]/div/ul/li[5]/ul/li/ul/li/ul/li[4]/a[@title='Ethnic Wear']")
  private WebElement Ethnicwearnew;
	//@FindBy(xpath="//a[contains(text(),'Polos & T-Shirts')]")
		//public WebElement PoloandTshirts;
		//private WebElement x;

		public void clickOnLogo() {
			flipkartLogo.click();
		}
	     public void clickOnBabyandKids() {
			BabyandKids.click();
		}
	     public void clickOnEthnicwear() {
			Ethnicwearnew.click();

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
		public boolean isProductImageDisplayed() {
			return productImage.isDisplayed();
			
		}
		
		public boolean isLogoDisplayed() {
			return flipkartLogo.isDisplayed();
		}

		 public void setSearchComponent() { 
			 this.searchComponent =getWebElement("searchComponent");
		}

}
