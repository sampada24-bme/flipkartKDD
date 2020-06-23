package com.testing.stepDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import com.testing.constant.Constant;
import com.testing.headerPage.LogInPage;
import com.testing.keyword.Keyword;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageTest {
	Logger log=Logger.getLogger(HomepageTest.class);
	static LogInPage step;
	
	@BeforeTest
	public static void initializePageObject() {
		step=PageFactory.initElements(Constant.driver, LogInPage.class);
	}
	
	
	@Given("^User should logIn into the system$")
	public void user_should_logIn_into_the_system() {
	    // Write code here that turns the phrase above into concrete actions
	   Keyword.openBrowser("chrome");
	   Keyword.launchUrl("https://www.flipkart.com");
	   log.info("URL launched");
	   Keyword.maximize();
	   Keyword.deleteAllCookies();
	   Keyword.implicitWait(4);
	  
	  
	}
	@When("^popUp comes to screen it will close first$")
	public boolean popUp_comes_to_screen_it_will_close_first() {
		if (step.closespopUp()) {
			log.info("Close pop Up");	
		}else{
			log.info("Not closed");
		}
		return true;
		
	}
	
	@Then("User enter value in search component")
	public void user_enter_value_in_search_component() {
	    // Write code here that turns the phrase above into concrete actions
	   step.enterProductToSearch("Shoes");
	   log.info("Product searched");
	}

	@Then("User click on mgnifier button")
	public void user_click_on_mgnifier_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User will search product")
	public void user_will_search_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
