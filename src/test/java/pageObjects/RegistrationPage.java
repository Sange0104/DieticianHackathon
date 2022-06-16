package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	public WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		
	
	@FindBy(name="Register")
	WebElement btnRegister;

	@FindBy(name="FirstName")
	WebElement FirstName;

	@FindBy(name="LastName")
	WebElement LastName;

	@FindBy(id="txtUserName")
	WebElement txtUserName;
	
	@FindBy(id="Email")
	WebElement Email;

	@FindBy(id="txtUserPassword")
	WebElement txtPassword;
	
	@FindBy(id="txtConformPassword")
	WebElement ConformPassword;

	@FindBy(id="btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(id="Signup")
	WebElement Signup;
	
	@FindBy(id="btnForgotPassword")
	WebElement btnForgotPassword;

	public void setUsername()
	{
		txtUserName.clear();
		txtUserName.sendKeys("username");

	}


	public void setPassword()
	{
		txtPassword.clear();
		txtPassword.sendKeys("password");
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();	
	}

	public void clickforgotPassword()
	{
		btnForgotPassword.click();
	}
	public void clickSignup() {
		Signup.click();
	}
}



