package com.testing.stepDefination;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import com.testing.constant.Constant;
import com.testing.headerPage.LogInPage;
import com.testing.keyword.Keyword;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepageTest extends Keyword {
	Logger log = Logger.getLogger(HomepageTest.class);
	LogInPage step;

	// @BeforeTest
	public static void initializePageObject() {
		// step = PageFactory.initElements(Constant.driver, LogInPage.class);
	}

	@Given("Browser launch into system")
	public void browser_launch_into_system() {
		openBrowser("chrome");
		driver.get("https://www.flipkart.com/");
		log.info("URL launched");
		driver.manage().window().maximize();
		implicitWait(5);
		step = new LogInPage();

	}

	@When("popUp comes to screen it will close first")
	public void popUp_comes_to_screen_it_will_close_first() {
		// Keyword.closePopup("popup");
		step.closespopUp();
	}

	@Then("User enter value in search component")
	public void user_enter_value_in_search_component() {
		step.enterProductToSearch("Shoes");
		log.info("Product searched");
	}

	@Then("User click on mgnifier button")
	public void user_click_on_mgnifier_button() {
		step.clickOnSearchButton();
		Assert.assertTrue(step.isSearchButtonEnable(), "Search button not visible");
	}

	@Then("User will search product")
	public void user_will_search_product() {
		
	

	}

}
