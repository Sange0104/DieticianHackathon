package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DieticianHomePage {

	WebDriver driver;
	public  DieticianHomePage()
	{}
	public DieticianHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dietitianpage")WebElement dietitianPage;
	@FindBy(id="btnsignin") WebElement signin;
	@FindBy(id="btnhome")WebElement home;
	@FindBy(name="header")WebElement headerMenu;
	@FindBy(id="Newpatient")WebElement selectnewpatient;
	@FindBy(id="btnnewPatient")WebElement newpatient;
	@FindBy(id="Dietplanspage")WebElement dietplanspage;
	@FindBy(id="btndietplans")WebElement selectdietplans;
	@FindBy(id="Dietplan")WebElement dietplans;
	@FindBy(id="Section")WebElement section;
	@FindBy(name="msg")WebElement messagebar;
	@FindBy(id="Login")WebElement button;
	@FindBy(name="loginmsg")WebElement successfullogin;
	@FindBy(id="imageContent")WebElement imagecontent;

public void DieticianPage() {
	dietitianPage.isDisplayed();
}

public void clickOnsignin() {
	signin.click();	
}

public void clickOnhome() {
	home.click();
}

public void header() {
	headerMenu.isDisplayed();
}

public void selectnewpatient () {
	newpatient.isSelected();
}

public void newpatient() {
	newpatient.click();
}

public void dietplanspage() {
	dietplanspage.click();
}

public void selectdietplans() {
	dietplans.isSelected();
	
}
public void dietplansPage(String message) {
	dietplanspage.isDisplayed();
}

public void section() {
	section.isEnabled();
}

public void messagebar(String message) {
	messagebar.isEnabled();
}

public void imagecontent() {
	imagecontent.isDisplayed();
}

public void login() {
	button.isEnabled();
	
}

public void successfullogin(String message) {
	successfullogin.click();
}


}
