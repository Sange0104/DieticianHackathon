package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPatientsElement_PO {
	
	 WebDriver driver;
	
	
	@FindBy (id="dieticianlogin")WebElement dieticianName;
	@FindBy (id="tabMyPatients")WebElement tabMyPatients;
	@FindBy (id="dieticianSoftware")WebElement dieticiansoftware;
    @FindBy (id="txtMyPatients")WebElement MyPatients;
    
    
    
    public MyPatientsElement_PO() {
    	
    }
    public MyPatientsElement_PO(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements( driver,this);
    	
    }
    public void visibleDietician () {
    	dieticianName.isDisplayed();
    }
    
    public void clickMyPatientsTab() {
    	tabMyPatients.click();
    }
    public void selectMyPatientsTab() {   
    	tabMyPatients.isSelected();
    }
    
    public void Dietician() {   
    	dieticiansoftware.isDisplayed();
    }
    
    public void MyPatientsTab() {   
    	MyPatients.isDisplayed();
    	
    }
    
    
}
