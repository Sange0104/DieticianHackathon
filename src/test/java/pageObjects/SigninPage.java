package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	public WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		this.driver=driver;
		//ldriver = rdriver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name ="username")
	WebElement txtusername;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(name ="signinbtn")
	WebElement signinbtn;
	
	@FindBy(id  ="txtForgetpassword")
	WebElement Forgetpassword;
	
	@FindBy(id="txtrestpassword")
	WebElement restpassword;
	
	@FindBy(id ="txtnotamemberyet")
	WebElement notamemberyet;
	
	@FindBy (id="txtEmail")
	WebElement email;
	
	@FindBy(name ="password")
	WebElement Password;
	
	@FindBy(name ="signinbtn")
	WebElement loginbtn;
	
	@FindBy(name ="facebook")
	WebElement facebook;
	
	@FindBy (name="google")
	WebElement google;
	
	@FindBy(name ="signuphere")
	WebElement signuphere;
	
	
	
	public void setUsername()
	{
		txtusername.clear();
		txtusername.sendKeys("username");

	}


	public void setPassword()
	{
		password.clear();
		password.sendKeys("password");
	}
	
	public void clicksignin()
	{
		signinbtn.click();	
	}
	public void clickforgotPassword()
	{
		Forgetpassword.click();
	}
	
	public void clickrestpassword() {
		restpassword.click();
	}
	
	public void clicknotamemberyet() {
		notamemberyet.click();
	}
	
	public void clickemail() {
		email.click();
	}
	public void clickPassword() {
		Password.click();
	}
	public void clickonloginbtn() {
		loginbtn.click();
	}
	
	public void clickfacebook() {
		facebook.click();
	}
	
	public void  clickgoogle() {
		google.click();
	}
	
	public void clickonsignuphere() {
		signuphere.click();
	}
	
	
	
	
	
	

}
