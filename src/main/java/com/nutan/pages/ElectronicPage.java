package com.nutan.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testing.keyword.Keyword;


public class ElectronicPage extends Keyword {

	@FindBy(css = "button[class='_2AkmmA _29YdH8']")
	public WebElement popUp;

	@FindBy(xpath = "//*[@id='container']/div/div[2]/div/ul/li[1]/span")
	private WebElement Electronic;

	@FindBy(css = "[title='Vivo']")
	private WebElement Vivo;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[3]/div[1]/label/div[1]")
	private WebElement Assured;

	@FindBy(css = "[class='_20yN1P']")
	private WebElement checkque;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[4]/div[2]/div/div[1]/div/div/label/div[1]")
	private WebElement RAM;

	@FindBy(css = "#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div:nth-child(1) > div > div:nth-child(1) > div > section._1MCcAi.D_NGuZ > div._3Uy12X > div._1qKb_B > select")
	private WebElement min;

	@FindBy(css = "[class='_1YoBfV']")
	private WebElement max;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[2]")
	private WebElement sort;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[6]/div[2]/div/div[2]/div/div/label/div[1]")
	private WebElement CustomerRating;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[7]/div/div")
	private WebElement Internalstorage;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[7]/div[2]/div/div[1]/div/div/label/div[1]")
	private WebElement CheckBoxInetrnalStro;

	@FindBy(xpath = "/html/body/div[1]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[8]/div/div")
	private WebElement BatteryCapa;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[8]/div[2]/div/div[1]/div/div/label/div[1]")
	private WebElement BatteryCapaBox;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[10]/div/div")
	private WebElement NetworkType;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[10]/div[2]/div/div[4]/div/div/label/div[1]")
	private WebElement NetworkBox;

	@FindBy(xpath = " //*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[11]/div/div")
	private WebElement ScreenSize;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[11]/div[2]/div/div[1]/div/div/label/div[1]")
	private WebElement ScreenSizeCheckBox;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[12]/div/div")
	private WebElement SimType;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[12]/div[2]/div/div/div/div/label/div[1]")
	private WebElement SimTypeBox;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[13]/div/div")
	private WebElement PrimaryCamera;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[13]/div[2]/div/div[3]/div/div/label/div[1]")
	private WebElement PrimaryBox;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[14]/div/div")
	private WebElement SecondaryCamera;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[14]/div[2]/div/div/div/div/label/div[1]")
	private WebElement SecondaryCamBox;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[15]/div/div")
	private WebElement Offers;

	@FindBy(xpath = " //*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[15]/div[2]/div/div[3]/div/div/label/div[1]")
	private WebElement OffersCheckBox;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[16]/div/div")
	private WebElement ResolutionType;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[16]/div[2]/div/div/div/div/label/div[1]")
	private WebElement ResolutionTypeBox;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[17]/div/div")
	private WebElement Type;

	@FindBy(xpath = "//*[@id='container']/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[17]/div[2]/div/div/div/div/label/div[1]")
	private WebElement TypeBox;

	@FindBy(xpath = "")
	private WebElement OperatingSysVerName;

	@FindBy(xpath = "")
	private WebElement OperatingSysVerNameBox;

	@FindBy(xpath = "")
	private WebElement Availibility;

	@FindBy(xpath = "")
	private WebElement AvailibilityBox;

	@FindBy(xpath = "")
	private WebElement Clockspeed;

	@FindBy(xpath = "")
	private WebElement ClockspeedBox;

	@FindBy(xpath = "")
	private WebElement Features;

	@FindBy(xpath = "")
	private WebElement FeaturesBox;

	@FindBy(xpath = "")
	private WebElement NumberOfCores;

	@FindBy(xpath = "")
	private WebElement NumberOfCoresBox;

	@FindBy(xpath = "")
	private WebElement Budget;

	@FindBy(xpath = "")
	private WebElement BudgetBox;

	public void clickonPopUp() {
		popUp.click();
	}

	public void clickonElectronic() {
		Electronic.click();
	}

	public void clickonVivo() {
		Vivo.click();
	}

	public void clickonAssured() {
		Assured.click();
	}

	public void Tocheckque() {
		checkque.click();
	}

	public void clickonRAM() {
		RAM.click();
	}

	public void clickonmin() {
		min.click();
	}

	public void clickonmax() {
		max.click();
	}

	public void clicksonortBy() {
		sort.click();

	}

	public void clickoncustomerrate() {
		CustomerRating.click();
	}

	public void clickOnInternalStorage() {
		Internalstorage.click();
	}

	public void clickOnIntStrCheckBox() {
		CheckBoxInetrnalStro.click();
	}

	public void clickOnBatteryCapa() {
		BatteryCapa.click();
	}

	public void clickOnBatteryBox() {
		BatteryCapaBox.click();
	}

	public void clickOnNetworkType() {
		NetworkType.click();
	}

	public void clickOnNetworkBox() {
		NetworkBox.click();
	}

	public void clickOnScreenSize() {
		ScreenSize.click();
	}

	public void clickOnScreenSizeBox() {
		ScreenSizeCheckBox.click();
	}

	public void clickOnSimType() {
		SimType.click();
	}

	public void clickOnSimTypeBox() {
		SimTypeBox.click();
	}

	public void clickOnPrimaryCam() {
		PrimaryCamera.click();
	}

	public void clickOnPrimaryCamBox() {
		PrimaryBox.click();
	}

	public void clickOnSecondaryCam() {
		SecondaryCamera.click();
	}

	public void clickOnSecondaryCamBox() {
		SecondaryCamBox.click();
	}

	public void clickOnOffers() {
		Offers.click();
	}

	public void clickOnOffersCheckBox() {
		OffersCheckBox.click();
	}

	public void clickOnResolutionType() {
		ResolutionType.click();
	}

	public void clickOnResolutionTypeBox() {
		ResolutionTypeBox.click();
	}

	public void clickOnType() {
		Type.click();

	}

	public void clickTypeBox() {
		TypeBox.click();
	}
}