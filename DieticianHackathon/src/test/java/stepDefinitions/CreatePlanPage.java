package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePlanPage extends BaseClass{
	
	
	public CreatePlanPage(WebDriver driver) 
	{
		
	}

	@Given("User is logged on to Dietician website")
	public void user_is_logged_on_to_dietician_website() {
		
		cp=new CreatePlanPage(driver);
		driver.getCurrentUrl();
		driver.manage().window().maximize();
	}

	@When("User lands on {string} page")
	public void user_lands_on_page(String string) {
		String title=driver.getTitle();
		Assert.assertEquals("Actual Title", title);
	    
	}

	@Then("User sees the heading {string} on the page")
	public void user_sees_the_heading_on_the_page(String string) 
	{
		String title=cp.isDisplayed();
		String actual_title="Health condition page";
		Assert.assertEquals(title,actual_title);
		driver.getTitle();
	}

	private String isDisplayed() {
		return null;
		
	}










}
