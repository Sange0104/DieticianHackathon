package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginationTeamPageObjects {
	WebDriver driver;
	
	@FindBy(id="a-icon-Next")
	WebElement clickNext;
	
    @FindBy(id="a-icon-Previous")
    WebElement clickPrevious;
    
    @FindBy(id="doctorName")
    WebElement doctorName;
    
   
    	public PaginationTeamPageObjects(WebDriver driver) {
    		this.driver = driver;
    		PageFactory.initElements(driver,this);
    	}
    	
     	public void clickNext() {
    		clickNext.click();
    	}
    	
    	public void landedonNext() {
    		clickNext.isEnabled();
    	}
    	public void clickPrevious() {
    		clickPrevious.click();
    	}
    	
    	public void landedonPrevious() {
    		clickPrevious.isEnabled();
    	}
    	    	
    	public void getDoctorName() {
    		doctorName.getText();
    		doctorName.isDisplayed();
    	}
   }


