package stepDefinitions;

import pageObjects.DieticianHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DietitianHomePageSteps {
	
	  
	DieticianHomePage program;
	 
	@Given("User is on the Dietitian web site")
	public void user_is_on_the_dietitian_web_site() {
      program = new DieticianHomePage();
      program.DieticianPage();
	}

	@When("User logged in successfully to the Dietitian web site")
	public void user_logged_in_successfully_to_the_dietitian_web_site() {
		program.clickOnsignin();
	
	}

	@Then("User can see the Home button on header menu")
	public void user_can_see_the_home_button_on_header_menu() {
		program.clickOnhome();
	
	}

	@Then("User can see the {string} tab from the header menu")
	public void user_can_see_the_tab_from_the_header_menu(String string) {
		program.header();
	
	}

	@Given("User is on the Dietitian Home page")
	public void user_is_on_the_dietitian_home_page() {
		program.DieticianPage();
	
	}

	@When("User selects New patient button")
	public void user_selects_new_patient_button() {
		program.selectnewpatient();
	
	}

	@Then("User lands on New Patient page")
	public void user_lands_on_new_patient_page() {
		program.newpatient();
	
	}

	@Then("User lands on New patient button")
	public void user_lands_on_new_patient_button() {
		program.newpatient();
	
	}

	@When("User selects My Patient button")
	public void user_selects_my_patient_button() {
		program.selectnewpatient();
	
	}

	@Then("User lands on My Patient page")
	public void user_lands_on_my_patient_page() {
		program.newpatient();

	}

	@Given("Clicking Diet Plans Page After Login")
	public void clicking_diet_plans_page_after_login() {
		program.dietplanspage();
	
	}

	@When("User selects Diet Plans button")
	public void user_selects_diet_plans_button() {
		program.selectdietplans();
	
	}

	@Then("User lands on Diet Plans page")
	public void user_lands_on_diet_plans_page() {
		program.dietplanspage();
	
	}

	@Then("User can see {string} section in right side bar")
	public void user_can_see_section_in_right_side_bar(String string) {
		program.section();

	}

	@Then("User can see {string} message in top of right side bar")
	public void user_can_see_message_in_top_of_right_side_bar(String string) {
		program.messagebar(string);
	
	}

	@Then("User can read Dietitian Home page image and content")
	public void user_can_read_dietitian_home_page_image_and_content() {
		program.imagecontent();
    }

	@When("User can see {string} button after successful login")
	public void user_can_see_button_after_successful_login(String string) {
		program.toString();
	
	}

	@Then("User can click on {string} button for logging off successfully")
	public void user_can_click_on_button_for_logging_off_successfully(String string) {
		program.successfullogin(string);
		
	
	}



}
