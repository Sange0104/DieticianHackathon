package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.ContactUsPage;
import pageObjects.HomePageObjects;

public class ContactUs {
	WebDriver driver;
	HomePageObjects homepg;
	ContactUsPage contact;

	@Given("User is on Contact Us Page")
	public void user_is_on_contact_us_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	  // driver.get("https://www.dietician.com");
	   driver.get("");
	   driver.manage().window().maximize();
	   homepg.clicklnkContactUs();
	}

	@When("User enters submit button with all fields empty")
	public void user_enters_submit_button_with_all_fields_empty() {
		contact = new ContactUsPage(driver);
		contact.clickSubmit();
	}

	@Then("User should get a message\"Please fill all fields above\"")
	public void user_should_get_a_message_please_fill_all_fields_above() {
	   String Validatemsg1= contact.getMessage1();
	   assertEquals(Validatemsg1, "Please fill all the fields ");
	
	   
	}
	
	@When("User enters all valid values in fields and click submit button")
	public void user_enters_all_valid_values_in_fields_and_click_submit_button() {
		contact.contactDetails();
		contact.clickSubmit();
		
	}

	@Then("User should get a message\"Your Request is Submitted\"")
	public void user_should_get_a_message_your_request_is_submitted() {
		 String Validatemsg2= contact.getMessage2();
		   assertEquals(Validatemsg2, "Your Request is Submitted ");
	}

	@When("User enters first name with some numeric values and other fields with valid values and clicks submit button")
	public void user_enters_first_name_with_some_numeric_values_and_other_fields_with_valid_values_and_clicks_submit_button() {
	   contact.invalidfirstName();
	   contact.clickSubmit();
	}

	@Then("User should get a message\"Please fill first name with charactersof maximum {int} characters long\"")
	public void user_should_get_a_message_please_fill_first_name_with_charactersof_maximum_characters_long(Integer int1) {
	    String Validatemsg3 = contact.InvalidFirstNamemsg();
	   String Actualmsg3 ="Please fill first name with charactersof maximum 10 characters long";
	    assertEquals(Validatemsg3,Actualmsg3);
	}

	@When("User enters last name with some numeric values and other fields with valid values and clicks submit button")
	public void user_enters_last_name_with_some_numeric_values_and_other_fields_with_valid_values_and_clicks_submit_button() {
	    contact.invalidlastName();
	    contact.clickSubmit();
	}

	@Then("User should get a message\"Please fill last name with charactersof maximum {int} characters long\"")
	public void user_should_get_a_message_please_fill_last_name_with_charactersof_maximum_characters_long(Integer int1) {
		String Validatemsg4 = contact.InvalidLasttNamemsg();
		String Actualmsg4 = "Please fill Last Name with charactersof maximum 10 characters long";
		assertEquals(Validatemsg4,Actualmsg4);
	}

	@When("User enters Email with some image values and other fields with valid values and click submit button")
	public void user_enters_email_with_some_image_values_and_other_fields_with_valid_values_and_click_submit_button() {
	    contact.invalidemail();
	    contact.clickSubmit();
	}

	@Then("User should get a message\"Please fill Email field with character,numeric and special character combinations\"")
	public void user_should_get_a_message_please_fill_email_field_with_character_numeric_and_special_character_combinations() {
		String Validatemsg5 = contact.InvalidEmailmsg();
		String Actualmsg5= "Please fill Email field with character,numeric and special character combinations";
		assertEquals(Validatemsg5,Actualmsg5);
	}

	@When("User enters subject with some numeric values and other fields with valid values and clicks submit button")
	public void user_enters_subject_with_some_numeric_values_and_other_fields_with_valid_values_and_clicks_submit_button() {
	    contact.invalidsubject();
	    contact.clickSubmit();
	}

	@Then("User should get a message\"Please fill Subject field with some chacters of maximum {int} letters length\"")
	public void user_should_get_a_message_please_fill_subject_field_with_some_chacters_of_maximum_letters_length(Integer int1) {
		String Validatemsg6 = contact.InvalidSubjectmsg();
		String Actualmsg6 = "Please fill Subject field with some chacters of maximum 20 letters length";
		assertEquals(Validatemsg6,Actualmsg6);
	}

	@When("User enters {string} with some numeric values and other fields with valid values and clicks submit button")
	public void user_enters_with_some_numeric_values_and_other_fields_with_valid_values_and_clicks_submit_button(String string) {
	    contact.invalidwritemsg();
	    contact.clickSubmit();
	}

	@Then("User should get a message\"Please fill \"Write your Message here\" field with  alphabet characters  of maximum {int} length\"")
	public void user_should_get_a_message_please_fill_write_your_message_here_field_with_alphabet_characters_of_maximum_length(Integer int1) {
		String Validatemsg7 = contact.InvalidWritemsg();
		String Actualmsg7 = "Please fill Write your Message here field with  alphabet characters  of maximum 200 length";
		assertEquals(Validatemsg7,Actualmsg7);
	}
	
}
