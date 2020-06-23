package com.testing.headerPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testing.constant.Constant;
import com.testing.keyword.Keyword;

public class OnlyWomenPage extends Keyword {
	@CacheLookup
	@FindBy(css = "button[class='_2AkmmA _29YdH8']")
	private WebElement popUp;

	@FindBy(xpath = "//span[contains(text(),'Women')]")
	private WebElement women;

	@FindBy(css = "a[title='Kurtas & Kurtis']")
	private WebElement KurtasKurtis;

	@FindBy(xpath = "//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']//a[contains(text(),'Ethnic Wear')]")
	private WebElement ethnicWear;

	@FindBy(xpath = "//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']//a[contains(text(),'Ethnic Wear')]")
	public WebElement element;
	
	
	@FindBy(xpath="//a[@title='Sarees']")
	public WebElement saree;

	@FindBy(xpath="_1YoBfV")
	public WebElement filter;
	
	/*
	 * @FindBy (xpath="//a[@class='_3XS1AH _32ZSYo']") private WebElement
	 * ethnicwearInside;
	 * 
	 * @FindBy(xpath = "//a[@class='_2SvCnW'][contains(text(),'Sarees')]")
	 * private WebElement sareesInside;
	 * 
	 * @FindBy(xpath =
	 * "//div//a[@class='_2SvCnW'][contains(text(),'Kurtas & Kurtis')]") private
	 * WebElement KurtasInside;
	 */
	@FindBy(xpath = "//img[@class='_1e_EAo']")
	public WebElement Logo;

	public void closespopUp() {
		popUp.click();
	}

	public void mouseHoverOnWomen() {
		action = new Actions(Constant.driver);
		action.moveToElement(women).perform();
	}

	public void mouseHoverOnEthnic() {
		action = new Actions(Constant.driver);
		action.moveToElement(ethnicWear).build().perform();
		String Result = element.getText();
	}

	public void ethnicWear() {
		ethnicWear.getText();
	}

	public boolean isEthnicWearDisplay() {
		return ethnicWear.isDisplayed();

	}
	// public String getTextEthnicWear()
	// {
	// return ethnicwearInside.getText();
	// }

	// public void clickOnWomen() {
	// women.click();
	// }

	public void clickOnKurtasKurtis() {
		KurtasKurtis.click();

	}

	// public void clickOnSarees() {
	// sareesInside.click();
	// }
	//
	// public void clickOnKurtas() {
	// KurtasInside.click();
	// }

	public void clickOnLogo() {
		Logo.click();
	}
	
	public void clickSarees() {
		saree.click();

	}
	
	public void clickFilter() {
		filter.click();

	}
//	public static void selectByValue(String sendvalue ) {
//		//ystem.out.println(locator.getText()+" "+sendvalue);
//		Select value=new Select(filter);
//		value.selectByValue(sendvalue);
//	}
//	

	public boolean isLogoDisplay() {
		
		return Logo.isDisplayed();
	}
	
	
	
	
	
	
	
	
}
