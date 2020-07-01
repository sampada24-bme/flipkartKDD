package com.pyaranbee.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.testing.constant.Constant;
import com.testing.keyword.Keyword;

public class OnlyTVsAndAppliancesPage extends Keyword {
	@CacheLookup
	@FindBy(css = "button[class='_2AkmmA _29YdH8']")
	private WebElement popUp;

	@FindBy(xpath = "//span[contains(text(),'TVs & Appliances')]")
	private WebElement TVsAndAppliances;

	@FindBy(xpath = "a[title='Washing Machine']")
	private WebElement WashingMachine;

	

	public void closespopUp() {
		popUp.click();
	}

	public void mouseHoverOnWomen() {
		action = new Actions(Constant.driver);
		action.moveToElement(TVsAndAppliances).perform();
	}

	public void mouseHoverOnEthnic() {
		action = new Actions(Constant.driver);
		action.moveToElement(WashingMachine).build().perform();
		String Result = element.getText();
	}

	public void ethnicWear() {
		WashingMachine.getText();
	}

	public boolean isEthnicWearDisplay() {
		return WashingMachine.isDisplayed();

	}

	
	
	public void mouseHoverOnTVsAndAppliancesn() {
		// TODO Auto-generated method stub
		
	}

	

	

	public boolean isFullyAutomaticFrontLoad() {
		// TODO Auto-generated method stub
		return false;
	}

	public void clickonFullyAutomaticFrontLoad() {
		// TODO Auto-generated method stub
		
	}

	public void clickonFilter() {
		// TODO Auto-generated method stub
		
	}

	public void clickOnLogo() {
		// TODO Auto-generated method stub
		
	}

	

}
