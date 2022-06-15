package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ButtonPlanPage {

	WebDriver driver;
	ButtonPlanPage bp;
	private Object btnBrowse;
	
	@Then("User should see a button with name \"Browse\" on the page")
	public void user_should_see_a_button_with_name_browse_on_the_page() 
	{}

	@Then("User should see a tool tip {string} for the Browse button")
	public void user_should_see_a_tool_tip_for_the_browse_button(String string) {}

	@Given("User is on {string} page")
	public void user_is_on_page(String string) 
	{
		bp=new ButtonPlanPage();
		driver.get("url");
		driver.manage().window().maximize();
	}

	@When("User clicks the Browse button and selects a document")
	public void user_clicks_the_browse_button_and_selects_a_document() 
	{
	   ((WebElement) bp.btnBrowse).click();
		//driverbtnBrowse.click();
	}

	@Then("User should see the selected document in the field next to the Browse button on the page")
	public void user_should_see_the_selected_document_in_the_field_next_to_the_browse_button_on_the_page() 
	{
		String selected_document=((WebElement) bp).getText();
		String message=" Selected document in the field";

		if (message.equals(selected_document))
		{
			System.out.println("Selected doucment is visible");
		}
		else
		{
			System.out.println("Not visibile");
		}
	}

}
