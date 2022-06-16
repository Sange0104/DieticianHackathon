package stepDefinitions;

import pageObjects.myPaginationPO1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class pagination1Steps {
	
	myPaginationPO1 program;
	
	@Given("Patients records are displayed")
	public void Patients_records_are_displayed() {
	   program = new myPaginationPO1 ();
	}

	@When("Records are more than {int}")
	public void records_are_more_than(Integer int1) {
	   program.enterpagination();
	}

	@Then("It must show pagination links")
	public void it_must_show_pagination_links() {
	   program.enterpagination();
	}

	@Given("patients recordS are displayed")
	public void patients_recordS_are_displayed() {
	   program.patientspage();
	}

	@When("User clicks on next pagination link")
	public void user_clicks_on_next_pagination_link() {
	  program.clickNext();
	}

	@Then("It goes to next page and shows different patients on that page")
	public void it_goes_to_next_page_and_shows_different_patients_on_that_page() {
		program.landedonNext();
	}

	@Given("Patients records are Displayed")
	public void patients_records_are_displayed() {
		program.patientspage();
	}

	@When("User clicks on previous pagination link")
	public void user_clicks_on_previous_pagination_link() {
		program.clickPrevious();
	}

	@Then("It goes to previous page")
	public void it_goes_to_previous_page() {
		program.landedonPrevious();
	}


}
