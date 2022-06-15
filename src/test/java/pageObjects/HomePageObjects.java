package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObjects {
WebDriver driver;
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "txtTitle")
	WebElement Title;
	
	@FindBy(xpath = "//img[contains(@class, 'img responsive')]")
	WebElement logo;
	
	@FindBy(id = "txtProduct")
	WebElement lnkProduct;
	
	@FindBy(id = "txtClients")
	WebElement lnkClients;	
	@FindBy(id = "txtTeam")
	WebElement lnkTeam;
	
	@FindBy(id = "txtRegister")
	WebElement lnkRegister;
	
	@FindBy(id = "txtAbout")
	WebElement lnkAbout;
	
	@FindBy(id = "txtFeatured")
	WebElement lnkFeatured;
	
	@FindBy(id = "txtBlog")
	WebElement lnkBlog;
	
	@FindBy(id = "txtContactUs")
	WebElement lnkContactUs;
	
	@FindBy(id = "btnSearch")
	WebElement btnSearch;
	
	@FindBy(id = "btnSignIn")
	WebElement btnSignIn;
	
	public void verifytopmenutxtdisplay()
	{
	  lnkProduct.isDisplayed();
	  lnkClients.isDisplayed();
	  lnkTeam.isDisplayed();
	  lnkRegister.isDisplayed();
		
	}
	
	public void verifybottommenutxtdisplay()
	{
		lnkAbout.isDisplayed();
		lnkFeatured.isDisplayed();
		lnkContactUs.isDisplayed();
		lnkBlog.isDisplayed();
	}
	
	public void verifySearchbtndisplay()
	{
		btnSearch.isDisplayed();
		btnSearch.isEnabled();
	}
	
	public void verifySignInbtndisplay()
	{
	btnSignIn.isDisplayed();
		btnSignIn.isEnabled();
	}
	
	//Verify title and logo
		
	public String ValidateHomepageTitle() {
		return driver.getTitle();
	}
	
	public boolean Validatelogo() {
		return logo.isDisplayed();
	}
		
	//Click actions
		
	public void clicklnkProduct() {
		lnkProduct.click();
	}
	
	public void clicklnkClients() {
		lnkClients.click();
	}
	
	public void clicklnkTeam() {
		lnkTeam.click();
	}
	
	public void clicklnkRegister() {
		lnkRegister.click();
	}
	
	public void clicklnkAbout() {
		lnkAbout.click();
	}
	
	public void clicklnkFeatured() {
		lnkFeatured.click();
	}
	
	public void clicklnkContactUs() {
		lnkContactUs.click();
	}
	
	public void clicklnkBlog() {
		lnkBlog.click();
	}
		
	public void clickbtnSearch() {
		btnSearch.click();
	}
	
	public void clickbtnSignin() {
		btnSignIn.click();
	
	}
		
		
	

}
