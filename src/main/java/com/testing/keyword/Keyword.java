package com.testing.keyword;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.testing.constant.Constant;
import com.testing.propertyUtility.PropertiesUtility;
import com.testing.searchComponent.SearchComponent;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Used to open any required browser
 * 
 * @author Sam
 *
 */
public class Keyword extends Constant {

	static Logger log = Logger.getLogger(Keyword.class);

	public static void openBrowser(String browserName) {

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "HTML unit":
			driver = new HtmlUnitDriver();
			break;

		default:
			log.info("Unable to open browser");
			break;
		}
	}

	/**
	 * Launch URL required for the project
	 */
	public static void launchUrl(String url) {
		driver.get(url);
		log.info("Open URL successfully");
	}

	/**
	 * Maximize window
	 */
	public static void maximize() {
		driver.manage().window().maximize();
		log.info("Window maximize ");
	}

	/**
	 * delete cookies
	 */
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
		log.info("deleted cookies");
	}
	/**
	 * close Log_in Pop-up
	 */
	public static void closePopup(String locatorName) {
		// System.out.println(getWebElement(locatorName).getText());
		getWebElement(locatorName).click();
		log.info("Close pop-up successfully");
	}
	public static void closePopup(WebElement locator) {
		gettingWebElement(locator).click();

	}
	

	
	/**
	 * getElement method will provide address of locator
	 * 
	 * @param locatorName
	 * @return
	 */
	public static WebElement getWebElement(String locatorName) {
		String[] locator = PropertiesUtility.getLocatorValue(locatorName);

		String locatorType = locator[0];
		String locatorValue = locator[1];
		System.out.println(locatorValue + " " + locatorType);
		switch (locatorType) {
		case "xpath":
			element = driver.findElement(By.xpath(locatorValue));
			break;
		case "name":
			element = driver.findElement(By.name(locatorValue));
			break;
		case "linkText":
			element = driver.findElement(By.linkText(locatorValue));
			break;
		case "partialLinkText":
			element = driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "cssSlector":
			element = driver.findElement(By.cssSelector(locatorValue));
			break;
		case "className":
			element = driver.findElement(By.className(locatorValue));
			break;
		case "id":
			element = driver.findElement(By.id(locatorValue));
			break;
		default:
			log.info("Invalid Locator enter");
			break;
		}
		return element;
	}

	/**
	 * To enter text in field
	 * 
	 * @return
	 */
	public static void enterText(String locatorName, String sendvalue) {
		getWebElement(locatorName).sendKeys(sendvalue);
		log.info("text entered");
	}

	/**
	 * Keys down method is used to select downward option
	 * 
	 * @param locatorName
	 */
	public static void keyDown(WebElement locator) {
		gettingWebElement(locator).sendKeys(Keys.ARROW_DOWN);
		log.info("Key down to select option");
	}

	public static void keyUp(WebElement locator) {
		gettingWebElement(locator).sendKeys(Keys.ARROW_UP);
		log.info("Key Up to select option");
	}

	/**
	 * gettingWebElement method will use for getting WebElement as argument
	 * locator
	 * 
	 * @param locator
	 * @return
	 */

	public static WebElement gettingWebElement(WebElement locator) {
		return element;
	}

	public static void keyLeft(WebElement locator) {
		gettingWebElement(locator).sendKeys(Keys.ARROW_LEFT);
		log.info("Keys left to selelct option");
	}

	public static void keysRight(WebElement locator) {
		gettingWebElement(locator).sendKeys(Keys.ARROW_RIGHT);
	}

	/**
	 * mouse hover only will hover mouse on required content
	 * 
	 * @param locatorName
	 */
	public static void mouseHoverOnly(String locator) {
		action = new Actions(driver);
		action.moveToElement(getWebElement(locator)).perform();
		log.info("It will just hover mouse");
	
		
	/*	action = new Actions(driver);
		action.moveToElement(gettingWebElement(locator)).perform();
		log.info("It will just hover mouse");*/
	}

	/**
	 * Select By value as per requirement
	 */

	public static void selectByValue(WebElement locator, String sendvalue) {
		System.out.println(locator.getText() + " " + sendvalue);
		Select value = new Select(locator);
		value.selectByValue(sendvalue);
	}

	public static void selectByIndex(WebElement locator, int sendvalue) {
		System.out.println(locator.getText() + " " + sendvalue);
		Select value = new Select(locator);
		value.selectByIndex(sendvalue);
	}
	

	/**
	 * to click on required position
	 */
	public static void performClick(String locatorName) {
		getWebElement(locatorName).click();
		log.info("click perform");
	}

	/**
	 * search Product in searchBox
	 * 
	 * @param locatorName
	 * @param productName
	 */
	public static void searchProduct(String locatorName, String productName) {
		getWebElement(locatorName).sendKeys(productName);
		log.info("product search done");
	}

	/**
	 * it will hover to required element
	 * 
	 * @param locatorType
	 * @param locatorValue
	 */
	public static void mouseHoverClick(String locator) {
		action = new Actions(driver);
		action.moveToElement(getWebElement(locator)).click().build().perform();
		log.info("mouse hover and click perform");
	}

	/**
	 * to click on required parameter
	 * 
	 * @param locatorName
	 */
	public static void click(String locatorName) {
		getWebElement(locatorName).click();
		log.info("click done ");
	}

	/**
	 * implicit wait method to apply wait
	 * 
	 * @param duration
	 */
	public static void implicitWait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		log.info("implicit wait applied");
	}

	/**
	 * Explicit wait to provide wait
	 */
	public static void explicitWait(int duration) {
		wait = new FluentWait(driver);
		wait.withTimeout(duration, TimeUnit.SECONDS);
		log.info("explici wait applied");
	}
	/**
	 */

	public static void waitUntil(int duration) {
		wait = new FluentWait(driver);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("t-0M7P _2doH3V")));
		log.info("wait till expected condition");
	}

	/**
	 * get text
	 * 
	 * @param locatorName
	 * @return
	 */
	public static String getText(String locatorName) {
		return getWebElement(locatorName).getText();
	}

	/**
	 * Navigate method
	 */
	public static void navigate() {
		driver.navigate();
	}

	/**
	 * refresh method to refresh the page
	 */
	public static void refresh() {
		driver.navigate().refresh();
		log.info("refresh page");
	}

	/**
	 * page Scroll down
	 */
	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}

	/**
	 * Close Window
	 */
	public static void closeBrowser() {
		driver.close();
		log.info("close browser successfuly");

	}

}
