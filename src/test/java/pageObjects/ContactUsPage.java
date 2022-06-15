package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;
	
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "FirstName")
	WebElement firstname;
	
	@FindBy(id = "LastName")
	WebElement lastname;
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Subject")
	WebElement subject;
	
	@FindBy(id = "MessageHere")
	WebElement writeMessage;
	
	@FindBy(id = "btnSubmit")
	WebElement btnSubmit;
	
	@FindBy(id = "Message1")
	WebElement message1;
	
	@FindBy(id = "Message2")
	WebElement message2;
	
	@FindBy(id = "InvalidFirstName")
	WebElement invalidfirstnamemessage;
	
	@FindBy(id = "InvalidLasttName")
	WebElement invalidlastnamemessage;
	
	@FindBy(id = "InvalidEmail")
	WebElement invalidemailmessage;
	
	@FindBy(id = "InvalidSubject")
	WebElement invalidsubjectmessage;
	
	@FindBy(id = "InvalidWriteMessage")
	WebElement invalidwritemessage;

	public void enterFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	public void enterLastName(String lname) {
		lastname.sendKeys(lname);
	}
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	public void enterSubject(String subjct) {
		subject.sendKeys(subjct);
		}
	public void writeyourmessage(String write) {
		writeMessage.sendKeys(write);
	}
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	
	public String getMessage1() {
	return	message1.getText();
	}
	
	public String getMessage2() {
	return	message2.getText();
	}
	
	public String InvalidFirstNamemsg() {
		return	invalidfirstnamemessage.getText();
		}
	
	public String InvalidLasttNamemsg() {
		return	invalidlastnamemessage.getText();
		}
	
	public String InvalidEmailmsg() {
		return	invalidemailmessage.getText();
		}
	
	public String InvalidSubjectmsg() {
		return	invalidsubjectmessage.getText();
		}
	
	public String InvalidWritemsg() {
		return	invalidwritemessage.getText();
		}
	
	public void contactDetails() {
		enterFirstName("John");
		enterLastName("David");
		enterEmail("John@testmail.com");
		enterSubject("Subject line");
		writeyourmessage("Test");
	}
	
	public void invalidfirstName() {
		enterFirstName("John$5g6dh8u");
		enterLastName("David");
		enterEmail("John@testmail.com");
		enterSubject("Subject line");
		writeyourmessage("Test");
	}
	
	public void invalidlastName() {
		enterFirstName("John");
		enterLastName("David*s6tdghdjj");
		enterEmail("John@testmail.com");
		enterSubject("Subject line");
		writeyourmessage("Test");
	}
	
	public void invalidemail() {
		enterFirstName("John");
		enterLastName("David");
		enterEmail("imagevalue@#()*#&*#");
		enterSubject("Subject line");
		writeyourmessage("Test");
	}
	
	public void invalidsubject() {
		enterFirstName("John");
		enterLastName("David");
		enterEmail("John@testmail.com");
		enterSubject("dhd88sdihsduu$#ysdjhweukdjkskdksjdklsd0weddioljdkwejf.we");
		writeyourmessage("Test");
	}
	
	public void invalidwritemsg() {
		enterFirstName("John");
		enterLastName("David");
		enterEmail("John@testmail.com");
		enterSubject("Subject line");
		writeyourmessage("9983873833#@$!%^@*(()_++?><");
	}
}
