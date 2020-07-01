package com.testing.headerPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.testing.constant.Constant;
import com.testing.keyword.Keyword;

public class AfterLogInPage extends Keyword{

	@FindBy(css="button[class='_2AkmmA _29YdH8']")
	public WebElement popUp;
	
	@FindBy(xpath = "//span[contains(text(),'Women')]")
	private WebElement women;
	
	@FindBy(css = "a[title='Kurtas & Kurtis']")
	private WebElement KurtasKurtis;
	
	
	public void closespopUp() {
		popUp.click();
	}
	
	public void mouseHoverOnWomen() {
		action = new Actions(Constant.driver);
		action.moveToElement(women).perform();
	}
	
	public void clickOnKurtasKurtis() {
		KurtasKurtis.click();
	}
	
	public boolean kurtiesVisible() {
		return KurtasKurtis.isDisplayed();
	}

}
