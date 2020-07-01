package com.testing.headerPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testing.constant.Constant;
import com.testing.keyword.Keyword;

public class OnlyWomenPage extends Keyword {
	@FindBy(css = "button[class='_2AkmmA _29YdH8']")
	private WebElement popUp;

	@FindBy(xpath = "//span[contains(text(),'Women')]")
	private WebElement women;

	
	@FindBy(xpath="//a[@title='Sarees']")
	public WebElement saree;

	@FindBy(xpath="//div[@class='_1YoBfV']//select[@class='fPjUPw']")
	public static WebElement dropdown;
	
	@FindBy(xpath = "//img[@class='_1e_EAo']")
	public WebElement Logo;

	public void closespopUp() {
		popUp.click();
	}

	public void mouseHoverOnWomen() {
		action = new Actions(Constant.driver);
		action.moveToElement(women).perform();
	}


	public void clickOnLogo() {
		Logo.click();
	}
	
	public void clickSarees() {
		saree.click();

	}
	
	public void clickOnFilter() {
		dropdown.click();

	}
	public static void selectByValue(String sendvalue ) {
		Select value=new Select(dropdown);
		value.selectByValue(sendvalue);
	}
	
	public boolean isSareeVisible() {
		return saree.isDisplayed();

	}


	public boolean isLogoDisplay() {
		
		return Logo.isDisplayed();
	}
	
	
	
	
	
	
	
}
