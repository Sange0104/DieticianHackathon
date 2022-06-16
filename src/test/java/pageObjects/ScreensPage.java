package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreensPage {
	
public WebDriver ldriver;
	
	public ScreensPage(WebDriver driver) {
		driver =  driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name ="Registerbtn")
	WebElement Registerbtn;
	
	@FindBy(name ="options tab")
	WebElement optionstab;
	
	@FindBy(name ="Screensvisible")
	WebElement Screensvisible;
	
	@FindBy(id  ="txtPublic")
	WebElement Public;
	
	@FindBy(id="txtUsersignin")
	WebElement Usersignin;
	
	@FindBy(id ="txtRegister")
	WebElement Register;
	
	@FindBy (id="txtTeam")
	WebElement Team;
	
	@FindBy(name ="Testimonals")
	WebElement Testimonals;
	
	@FindBy(name ="ForgotPassword")
	WebElement ForgotPassword;
	
	@FindBy(name ="ProductFeatures")
	WebElement ProductFeatures;
	
	@FindBy (name="Contacts")
	WebElement Contacts;
	
	@FindBy(name ="blogs")
	WebElement blogs;
	
	
	
	public void clickonRegisterbtn()
	{
		Registerbtn.click();

	}


	public void Clickonoptionstab()
	{
		optionstab.click();
	}
	
	public void Screensvisible()
	{
		Screensvisible.click();	
	}
	public void clickPublic()
	{
		Public.click();
	}
	
	public void clickUsersignin() {
		Usersignin.click();
	}
	
	public void clickRegister() {
		Register.click();
	}
	
	public void clickTeam() {
		Team.click();
	}
	public void clickTestimonals() {
		Testimonals.click();
	}
	public void clickonForgotPassword() {
		ForgotPassword.click();
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



