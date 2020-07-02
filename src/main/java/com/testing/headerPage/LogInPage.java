package com.testing.headerPage;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testing.constant.Constant;
import com.testing.keyword.Keyword;

public class LogInPage extends Keyword {
	@FindBy(css="button[class='_2AkmmA _29YdH8']")
	public WebElement popUp;
	
	@FindBy(css="img[title='Flipkart']")
	private WebElement logo;
	
	@FindBy(css="a[class='_3Ep39l']")
	private WebElement Login;
	
	@FindBy(css="input[class='_2zrpKA _1dBPDZ']")
	private WebElement EmailPhone;
	
	@FindBy (css="input[type='password']")
	private WebElement password;
	
	@FindBy(xpath ="//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]")
	public WebElement LogInSubmit;
	
	@FindBy(css="input[title='Search for products, brands and more']")
	private WebElement searchComponent;
	
	@FindBy(css=".vh79eN svg")
	public WebElement searchButton;
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean closespopUp() {
		popUp.click();
		return true ;	
	}
	public boolean popUpVisible() {
		return popUp.isDisplayed();
	}

	public void clickOnLogo() {
		logo.click();
	}
	
	public boolean isLogoDisplay() {
		return logo.isDisplayed();
	}
	public void clickOnLogInButton() {
		Login.click();
	}
	public void clickOnEmailPhone() {
		EmailPhone.sendKeys("8855935580");
	}
	public void clcikOnPAssword() {
	password.sendKeys("sam24@96");
	}
	
	public void clickOnLogInSubmit() {
	LogInSubmit.click();
	}
	public boolean isLogInSubmitVisible() {
		return LogInSubmit.isDisplayed();
	}
	public void enterProductToSearch(String productName) {
		searchComponent.sendKeys(productName);
	}
	public void clickOnSearchButton() {
		searchButton.click();
	}
	public boolean isSearchButtonVisible() {
		return searchButton.isDisplayed();
	}

}
