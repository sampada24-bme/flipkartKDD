package com.testing.headerPage;

import org.apache.xalan.xsltc.compiler.util.ErrorMsg;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.testing.keyword.Keyword;

public class SignInPage extends Keyword {
	@FindBy(css = "button[class='_2AkmmA _29YdH8']")
	private WebElement popUp;

	@FindBy(css = "a[class='_3Ep39l']")
	private WebElement Login;

	@FindBy(css = "a[class='oZoRPi']")
	private WebElement SignIn;

	@FindBy(css = "input[class='_2zrpKA _1dBPDZ']")
	private WebElement MobNo;

	@FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement Continue;

	@FindBy(how = How.CSS, using = "input[class='_2zrpKA _1dBPDZ']")
	private WebElement OTP;

	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	private WebElement password;

	@FindBy(how = How.CSS, using = "button[class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement signInButton;

	@FindBy(how = How.CSS, using = "span[class='ZAtlA-']")
	WebElement errorMsg;

	@FindBy(xpath = "//span[contains(text(),'Change?')]")
	WebElement changeMobNo;

	public void closePopUp() {
		popUp.click();
	}

	public void clickOnLogIn() {
		Login.click();
	}

	public void clickSignIn() {
		SignIn.click();
	}

	public void ClickMobNo() {
		MobNo.sendKeys("9823529087");
	}

	public void clickNewMobNo() {
		MobNo.sendKeys("6754639900");
	}
	public void clickOnCOntinue() {
		Continue.click();
	}

	public void enterOTP() {
		OTP.sendKeys("4536");
	}

	public void enterPAssword() {
		password.sendKeys("123abc456");
	}

	public void clickonSignInButton() {
		signInButton.click();
	}

	public boolean isErrorMsgDisplay() {
		return errorMsg.isDisplayed();
	}

	public void changeMobileNO() {
		changeMobNo.click();
	}

	public boolean isChangeDisplay() {
		return changeMobNo.isDisplayed();

	}
	
	
	
	
}
