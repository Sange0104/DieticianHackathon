package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegistrationPage;
import PageObjects.SigninPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class SigninSteps {
	
	public WebDriver driver;
	public SigninPage sp;
	private Object url;
	
	@Given("User is on Dietician website")
	public void user_is_on_dietician_website() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		sp  = new SigninPage(driver);
	}

	@When("User click on icon symbol on Sign In Page")
	public void user_click_on_icon_symbol_on_sign_in_page() {
	 Assert.assertTrue(true);
	    
	}

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String string) {
		driver.getTitle();
	    
	}

	@When("User is on Sign In Page")
	public void user_is_on_sign_in_page() {
		driver.getCurrentUrl();
	    
	}

	@Then("User should see all mandatory flields with star symbol on top of those fields")
	public void user_should_see_all_mandatory_flields_with_star_symbol_on_top_of_those_fields() {
		driver.getPageSource();
	    
	}

	@When("User lands on Sign In page")
	public void user_lands_on_sign_in_page() {
		driver.navigate();
	    
	}

	@Then("User should see a form with heading {string}, to sign In using Username")
	public void user_should_see_a_form_with_heading_to_sign_in_using_username(String username) {
		sp.setUsername();
	   
	}

	@Then("User should see a button with text {string} in the Sign In form")
	public void user_should_see_a_button_with_text_in_the_sign_in_form(String string) {
	    
	}

	

	@When("User clicks Sign In Button in the Sign In form with all fields empty")
	public void user_clicks_sign_in_button_in_the_sign_in_form_with_all_fields_empty() {
	    
	}

	@Then("User should get error message\"Please fill out the fields\"")
	public void user_should_get_error_message_please_fill_out_the_fields() {
	    
	}

	@When("User clicks on Forgot Password button")
	public void user_clicks_on_forgot_password_button() {
	    sp.clickPassword();
	}

	@Then("User should be directed to  \"Reset password\"link")
	public void user_should_be_directed_to_reset_password_link() {
	    sp.clickforgotPassword();
	}

	@When("User clicks on \"not member yet \"button")
	public void user_clicks_on_not_member_yet_button() {
		sp.clicknotamemberyet();
	    
	}

	@Then("User will land on Register Page")
	public void user_will_land_on_register_page() {
	    
	}

	@When("User clicks Sign In with all field entered")
	public void user_clicks_sign_in_with_all_field_entered() {
	    
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
	    
	}

	@Then("User should see a form with heading {string} form\", to sign In using email")
	public void user_should_see_a_form_with_heading_form_to_sign_in_using_email(String string) {
	   sp.clickemail();
	}

	@When("User clicks Log In button with all fields empty")
	public void user_clicks_log_in_button_with_all_fields_empty() {
	    
	}

	@Then("User gets  error message {string}")
	public void user_gets_error_message(String string) {
	    
	}

	@When("User clicks Log In button with invalid email and valid password")
	public void user_clicks_log_in_button_with_invalid_email_and_valid_password() {
	    
	}

	@Then("User should see message {string}")
	public void user_should_see_message(String string) {
	    
	}

	@When("User clicks Log In button with valid email and invalid password")
	public void user_clicks_log_in_button_with_valid_email_and_invalid_password() {
	    
	}

	@Then("User gets a message {string}")
	public void user_gets_a_message(String string) {
	    
	}

	@When("User clicks Log In button with valid email and empty password")
	public void user_clicks_log_in_button_with_valid_email_and_empty_password() {
	    
	}

	@Then("User gets a message\"Please fill the password\"")
	public void user_gets_a_message_please_fill_the_password() {
	    
	}

	@When("User clicks Log In with both invalid email and password")
	public void user_clicks_log_in_with_both_invalid_email_and_password() {
	   
	}

	@Then("User gets error message message {string}")
	public void user_gets_error_message_message(String string) {
	    
	}

	@When("User clicks Log In with both valid email and password")
	public void user_clicks_log_in_with_both_valid_email_and_password() {
	   
	}

	@Then("User gets a message\"logged in successfully\"and sees signout button")
	public void user_gets_a_message_logged_in_successfully_and_sees_signout_button() {
	   
	}

	@Then("User is redirected to reset password link")
	public void user_is_redirected_to_reset_password_link() {
	    sp.clickrestpassword();
	}

	@When("User clicks\"Facebook\" button to log in")
	public void user_clicks_facebook_button_to_log_in() {
	    sp.clickonloginbtn();
	}

	@Then("User is redirected to Facebook  login Page")
	public void user_is_redirected_to_facebook_login_page() {
	   sp.clickfacebook();
	}

	@When("User clicks \"Google\"button to log in")
	public void user_clicks_google_button_to_log_in() {
	    
	}

	@Then("User is redirected to Google logIn page")
	public void user_is_redirected_to_google_log_in_page() {
	    
	}

	@When("User clicks sign up link")
	public void user_clicks_sign_up_link() {
	    sp.clickonsignuphere();
	}

	@Then("User is redirected to Register Page")
	public void user_is_redirected_to_register_page() {
	    sp.clickgoogle();
	}


}
