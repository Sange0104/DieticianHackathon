package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fetchPatient_PO {
	
	 WebDriver driver;
	
	@FindBy (id="txtMyPatients")WebElement MyPatients; 
    @FindBy (id="txtphonenumberFilter")WebElement PhoneNumberFilter;
    @FindBy (id="txtemailFilter")WebElement EmailFilter;
    @FindBy (id="txtnameFilter")WebElement NameFilter;
    @FindBy (id="txtErrorMessage")WebElement ErrorMessage;
    @FindBy (id="btnSearch")WebElement Search;
    @FindBy (id="recordNumber")WebElement RecordNumber;
    @FindBy (id="custID")WebElement CustID;
    @FindBy (id="recordName")WebElement Name;
    @FindBy (id="recordDetails")WebElement Details;
    @FindBy (id="LastVisit")WebElement LastVisit;
    @FindBy (id="actions")WebElement Actions;
    @FindBy (id="btnTestReport")WebElement PreviousTestReport;
    @FindBy (id="btnDietPlan")WebElement PreviousDietPlan;
    @FindBy (id="btnNewReport")WebElement CreateNewReport;
    
    public  fetchPatient_PO () {
    	
    }
    public  fetchPatient_PO (WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements( driver, this);
    }
    
    public void MyPatientsPage() {
    	MyPatients.isDisplayed();
    }
    
    public void typesPhoneNo(String name) {
    	PhoneNumberFilter.sendKeys(name);
    }
    public void DiscontinueSearch() {
    	Search.clear();
    } 
     
    public void clickSearch () {
		Search.click();
	}
    
 
    public void typesEmailId(String Date) {
    	EmailFilter.sendKeys(Date);
    }
    
    public  void typeName(String Date) {
    	NameFilter.sendKeys(Date);
    }
    
    public void  visibleRecordNumber()  {
    	RecordNumber.isDisplayed();
    }
    public void  visibleCustId()  {
    	CustID.isDisplayed();
    } 
    
    public void  visibleRecordName()  {
    	Name.isDisplayed();
    }
    
    public void  visibleRecordDetails()  {
    	Details.isDisplayed(); 
    	
    }
    
    public void  visibleLastVisit()  {
    	LastVisit.isDisplayed();
    }
    
    public void  visibleActions()  {
    	Actions.isDisplayed();
    }
    
    public void  TabTestreport()  {
    	PreviousTestReport.isDisplayed();
    }
    
    public void  TabDietPlan()  {
    	PreviousDietPlan.isDisplayed();
    }
    
    public void  TabNewreport()  {
    	CreateNewReport.isDisplayed();
    }
    
   
}
