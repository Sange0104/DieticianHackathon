package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegistrationPage;
import PageObjects.SigninPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class InvalidSigninSteps {
	public WebDriver driver;
	public SigninPage Ip;
	private Object status;
	
	@Given("User is on Sign In Page")
	public void user_is_on_sign_in_page() {
	   driver.get(null);
	}

	@When("User clicks Sign In button entering numeric values for Username and valid values for password")
	public void user_clicks_sign_in_button_entering_numeric_values_for_username_and_valid_values_for_password() {
	   
	}

	@Then("User should get a message Invalid entry for first field")
	public void user_should_get_a_message_invalid_entry_for_first_field() {
	   Assert.assertEquals(false,status);
	   System.out.println("invalid entery for first field");
	}

	@Given("User is on Login In Page")
	public void user_is_on_login_in_page() {
		WebDriverManager.chromedriver().setup();
		
	   driver=new ChromeDriver();
	   Ip = new SigninPage(driver);
	}

	@When("User clicks Login In button entering extra length of password")
	public void user_clicks_login_in_button_entering_extra_length_of_password() {
		Assert.assertEquals(false,status);
		   System.out.println("entering extra length of password");
	    
	}

	@Then("User should get a message Invalid entry for password field")
	public void user_should_get_a_message_invalid_entry_for_password_field() {
		Assert.assertEquals(false,status);
		   System.out.println("get a message Invalid entry for password field");
	    
	}

	@Given("Dieticion is on Sign In Page")
	public void dieticion_is_on_sign_in_page() {
	    driver.getCurrentUrl();
	}

	@When("User clicks Sign In button entering invalid values for both fields")
	public void user_clicks_sign_in_button_entering_invalid_values_for_both_fields() {
		
	}

	@Then("User should get error message Invalid login credentials")
	public void user_should_get_error_message_invalid_login_credentials() {
		Assert.assertEquals(false,status);
		   System.out.println("Invalid login credentials");
	}

	@Given("User is on same  Page")
	public void user_is_on_same_page() {
	   driver.getCurrentUrl();
	}

	@When("User clicks on Forgot Password button")
	public void user_clicks_on_forgot_password_button() {
	    Ip.clickforgotPassword();
	}

	@Then("User should be directed to  Reset password link")
	public void user_should_be_directed_to_reset_password_link() {
	    Ip.clickrestpassword();
	}


}



