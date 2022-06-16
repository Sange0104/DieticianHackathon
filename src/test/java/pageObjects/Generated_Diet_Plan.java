package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generated_Diet_Plan {
	
	public WebDriver driver;
	public Generated_Diet_Plan(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="home")
	WebElement hometab;

	@FindBy(id="newpatients")
	WebElement newpatientstab;
	
	@FindBy(id="mypatients")
	WebElement mypatientstab;

	@FindBy(id="dietPlans")
	WebElement dietPlanstab;

	@FindBy(id="Plan-Id")
	WebElement planid;

	@FindBy(id="customerdetails")
	WebElement customerdetails;

	@FindBy(id="dietplan")
	WebElement  dietplan;

	@FindBy(id="plangeneratedtime")
	WebElement plangeneratedtime;

	@FindBy(id="comments")
	WebElement comments;
	
	
	
	
	public void hometab()
	{
		hometab.click();
	}
	public  void clickonnewpatientstab()
	{
		newpatientstab.click();
	}
	public  void clickonmypatientstab()
	{
		mypatientstab.click();
	}
	
	public  void clickondietPlanstab()
	{
		dietPlanstab.click();
	}
	
	
	public  void planid()
	{
		planid.sendKeys("int");
	}
	
	public  void  customerdetails()
	{
		customerdetails.sendKeys("String");
	}
	
	public  void dietplan()
	{
		dietplan.click();
	}
	
	public  void plangeneratedtime()
	{
		plangeneratedtime.sendKeys("String");
		 
	}
	public  void comments()
	{
		comments.sendKeys("String");
		 
	}
	
	
	
}
