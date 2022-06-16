package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_TestReportsPO {
	
	 WebDriver driver;
	 
	 
	 @FindBy (id="dieticianlogin")WebElement dieticianName;
	 @FindBy (id="txtMyPatients")WebElement MyPatients; 
	 @FindBy (id="patientstest")WebElement ViewPatientTestReport;
	 @FindBy (id="btnTestReport")WebElement PreviousTestReport;
	 @FindBy (id="patientsData")WebElement PatientData;
	 @FindBy (id="NewPatientsnumber")WebElement NewPatientNumber;
	 @FindBy (id="txtDoc")WebElement DocId;
	 @FindBy (id="fileData")WebElement File;
	 @FindBy (id="txtupload")WebElement UploadTime;
	 @FindBy (id="txtFileName")WebElement FileName;
	 @FindBy (id="txthealthcondition")WebElement IdentifiedHealth;
	 @FindBy (id="recordDetails")WebElement Details;
	 
	 public  P_TestReportsPO () {
		 
	 }
	 
	 public  P_TestReportsPO (WebDriver driver) {
		 this.driver = driver;
	    	PageFactory.initElements( driver, this);
	 }
	 
	 
	 public void AfterLoginAs() {
	    	dieticianName.isDisplayed();
	    }
	 
	 public void patientpg() {
		 MyPatients.isDisplayed();
	    }
	 public void clkpatientpg() {
		 MyPatients.click();
	    }
	 
	 public void btnpatientreport() {
		 PreviousTestReport.click();
	    }
	 
	 public void showspatienttest() {
		 ViewPatientTestReport.isDisplayed();
	    }
	 
	 public void colmDetails(String Data) {
		 Details.isDisplayed();
	    }
	 
	 public void PreTestRep() {
		 PreviousTestReport.click();
	    }
	 
	 
	 public void headerfiledata() {
		 File.isDisplayed();
	    }
	 
	 
	 public void NPN() {
		 NewPatientNumber.isDisplayed();
	    }
	 
	 public void upload() {
		 UploadTime.isDisplayed();
	    }
	 
	 public void docId() {
		 DocId.isDisplayed();
	    }
	 
	 public void fileName() {
		 FileName.isDisplayed();
	    }
	 
	 public void identifedhealth() {
		IdentifiedHealth.isDisplayed();
	    }
	 
	 
}
