package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class screenUnderDieticianPO {

	WebDriver driver;
	
	@FindBy(name="Home")WebElement HomePage;
	@FindBy(name ="Registerbtn")WebElement Registerbtn;
	@FindBy(id="navIcon")WebElement IconNav;
	@FindBy(name ="options tab")WebElement optionstab;
	@FindBy(name ="Screensvisible")WebElement Screensvisible;
	@FindBy(id  ="error")WebElement ERROR;
	
	@FindBy(id="txtUsersignin")WebElement Usersignin;
	
	@FindBy(id ="txtRegister")WebElement Register;
	
	@FindBy (id="txtViewtest")WebElement Viewtest;
	
	@FindBy(name ="AddNewPat")WebElement NewPatient;
	
	@FindBy (name="DieticianHome")WebElement DieticianHome;
	
	@FindBy(name ="MyPatient")WebElement MyPatient;
	@FindBy (name = "conditionPlanPage")WebElement ConditionPlanPg;
	
public screenUnderDieticianPO() {
		
	}
	
	public screenUnderDieticianPO (WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements( driver, this);
	}
	
	
	public void displayIcon() {
		IconNav.isDisplayed();

	}
	
	public void Clickonoptionstab(){
		optionstab.click();
	}
	public void errorMsg() {
		ERROR.isDisplayed();
		
	}
	public void clickUsersignin() {
		Usersignin.click();
	}
	public void Screensvisible(){
		Screensvisible.click();	
	}
	
	public void DieticianPg(){
		HomePage.isDisplayed();	
	}
	
	public void RecenttestReport(){
		Viewtest.click();	
	}
	
	public void AddNewPatient(){
		Screensvisible.click();	
	}
	
	public void dieticianHome(){
		DieticianHome.click();	
	}
	
	public void myPatientPg(){
		MyPatient.click();	
	}
	
	
	public void conditionPlan(){
		ConditionPlanPg.click();	
	}
	
	
	
	
}
