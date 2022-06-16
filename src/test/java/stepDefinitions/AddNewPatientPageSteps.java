package stepDefinitions;

import pageObjects.AddNewPatientPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewPatientPageSteps {
	
	AddNewPatientPage program;
	
	@Given("User is on the Add New Patient Page")
	public void User_is_on_the_add_new_patient_page() {
		program = new AddNewPatientPage();
		program.AddNewPatientPage();
	}

	@When("User wants to enter New Patient details")
	public void user_wants_to_enter_new_patient_details() {
		program.newpatient();
	}

	@Then("Patient Data From is visible")
	public void patient_data_from_is_visible() {
		program.patientdata();

	}

	@Given("User is on the Add New Patient page")
	public void user_is_on_the_add_new_patient_page() {
		program.AddNewPatientPage();
	
	}

	@When("User attempts to submit the form without filling up mandatory fields")
	public void user_attempts_to_submit_the_form_without_filling_up_mandatory_fields() {
		program.equals(program);
	
	}

	@Then("Unable to update and show {string} error message")
	public void unable_to_update_and_show_error_message(String string) {
		program.errormessage();
	
	}

	@When("User attempts to put numeric value in {string} field")
	public void user_attempts_to_put_numeric_value_in_field(String string) {
		program.isNumeric(string);
	
	}

	@Then("Unable to enter and show {string} error message")
	public void unable_to_enter_and_show_error_message(String string) {
		program.errormessage();

	}

	@When("User does not put space in between  First Name and Last Name  for {string} field")
	public void user_does_not_put_space_in_between_first_name_and_last_name_for_field(String string) {
		program.invalidcharacters(string);
	}
	

	@When("User attempts to submit the form without filling up {string} field")
	public void user_attempts_to_submit_the_form_without_filling_up_field(String string) {
		program.emptyform();

	}

	@When("User does not enter any value in {string} field")
	public void user_does_not_enter_any_value_in_field(String string) {
		program.emptyform();
	 
	}

	@When("User attempts to submit the form without selecting any value for {string} field")
	public void user_attempts_to_submit_the_form_without_selecting_any_value_for_field(String string) {
		program.selectupdate();
		
		
	}

	@When("User entered not supported data format in {string} field")
	public void user_entered_not_supported_data_format_in_field(String string) {
		program.invaliddataformat();
	
	}

	@When("User attempts to put characters in {string} field")
	public void user_attempts_to_put_characters_in_field(String string) {
		program.invalidcharacters(string);
	
	}

	@When("User fills up the form with Valid Data Inputs")
	public void user_fills_up_the_form_with_valid_data_inputs() {
		program.validpatientdetails();
	
	}

	@Then("User can see {string} button")
	public void user_can_see_button(String string) {
		program.toString();
	
	}

	@When("User clicks on the {string} button after entering valid Patient data")
	public void user_clicks_on_the_button_after_entering_valid_patient_data(String string) {
		program.strbutton();
	
	}

	@Then("User lands on {string} page with the {string} details displayed")
	public void user_lands_on_page_with_the_details_displayed(String string, String string2) {
		program.validpatientdetails();

	}



}
