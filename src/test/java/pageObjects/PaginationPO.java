package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginationPO 
{
	
	public WebDriver driver;
	public  PaginationPO (WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
   
	@FindBy (id="txtMyPatients")
	WebElement MyPatients; 
	@FindBy (id="btnNextpagination")
	WebElement NextPagination;
	@FindBy (id="btnPreviousPagination")
	WebElement PreviousPagination; 
	@FindBy (id="extPaginiation")
	WebElement ExecutePagination;
	@FindBy (id="firstpage")
	WebElement firstpage;
	@FindBy (id="lastpage")
	WebElement lasttpage;
	@FindBy(id="viewpdf")
	WebElement viewpdf;
	@FindBy(id="downloadpdf")
	WebElement downloadpdf;
	
	
	
	public void enterpagination() 
	{
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
	
	public void firstpage() {
		firstpage.isDisplayed();
	}
	public void lastpage() {
		lasttpage.isDisplayed();
	}
	public void clickonViewPDF()
	{
		viewpdf.click();
	}
	
	
	public void DownloadPDF()
	{
		downloadpdf.click();
	}
	
}
