package stepDefinitions;

import pageObjects.MyPatientsElement_PO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyPatients_steps {
	
	     
	MyPatientsElement_PO program;
	
	
	@Given("User is on any page after login")
	public void user_is_on_any_page_after_login() {
	   program= new MyPatientsElement_PO();
	   program.visibleDietician();
	}

	@When("User clicks on My Patients tab")
	public void user_clicks_on_my_patients_tab() {
		program.MyPatientsTab();
	}

	@Then("My Patients tab is selected or highlighted")
	public void my_patients_tab_is_selected_highlighted() {
		program.clickMyPatientsTab();
	}

	@Then("It shows breadcrubs as Dietician Software or MyPatients")
	public void it_shows_breadcrubs_as_dietician_software_my_patients() {
		program.Dietician();
	}

	@Then("Page title is displayed as My Patients")
	public void page_title_is_displayed_as_my_patients() {
		program.MyPatientsTab();
	}

}
