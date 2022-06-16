package stepDefinitions;

import pageObjects.patientsInfoPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class patientsInformatiomSteps {
	
	patientsInfoPO program;
	
	
	@Given("User has searched patients")
	public void User_has_searched_patients() {
		program = new patientsInfoPO ();
		program.AfterSearch();
	}

	@When("Patients RECORDS are displayed")
	public void patients_Records_are_displayed() {
		program.RecordName(null);
	}

	@Then("Customer Id is shown in column {string} column")
	public void customer_id_is_shown_in_column_column(String string) {
		program.CustomerId(null);
	}

	@Given("user has searched patients")
	public void user_has_searched_patients() {
		program.AfterSearch();
	}

	@When("Patients records ARE Displayed")
	public void patients_records_Are_displayed() {
		program.RecordDetails(null);
	}

	@Then("Patient's name is displayed in 'Name' column")
	public void patient_s_name_is_displayed_in_name_column() {
		program.RecordName(null);
	}

	@Given("User Has searched patients")
	public void user_Has_searched_patients() {
		program.AfterSearch();
	}

	@When("Patients Records are Displayed")
	public void Patients_Records_are_Displayed() {
		program.RecordNumber();
	}

	@Then("Details column shows patient's email or phone number or address")
	public void details_column_shows_patient_s_email_or_phone_number_or_address() {
	  program.RecordDetails(null);
	}

	@Given("User has Searched patients")
	public void user_has_Searched_patients() {
		program.AfterSearch();
	}

	@When("Patients records Are displayed")
	public void Patients_records_are_displayed() {
		program.RecordDetails(null);
	}

	@Then("Last visit date is shown in valid date format")
	public void last_visit_date_is_shown_in_valid_date_format() {
		program.LastVisit(null);
		return;
	}

	@Given("User has searched Patients")
	public void user_has_searched_Patients() {
		program.AfterSearch();
	}

	@When("patients records are displayed")
	public void patients_records_are_displayed() {
		program.RecordDetails(null);
	}

	@Then("Verify that email address is in valid format in details cloumn.")
	public void verify_that_email_address_is_in_valid_format_in_details_cloumn() {
		program.verifyRecordDetails(null);
	}

	@Given("PATIENTS records are displayed")
	public void PATIENTS_records_are_displayed() {
		program.RecordDetails(null);
		return;
	}

	@When("User clicks on button {string}")
	public void user_clicks_on_button(String string) {
		program.AfterSearch();
	}

	@Then("It redirects user to {string} page")
	public void it_redirects_user_to_page(String string) {
		program.RecordDetails(string);
	}

	@Given("Patients records are DISPLAYED")
	public void patients_records_are_DISPLAYED() {
		program.verifyRecordDetails(null);
	}

	@Given("Patients Records are displayed")
	public void Patients_Records_are_displayed() {
		program.RecordDetails(null);
	}


}
