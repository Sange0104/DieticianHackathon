package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class listOfScreenPO {
	
	WebDriver driver;
	
	
	@FindBy(name="Home")WebElement HomePage;
	@FindBy(name ="Registerbtn")WebElement Registerbtn;
	@FindBy(id="navIcon")WebElement IconNav;
	@FindBy(name ="options tab")WebElement optionstab;
	
	@FindBy(name ="Screensvisible")WebElement Screensvisible;
	
	@FindBy(id  ="txtPublic")WebElement Public;
	
	@FindBy(id="txtUsersignin")WebElement Usersignin;
	
	@FindBy(id ="txtRegister")WebElement Register;
	
	@FindBy (id="txtTeam")WebElement Team;
	
	@FindBy(name ="Testimonals")WebElement Testimonals;
	
	@FindBy(name ="ForgotPassword")WebElement ForgotPassword;
	
	@FindBy(name ="ProductFeatures")WebElement ProductFeatures;
	
	@FindBy (name="Contacts")WebElement Contacts;
	@FindBy(name ="blogs")WebElement blogs;
	
	
	public listOfScreenPO() {
		
	}
	
	public listOfScreenPO (WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements( driver, this);
	}
	
	public void displayIcon(){
		IconNav.isDisplayed();

	}
	
	public void displayHomePg(){
		HomePage.isDisplayed();

	}
	
	public void seleIcon(){
		IconNav.isSelected();

	}
	
	public void clickonRegisterbtn(){
		Registerbtn.click();
}

	public void Clickonoptionstab(){
		optionstab.click();
	}
	
	public void Screensvisible(){
		Screensvisible.click();	
	}
	public void clickPublic(){
		Public.click();
	}
	
	public void clickUsersignin() {
		Usersignin.click();
	}
	
	public void seleRegister() {
		Register.isSelected();
	}
	
	public void selcTeam() {
		Team.isSelected();
	}
	
	public void clickTestimonals() {
		Testimonals.isSelected();
	}
	
	public void selecForgotPassword() {
		ForgotPassword.isSelected();
	}

	public void ForgotPassword() {
		ForgotPassword.isDisplayed();
	}

	
	public void clickProductFeatures() {
		ProductFeatures.click();
	}
	
	public void  clickContacts() {
		Contacts.click();
	}
	
	public void clickonblogs() {
		 blogs.click();
	}


	public String isDisplayed() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
