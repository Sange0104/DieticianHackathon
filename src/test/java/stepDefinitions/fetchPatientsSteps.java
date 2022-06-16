package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.fetchPatient_PO;



public class fetchPatientsSteps {
	
	 fetchPatient_PO program;
	
	
	@Given("User will be on my patients")
	public void User_will_be_on_my_patients() {
		
		program= new fetchPatient_PO();
		
		program.MyPatientsPage();
	}

	@When("User types in anything other than in phone number field")
	public void user_types_in_anything_other_than_in_phone_number_field() {
	   program.typesPhoneNo(null);
	}

	@Then("It must throw error message and discontinue search action.")
	public void it_must_throw_error_message_and_discontinue_search_action() {
		program.DiscontinueSearch();
	}

	@Given("User will be on my Patients")
	public void user_will_be_on_my_Patients() {
		program.MyPatientsPage();
	}

	@When("User types in anything other valid character in email address field")
	public void user_types_in_anything_other_valid_character_in_email_address_field() {
		program.typesEmailId(null);
	}

	@Given("User will Be on a my Patients")
	public void user_will_Be_on_a_my_patients() {
		program.MyPatientsPage();
	}

	@When("User types in anything other alphabets in name field")
	public void user_types_in_anything_other_alphabets_in_name_field() {
		program.typeName(null);
	}

	@Given("User will BE on a My patients")
	public void user_will_BE_on_a_my_patients() {
		program.MyPatientsPage();
	}

	@When("User clicks on search button with all fields empty")
	public void user_clicks_on_search_button_with_all_fields_empty() {
	   program.clickSearch();
	}

	@Then("Displays all patients for that dietician only")
	public void displays_all_patients_for_that_dietician_only() {
		program.MyPatientsPage();
	}

	@Given("User Will be on a my Patients")
	public void user_will_be_on_a_my_patients() {
		program.MyPatientsPage();
	}

	@When("User clicks on search button with or without all fields empty")
	public void User_clicks_on_search_button_with_or_without_all_fields_empty() {
		program.DiscontinueSearch();
	}

	@Then("It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions")
	public void it_shows_columns_name_like_record_number_cust_id_name_details_last_visit_and_actions() {
		program.visibleRecordNumber();
		program.visibleCustId();
		program.visibleRecordName();
		program.visibleRecordDetails();
		program.visibleLastVisit();
		program.visibleActions();
	}

	@Given("User will be on My Patients")
	public void user_will_be_on_my_patients() {
		program.MyPatientsPage();
	}

	@When("User clicks on search button with or without all Fields empty")
	public void user_clicks_on_search_button_with_or_without_all_fields_empty() {
		program.clickSearch();
	}

	@Then("It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report or Plan")
	public void it_shows_action_buttons_for_view_previous_test_report_view_previous_diet_plans_create_new_report_or_plan() {
		program.TabTestreport();
		program.TabDietPlan();
		program.TabNewreport();
	}



}
