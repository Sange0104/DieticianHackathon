package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testDataPO {
	
	
	 WebDriver driver;
	
	
	 @FindBy (id="patientstest")WebElement ViewPatientTestReport;
	 @FindBy (id="btnTestReport")WebElement PreviousTestReport;
	 @FindBy (id="patientsData")WebElement PatientData;
	 @FindBy (id="Newrecordnumber")WebElement NewrecordNumber;
	 @FindBy (id="txtDoc")WebElement DocId;
	 @FindBy (id="fileData")WebElement File;
	 @FindBy (id="txtupload")WebElement UploadTime;
	 @FindBy (id="txtFileName")WebElement FileName;
	 @FindBy (id="txthealthcondition")WebElement IdentifiedHealth;
	 @FindBy (id="txtMyPatients")WebElement MyPatients;
	 public testDataPO  (){
	 
	 }
	 
	 public  testDataPO  (WebDriver driver) {
		 this.driver = driver;
	    	PageFactory.initElements( driver, this);
	 } 
	
	 public void btnpatientreport() {
		 PreviousTestReport.click();
	    }
	 
	 
	 public void pagepatienttest() {
		 ViewPatientTestReport.isDisplayed();
	    }
	
	 
	 
	 public void headerfiledata() {
		 File.isDisplayed();
	    }
	 
	    public void MyPatientsTab() {   
	    	MyPatients.isDisplayed();
	    	
	    }
	 
	 
	 public void NRN(String number) {
		 NewrecordNumber.isDisplayed();
	    }
	 
	 public void upload(String time) {
		 UploadTime.isDisplayed();
	    }
	 
	 public void docId(String data) {
		 DocId.isDisplayed();
	    }
	 
	 public void fileName(String report ) {
		 FileName.isDisplayed();
	    }
	 
	 public void identifedhealth(String condition) {
		IdentifiedHealth.isDisplayed();
	    }
	 
	

}
