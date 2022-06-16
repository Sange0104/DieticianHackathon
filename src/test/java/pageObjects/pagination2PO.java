package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagination2PO {
	
	
	WebDriver driver;
	
	
	@FindBy (id="btnTestReport")WebElement PreviousTestReport;
	 @FindBy (id="patientstest")WebElement ViewPatientTestReport;
	 @FindBy (id="btnNextpagination")WebElement NextPaginationbtn;
	@FindBy (id="btnPreviousPagination")WebElement PreviousPaginationbtn; 
	
	
	public pagination2PO() {
		
	}
	public pagination2PO (WebDriver driver) {
		this.driver = driver;
    	PageFactory.initElements( driver, this);
	}
	
	 
	public void clkpatientreport() {
		 PreviousTestReport.click();
	    }
	
	public void showspatientstest() {
		 ViewPatientTestReport.isDisplayed();
	    }
	
	public void NavBarnext() {
		NextPaginationbtn.isDisplayed();
	    }
	
	public void NavBarPrevious() {
		PreviousPaginationbtn.isDisplayed();
	    }

}
