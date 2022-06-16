package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class patientsInfoPO {
	

	 WebDriver driver;
	 
	 
	 @FindBy (id="btnSearch")WebElement Search;
	 @FindBy (id="txtMyPatients")WebElement MyPatients; 
	 @FindBy (id="recordNumber")WebElement RecordNumber;
	 @FindBy (id="custID")WebElement CustID;
	 @FindBy (id="actions")WebElement Actions;
	 @FindBy (id="recordName")WebElement Name;
	 @FindBy (id="recordDetails")WebElement Details;
	 @FindBy (id="LastVisit")WebElement LastVisit;
	 @FindBy (id="btnNewReport")WebElement CreateNewReport;
	 @FindBy (id="btnTestReport")WebElement PreviousTestReport;
	 @FindBy (id="patientstest")WebElement ViewPatientTestReport;
	 
	 
	 public patientsInfoPO() {
		 
	 }
	 public patientsInfoPO (WebDriver driver) {
	    	this.driver = driver;
	    	PageFactory.initElements( driver, this);
	    }
	 
	 public void AfterSearch() {
	    	Search.isEnabled();
	    } 
	 
	 public void RecordNumber()  {
	    	RecordNumber.isDisplayed();
	    }
	 
	 public void  CustomerId(String id)  {
	    	CustID.isDisplayed ();
	    } 
	 
	 public void  RecordName(String name)  {
	    	Name.isDisplayed();
	    }
	 
	 public void  RecordDetails(String email)  {
	    	Details.isDisplayed();
	 
	 }
	 
	 public void  LastVisit(String Date)  {
	    	LastVisit.isDisplayed();
	    }
	 
	 public void  verifyRecordDetails(String email)  {
	    	Details.isDisplayed();
	 
	 }
	 
	 
	 public void  TabTestreport()  {
	    	PreviousTestReport.click();
	 
	 }
	 
	 public void  LandOnTestreport()  {
	    	ViewPatientTestReport.isDisplayed();
	 }
	 
	 public void  PatientsTestreport(String Data)  {
	    	ViewPatientTestReport.isDisplayed(); 
	 }
	 
	 
}
