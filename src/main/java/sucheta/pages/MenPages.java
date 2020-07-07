package sucheta.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.testing.keyword.Keyword;

public class MenPages extends Keyword {
	@CacheLookup
	@FindBy(css = "button[class='_2AkmmA _29YdH8']")
	private WebElement popUp;

	public void closespopUp() {
		// TODO Auto-generated method stub
		
	}

	public void clickOnLogo() {
		// TODO Auto-generated method stub
		
	}


}
