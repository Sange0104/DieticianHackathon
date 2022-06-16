package stepDefinitions;

import pageObjects.P_TestReportsPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class patientsTest_ReportsSteps {
	
	
	P_TestReportsPO program;
	
	@Given("User has searched patients after login")
	public void user_has_searched_patients_after_login() {
		program = new P_TestReportsPO();
		program.AfterLoginAs();
		
	}

	@When("User is on {string} page")
	public void user_is_on_page(String string) {
		program.patientpg();
	}

	@Then("My Patients tab is sElected or highlighted")
	public void my_patients_tab_is_s_elected_or_highlighted() {
		program.clkpatientpg();
	}

	@Then("It shows breadcrubs as Dietician Software or View Recent Test Reports")
	public void it_shows_breadcrubs_as_dietician_software_or_view_recent_test_reports() {
		program.btnpatientreport();
	}

	@Then("Title is displayed as 'View Patient Test Reports")
	public void title_is_displayed_as_view_patient_test_reports() {
		program.showspatienttest();
		return;
	}

	@Given("User clicks ON button {string}")
	public void user_clicks_on_button(String string) {
		program.btnpatientreport();

	}

	@Then("It displays primary information like patient Id  number, name, email address, Phone number, Address")
	public void it_displays_primary_information_like_patient_id_number_name_email_address_phone_number_address() {
		program.colmDetails(null);
        return;
	}

	@Given("User Clicks on button {string}")
	public void user_Clicks_on_button(String string) {
		program.clkpatientpg();
	}

	@Then("It displays patient's old and latest test reports")
	public void it_displays_patient_s_old_and_latest_test_reports() {
		program.PreTestRep();
	}

	@Given("User clicks on button VIEW Previous Test Reports")
	public void user_clicks_on_button_view_previous_test_reports() {
		program.btnpatientreport();
	}

	@Then("It shows column heading as Record number, Doc-ID, File Uploaded time, File or Report name, Identified health conditions")
	public void it_shows_column_heading_as_record_number_doc_id_file_uploaded_time_file_or_report_name_identified_health_conditions() {
		program.headerfiledata();
		program.upload();
		program.NPN();
		program.fileName();
		program.identifedhealth();
	}


}
