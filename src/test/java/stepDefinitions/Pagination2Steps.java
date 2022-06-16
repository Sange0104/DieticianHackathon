package stepDefinitions;

import pageObjects.pagination2PO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pagination2Steps {
	
	pagination2PO program;     
	
	@Given("USEr clicks on button {string}")
	public void us_er_clicks_on_button(String string) {
		program = new pagination2PO();
		program.clkpatientreport();
	}

	@When("User is on {string} PAGE")
	public void user_is_on_page(String string) {
		program.showspatientstest();
	}

	@Then("More than {int} records should be displayed on different pages through pagination")
	public void more_than_records_should_be_displayed_on_different_pages_through_pagination(Integer int1) {
	   
	}

	@Given("User clickS ON button {string}")
	public void user_click_s_on_button(String string) {
		program.clkpatientreport();
	}

	@When("User is on {string} pAGE")
	public void user_is_on_p_age(String string) {
		program.showspatientstest();
	}

	@Then("Pagination has {string} link")
	public void pagination_has_link(String string) {
		program.NavBarnext();
		program.NavBarPrevious();
	}

	@Given("User CLicks on button {string}")
	public void user_c_licks_on_button(String string) {
		program.clkpatientreport();
	}

	@When("User is on {string} Page")
	public void user_is_on_Page(String string) {
		program.showspatientstest();
	}


}
