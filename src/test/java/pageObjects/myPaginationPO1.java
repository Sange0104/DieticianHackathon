package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class myPaginationPO1 {
	
	WebDriver driver;
	
    @FindBy (id="actions")WebElement Actions;
	@FindBy (id="txtMyPatients")WebElement MyPatients; 
	 
	@FindBy (id="btnNextpagination")WebElement NextPagination;
	@FindBy (id="btnPreviousPagination")WebElement PreviousPagination; 
	@FindBy (id="extPaginiation")WebElement ExecutePagination;
	
	
public  myPaginationPO1 () {
		
	}

	public  myPaginationPO1 (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
public void patientspage() {
	MyPatients.isDisplayed();
}
	public void enterpagination() {
		ExecutePagination.getSize();
	}
	
	public void clickNext() {
		NextPagination.click();
	}
	
	public void landedonNext() {
		NextPagination.isEnabled();
	}
	public void clickPrevious() {
		PreviousPagination.click();
	}
	
	public void landedonPrevious() {
		PreviousPagination.isEnabled();
	}
}
