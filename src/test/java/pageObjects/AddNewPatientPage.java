package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewPatientPage{

	private static final Object PageSource = null;
	WebDriver driver;
	public  AddNewPatientPage()
	{}
	public AddNewPatientPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="btnNewPatient")WebElement newpatient;
	@FindBy(id="PatientData")WebElement patientdataform;
	@FindBy(id="btnEmptyForm")WebElement emptyformsubmission;
	@FindBy(id="ErrorMessage")WebElement errormessage;
	@FindBy(id="ErrorMessage")WebElement numericerrormessage;
	@FindBy(id="LoginPage")WebElement LoginPage;
	@FindBy(id="txtUserLoginName") WebElement eleUserName;
	@FindBy(id="txtUserPassword") WebElement elePassword;
	@FindBy(id="btnLoginSubmit") WebElement eleLogin;
	@FindBy(id="AddPatients") WebElement addpatient;
	@FindBy(id="EmptyField")WebElement emptyfield;
	@FindBy(id="btnUpdate")WebElement selectupdate;
	@FindBy(id="FullName")WebElement fullname;
	@FindBy(id="Address1")WebElement address1;
	@FindBy(id="Add2")WebElement address2;
	@FindBy(id="Country")WebElement country;
	@FindBy(id="City")WebElement city;
	@FindBy(id="State")WebElement region;
	@FindBy(id="PostalCode")WebElement postalcode;
	@FindBy(id="Email")WebElement email;
	@FindBy(id="PhoneNumber")WebElement phnum;
	@FindBy(id="btnUpdate")WebElement strupdate;
	@FindBy(id="StringButton")WebElement strbtn;
	@FindBy(id="Patientdetails")WebElement patientdetails;
	//private Object update;
	
public void newpatient() {
    newpatient.click();
}

public void patientdata() {
	patientdataform.isEnabled();
}

public void emptyform() {
	emptyformsubmission.click();
}

public void errormessage() {
	errormessage.isDisplayed();
}

public boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false; 
    }
	return false;
}

public void numericerrormessage() {
	errormessage.isDisplayed();
}


public class InvalidAddPatientSteps{
	
	public WebDriver driver;
	private Object PageSource;
	//private Object findElements;
	{
		 driver=new ChromeDriver();
		
		if(driver.getPageSource().contains("numeric FirstNAme")){
			driver.close();
			Assert.assertTrue(false);}
		else {
			Assert.assertEquals(PageSource,driver.getPageSource() );
		}
	}
	

public boolean emptyfield(String emptfield) {
		
		if (emptfield == null) {
		      return false; 
	    }
		return false;
	}


public void emptyfieldsubmission() {

		 driver=new ChromeDriver();
		
		if(driver.getPageSource().contains("emptyfieldSubmission")){
			driver.close();
			Assert.assertTrue(false);}
		else {
			Assert.assertEquals(PageSource,driver.getPageSource() );
		}
	}
	
}
	
public boolean selectupdate() {

	if(driver.getPageSource().contains("nonselecting updatebtn")){
		
	}
	
	return false;
	
}

public void invaliddataformat() {
	if(driver.getPageSource().contains("Invalid dataformatt ")){
		driver.close();
		Assert.assertTrue(false);}
	else {
		Assert.assertEquals(PageSource,driver.getPageSource() );
	}
}

public boolean invalidcharacters(String fields) {
	

	if(driver.getPageSource().contains("invalid String fields")){
		
	}
	
	return false;
	
}

WebDriver driver1;
public void validpatientdetails ()
{}
public  void validpatientdetails(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void fullname(String fName) {
		fullname.sendKeys(fName);
	}
public void address1(String addressline1) {
	address1.sendKeys();
}
public void address2(String addressline2) {
	address1.sendKeys();
}
public void country(String Country) {
	country.sendKeys();
}
public void city(String City) {
	city.sendKeys();
}
public void region(String Region) {
	region.sendKeys();
}
public void postalcode() {
	postalcode.sendKeys();
}
public void email() {
	email.sendKeys();
}
public void phonenumber() {
	phnum.sendKeys();
}

public void strupdate() {
	strupdate.isEnabled();
}
public void strbutton() {
	strbtn.click();
}
public void patientdetails() {
	patientdetails.isDisplayed();
}
public void AddNewPatientPage() {
	// TODO Auto-generated method stub
	
}
	
}

	





	





	



