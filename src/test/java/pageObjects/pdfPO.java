package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pdfPO {
	
	
	 WebDriver driver;
	
	 @FindBy (id="txtMyPatients")WebElement MyPatients;
	 @FindBy (id="patientstest")WebElement ViewPatientTestReport;
	 @FindBy (id="btnTestReport")WebElement PreviousTestReport;
	 @FindBy (id="pDF")WebElement PDF;
	 @FindBy (id="txtpatientinfo")WebElement  infopatient;
	 @FindBy (id="txtDoctorinfo")WebElement  infoDoctor;
	 @FindBy (id="txtCo-morbiditesinfo")WebElement Comorbidites;
	 @FindBy (id="txtDietinfo")WebElement  DietPlan;

	
	
 public  pdfPO () {
		 
	 }
	 
	 public  pdfPO (WebDriver driver) {
		 this.driver = driver;
	    	PageFactory.initElements( driver, this);
	 }
	
	 public void MyPatientsTab() {   
	    	MyPatients.isDisplayed();
	    	
	    }
	 
	 public void btnpatientreport() {
		 PreviousTestReport.click();
	    }
	 
	 public void showspatienttest() {
		 ViewPatientTestReport.isDisplayed();
	    }
	
	 public void clkPDF() {
		 PDF.click();
	    }
	 
	 public void OnPDF() {
		 PDF.click();
	    }
	 
	 public void patient(String info) {
		 infopatient .isDisplayed();
	    }
	 
	 
	 public void doctor(String info) {
		 infoDoctor .isDisplayed();
	    }
	 
	 public void infoComorbidites(String info) {
		 Comorbidites.isDisplayed();
	    }
	 
	 public void infodiet(String info) {
		 DietPlan.isDisplayed();
	    }

}
