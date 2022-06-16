package stepDefinitions;

import pageObjects.testDataPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testReportsDataSteps {
	
	testDataPO program;
	
	@Given("User clickS on button {string}")
	public void user_click_s_on_button(String string) {
		program = new testDataPO();
		program.btnpatientreport();
	}

	@When("User is oN {string} page")
	public void user_is_o_n_page(String string) {
		program.pagepatienttest();
	}

	@Then("Every record shows {string} option")
	public void every_record_shows_option(String string) {
		program.NRN(string);
		return;
	}

	@Given("UseR clicks on button {string}")
	public void use_r_clicks_on_button(String string) {
	   program.btnpatientreport();
	}

	@When("UseR is on {string} page")
	public void use_r_is_on_page(String string) {
		program.pagepatienttest();
	}

	@Then("Every report has Doc Id")
	public void every_report_has_doc_id() {
		program.docId(null);
		return;
	}
	

	@Given("User cLicks on button {string}")
	public void user_c_licks_on_button(String string) {
		program.btnpatientreport();
	}

	@When("User is On {string} page")
	public void user_is_On_page(String string) {
		program.pagepatienttest();
	}

	@Then("Every report shows file upload time")
	public void every_report_shows_file_upload_time() {
		program.upload(null);
		return;
	}

	@Given("User clicks on buttoN {string}")
	public void user_clicks_on_butto_n(String string) {
		program.btnpatientreport();
	}

	@When("User iS on {string} page")
	public void user_i_s_on_page(String string) {
		program.pagepatienttest();
	}

	@Then("File uploaded time is shown in correct date and time format")
	public void file_uploaded_time_is_shown_in_correct_date_and_time_format() {
	 program.upload(null);
	}

	@Given("USER clicks on button {string}")
	public void user_clicks_on_button(String string) {
		program.btnpatientreport();
	}

	@When("USEr is on {string} page")
	public void us_er_is_on_page(String string) {
		program.pagepatienttest();
	}

	@Then("Uploaded time field shows age of file upload in seconds or minutes or hour or days or months or years")
	public void uploaded_time_field_shows_age_of_file_upload_in_seconds_or_minutes_or_hour_or_days_or_months_or_years() {
		program.upload(null);
	}

	@Given("User clicks on button View PreviouS Test Reports")
	public void user_clicks_on_button_view_previou_s_test_reports() {
		program.btnpatientreport();
	}

	@When("User is on VieW Patient Test Reports page")
	public void user_is_on_vie_w_patient_test_reports_page() {
		program.pagepatienttest();
	}

	@Then("Every report has its name")
	public void every_report_has_its_name() {
		program.fileName(null);
	}

	@Given("User clicks on button View Previous Test ReportS")
	public void user_clicks_on_button_view_previous_test_report_s() {
		program.btnpatientreport();
	}

	@When("User IS on {string} page")
	public void user_is_on_page(String string) {
		program.pagepatienttest();
	}

	@Then("Every report shows identified conditions from its test report file")
	public void every_report_shows_identified_conditions_from_its_test_report_file() {
		program.identifedhealth(null);
	}


}
