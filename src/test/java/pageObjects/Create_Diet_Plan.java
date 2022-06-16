package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Diet_Plan{
	WebDriver driver;
	
	
	public Create_Diet_Plan (WebDriver rdriver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="home")
	WebElement hometab;

	@FindBy(id="newpatients")
	WebElement newpatientstab;
	
	@FindBy(id="mypatients")
	WebElement mypatientstab;

	@FindBy(id="dietPlans")
	WebElement dietPlanstab;

	@FindBy(id="btnBrowse")
	WebElement btnBrowse;

	@FindBy(id="Upload")
	WebElement btnUpload;

	@FindBy(id="condition1")
	WebElement  condition1;

	@FindBy(id="condition2")
	WebElement condition2;

	@FindBy(id="condition3")
	WebElement condition3;
	
	@FindBy(id="condition4")
	WebElement condition4;
	
	@FindBy(id="co-modifiedcondition1")
	WebElement comodifiedcondition1;
	
	@FindBy(id="co-modifiedcondition2")
	WebElement comodifiedcondition2;
	
	@FindBy(id="co-modifiedcondition3")
	WebElement comodifiedcondition3;
	
	@FindBy(id="preference1")
	WebElement preference1;
	
    @FindBy(id="preference2")
	WebElement preference2;
    
	@FindBy(id="preference3")
	WebElement preference3;
    
	@FindBy(id="btnoption1")
	WebElement btnoption1;
    
	@FindBy(id="btnconfirm")
	WebElement btnconfirm;
    
	@FindBy(id="btnoption2")
	WebElement btnoption2;
	
	@FindBy(id="btnconfirm2")
	WebElement btnconfirm2;
	
	@FindBy(id="btnGenerateMenu")
	WebElement btnGenerateMenu;
	
	@FindBy(id="highlightedtext")
	WebElement highlightedtext;
	
	
	
	public void hometab()
	{
		hometab.click();
	}
	public  void newpatientstab()
	{
		newpatientstab.click();
	}
	public  void mypatientstab()
	{
		mypatientstab.click();
	}
	
	public  void dietPlanstab()
	{
		dietPlanstab.click();
	}
	
	
	public  void btnBrowse()
	{
		btnBrowse.click();
	}
	
	public  void  btnUpload()
	{
		 btnUpload.click();
	}
	
	public  void condition1()
	{
		condition1.click();
	}
	
	public  void condition3()
	{
		condition3.click();
		 
	}
	public  void condition4()
	{
		condition4.click();
		 
	}
	public  void comodifiedcondition1()
	{
		comodifiedcondition1.click();
		 
	}
	public  void comodifiedcondition2()
	{
		comodifiedcondition2.click();
		 
	}
	
	public  void comodifiedcondition3()
	{
		comodifiedcondition3.click();
	}
	public  void preference1()
	{
		preference1.click();
		 
	}
	
	public  void  preference2()
	{
		preference2.click();
		 
	}
	
	public  void  preference3()
	{
		preference3.click();
		 
	}
	
	
	public  void btnoption1()
	{
		btnoption1.click();
		 
	}
	
	public  void btnconfirm2()
	{
		btnconfirm2.click();
		 
	}
	
	public  void btnconfirm()
	{
		btnconfirm.click();
		 
	}
	
	public  void btnoption2()
	{
		btnoption2.click();
		 
	}
	public String isDisplayed() {
		
		return null;
	}
	public  void GenerateMenu()
	{
		btnGenerateMenu.click();
		 
	}
	public  void highlightedtexttab()
	{
		highlightedtext.click();
		 
	}
	
	
}
