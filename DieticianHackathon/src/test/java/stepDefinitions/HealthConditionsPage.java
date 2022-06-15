package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Create_Diet_Plan;

public class HealthConditionsPage 
{
	
	Create_Diet_Plan hcp;
	WebDriver driver;
	
	@Then("User should see option {int} menu to update the health conditions")
	public void user_should_see_option_menu_to_update_the_health_conditions(Integer int1) 
	{
	  hcp.btnoption1();
	 System.out.println("User updates the health conditions");
    }

	@Then("User should see a button with text {string} in option {int} menu")
	public void user_should_see_a_button_with_text_in_option_menu(String string, Integer int1) 
	{
		hcp.btnoption1();
		String title=hcp.isDisplayed();
		String actual_title="Health condition page";
		Assert.assertEquals(title,actual_title);
	}

	@Then("User can update the health conditions in option {int} menu")
	public void user_can_update_the_health_conditions_in_option_menu(Integer int1) 
	{
	    hcp.btnUpload();
		driver.getPageSource();
		System.out.println("User can update the health conditions in option");
	}

	@When("User clicks the CONFIRM button in option {int} menu")
	public void user_clicks_the_confirm_button_in_option_menu(Integer int1) 
	{
	    hcp.btnconfirm();
	    System.out.println("User clicks the CONFIRM button in option");
	}

	@Then("User cannot update the health conditions in option {int} menu")
	public void user_cannot_update_the_health_conditions_in_option_menu(Integer int1) {
	   hcp.btnoption2();
	   System.out.println("User cannot update the health conditions in option");
	}

	@When("User clicks the CONFIRM button in option {int}")
	public void user_clicks_the_confirm_button_in_option(Integer int1) 
	{
	  hcp.btnconfirm2();
	  System.out.println("User clicks the CONFIRM button in option");
	}

	@Then("User should see a button with text {string}  at the bottom of the page")
	public void user_should_see_a_button_with_text_at_the_bottom_of_the_page(String string) {
	   hcp.highlightedtexttab();
	   System.out.println("User should see a button with text {string}  at the bottom of the page");
	}

	@When("User clicks the GENERATE MENU button")
	public void user_clicks_the_generate_menu_button() 
	{
    hcp.GenerateMenu();
    System.out.println("User clicks the GENERATE MENU button");
	}

	@Then("New Diet plan should be generated with the latest confirmed Health conditions")
	public void new_diet_plan_should_be_generated_with_the_latest_confirmed_health_conditions() 
	{
     hcp.condition4();
     System.out.println("New Diet plan should be generated with the latest confirmed Health conditions");
	}

	@Then("User should land on {string} page")
	public void user_should_land_on_page(String string) 
	{
     driver.getCurrentUrl();
     System.out.println("User lands on Current url page");
	}

}
