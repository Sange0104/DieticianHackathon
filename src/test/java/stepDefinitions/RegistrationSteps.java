package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationSteps {
	public WebDriver driver;
	public RegistrationPage Rp;
	
	@Given("User is on Dietician Website")
	public void user_is_on_dietician_website() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("WebDriver.chrome.driver",System.getProperty("user"));
	   driver=new ChromeDriver();
	   Rp = new RegistrationPage(driver);
	}

	@When("User lands on Register Page")
	public void user_lands_on_register_page() {
		driver.get(null);
	    
	}

	@Then("User should see the title of the page as Register")
	public void user_should_see_the_title_of_the_page_as_register() {
		driver.getTitle();
	   
	}

	@Given("User is on Register page")
	public void user_is_on_register_page() {
		driver.get(null);
	    
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering a value that is different than the Password field value valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_a_value_that_is_different_than_the_password_field_value_valid_values_for_the_remaining_fields() {
	   driver.getPageSource();
	}

	@When("User clicks SIGN UP Button in the Sign Up with your Email form  by entering valid values forthe all fields")
	public void user_clicks_sign_up_button_in_the_sign_up_with_your_email_form_by_entering_valid_values_forthe_all_fields() {
		driver.toString();
	   
	}

	@When("User clicks Facebook Button in the Sign Up with your Email form")
	public void user_clicks_facebook_button_in_the_sign_up_with_your_email_form() {
	   driver.switchTo();
	}

	@Then("User successfully login with Facebook account")
	public void user_successfully_login_with_facebook_account() {
		 driver.switchTo();
	}

	@When("User clicks Google Button in the Sign Up withyour Email form")
	public void user_clicks_google_button_in_the_sign_up_withyour_email_form() {
		 driver.switchTo();
	}

	@Then("User successfully login with Google account")
	public void user_successfully_login_with_google_account() {
		driver.get(null);
	    
	}

	@When("User clicks {string} link")
	public void user_clicks_link(String url) {
	   
	}

	@Then("User is re-directed to Sign In Page")
	public void user_is_re_directed_to_sign_in_page() {
	   
	}
}
