package stepDefinitions;

import pageObjects.pdfPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PDF_Steps {

	pdfPO program;
	
@Given("User IS ON {string} page")
public void user_is_on_page(String string) {
	 program = new pdfPO ();
	program.MyPatientsTab();
	
    
}

@When("user clicks on {string}")
public void user_clicks_on(String string) {
	program.btnpatientreport();
}

@Then("PDF is opened in proper readable format")
public void pdf_is_opened_in_proper_readable_format() {
	program.showspatienttest();
}

@Given("User has clicked view PDF button")
public void user_has_clicked_view_pdf_button() {
	program.clkPDF();
}

@When("User is on PDF")
public void user_is_on_pdf() {
	program.OnPDF();
}

@Then("PDF has patients details like patient ID, name, email, address, phone number,")
public void pdf_has_patients_details_like_patient_id_name_email_address_phone_number() {
	program.patient(null);
}

@Then("PDF has doctor details like doc ID, doctor name, email address, clinic or facility name, doctors specialization")
public void pdf_has_doctor_details_like_doc_id_doctor_name_email_address_clinic_or_facility_name_doctors_specialization() {
	program.doctor(null);
}

@Then("PDF shows list of conditions, preferences list, Co-morbidites")
public void pdf_shows_list_of_conditions_preferences_list_co_morbidites() {
	program.infoComorbidites(null);
}

@Then("PDF shows diet menu for {int} days, any warning and comments mentioned by doctor.")
public void pdf_shows_diet_menu_for_days_any_warning_and_comments_mentioned_by_doctor(Integer int1) {
	program.infodiet(null);
}


}
