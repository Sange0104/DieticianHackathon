package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class searchPatients_PO {
	
	WebDriver driver;
	
	@FindBy (id="dieticianlogin")WebElement dieticianName;
	@FindBy (id="tabMyPatients")WebElement tabMyPatients;
	@FindBy (id="txtnameFilter")WebElement NameFilter;
	@FindBy (id="txtemailFilter")WebElement EmailFilter;
	@FindBy (id="txtphonenumberFilter")WebElement PhoneNumberFilter;
	@FindBy (id="btnSearch")WebElement Search;
	@FindBy (id="dieticianSoftware")WebElement dieticiansoftware;
    @FindBy (id="txtMyPatients")WebElement MyPatients;
    @FindBy (id="txtnamePhase")WebElement NamePhase;
    @FindBy (id="txtemailPhase")WebElement EmailPhase;
    @FindBy (id="txtphonePhase")WebElement PhonePhase;
    
    
    
	public searchPatients_PO() {
		
	}

	public searchPatients_PO (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void seenDietician() {
		dieticianName.isDisplayed();
	}
	
	public void clickpatients () {
		tabMyPatients.click();
	}
	
	public void clickSearch () {
		Search.isDisplayed();
	}
	
	public void OnMyPatients() {
		MyPatients.isDisplayed();
	}
	
	public void typeName (String Name ) {
		NameFilter.sendKeys(Name);
	}
	
	public void disapperName ( ) {
		NameFilter.clear();
	
	}
	
	public void typeEmail (String Email ) {
		EmailFilter.sendKeys(Email);
	
	}
	
	public void disapperEmail ( ) {
		EmailFilter.clear();
	
	}
	
	public void typePhoneNumber (String Phonenumber ) {
		PhoneNumberFilter.sendKeys(Phonenumber);
	
	}
	
	public void disapperPhoneNumber () {
		PhoneNumberFilter.clear();
	
	}
	
	public void phraseName ( ) {
		NamePhase.isDisplayed();
	
	}
	
	public void phraseEmail ( ) {
		EmailPhase.isDisplayed();
	
	}
	
	public void phrasePhoneNumber () {
		PhonePhase.isDisplayed();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
