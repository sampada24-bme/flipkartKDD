package com.testing.searchComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.testing.constant.Constant;
import com.testing.keyword.Keyword;

public class SearchComponent extends Keyword {
	@Test
	public void searchProd() throws InterruptedException {

		Keyword.openBrowser("chrome");
		launchUrl("https:www.flipkart.com");
		implicitWait(3);
		maximize();

		// it will close pop-up
		closePopup("popup");

		// it will check search box and enter product & click on search button
		searchProduct("search", "Shoes");
		performClick("searchBox");

		// now we are clicking on login button,entering email or mob no then
		//entering password & finally click on log-in button to LogIn user successfully
		click("logIn");
		enterText("email/mob", "8855935580");
		enterText("password", "sam24@96");
		performClick("logInButton");
		
		
		explicitWait(8);
		mouseHoverOnly("Sampada");
		explicitWait(5);
		click("MyProfile");
		explicitWait(3);
		
		
	
	}

}
