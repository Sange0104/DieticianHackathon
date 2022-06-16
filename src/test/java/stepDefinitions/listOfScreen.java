package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.listOfScreenPO;

public class listOfScreen {
	
	listOfScreenPO program;
	
	WebDriver driver = null;

	@Given("User is on the browser")
	public void user_is_on_the_browser() {
	   program = new listOfScreenPO();
	  
	   driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}

	@When("User opens the Dietician website")
	public void user_opens_the_dietician_website() {
		driver.navigate().to("https://www.Dietician-UI.com/login"); 
	}

	@Then("User should see a link with {int} horizontal lines on the top right corner of the Home page")
	public void user_should_see_a_link_with_horizontal_lines_on_the_top_right_corner_of_the_home_page(Integer int1) {
	   program.displayIcon();
	}

	@Given("User is on Dietician website")
	public void user_is_on_dietician_website() {
	   program.displayHomePg();
	}

	@When("User selects the link with {int} horizontal lines on top right corner")
	public void user_selects_the_link_with_horizontal_lines_on_top_right_corner(Integer int1) {
	    program.seleIcon();
	}

	@Then("User should see a menu with list of clickable links is displayed")
	public void user_should_see_a_menu_with_list_of_clickable_links_is_displayed() {
	    
	}

	@When("User selects the link with  lines on top right corner")
	public void user_selects_the_link_with_lines_on_top_right_corner() {
	  program.seleIcon();
	}

	@Then("User should see name on the list of screens as {string}")
	public void user_should_see_name_on_the_list_of_screens_as(String string) {
	    driver.notify();
	}

	@Then("User should see the links to public pages under the sub menu with text {string}")
	public void user_should_see_the_links_to_public_pages_under_the_sub_menu_with_text(String string) {
	   
	}

	@When("User selects the link  on top right corner")
	public void user_selects_the_link_on_top_right_corner() {
	  program.Clickonoptionstab();
	}

	@Then("User should see a link with text {string} under the section Public")
	public void user_should_see_a_link_with_text_under_the_section_public(String string) {
	  program.Screensvisible();
	}

	@Given("User is on Home page")
	public void user_is_on_home_page() {
	    program.displayHomePg();
	}

	@When("User selects the link {string} from the Screens menu")
	public void user_selects_the_link_from_the_screens_menu(String string) {
	   
	}

	@Then("User is re-directed to Sign In page")
	public void user_is_re_directed_to_sign_in_page() {
	  return;
	 
	  
	}

	@When("User selects the link with Three horizontal lines on top  corner")
	public void user_selects_the_link_with_three_horizontal_lines_on_top_corner() {
		 program.seleIcon();
	}

	@Given("User is on Sign In page")
	public void user_is_on_sign_in_page() {
		 program.clickUsersignin();
	}

	@Then("User is re-directed to Register page")
	public void user_is_re_directed_to_register_page() {
	   return;
	}

	@When("User selects the link in corner")
	public void user_selects_the_link_in_corner() {
		 program.seleIcon();
	}

	@Given("User is on Register page")
	public void user_is_on_register_page() {
		 program.seleRegister();
	}

	@Then("User is re-directed to Team page")
	public void user_is_re_directed_to_team_page() {
	    return;
	}

	@When("User selects the link under thr team")
	public void user_selects_the_link_under_thr_team() {
		 
	}

	@Given("User is on Team page")
	public void user_is_on_team_page() {
		 program.selcTeam();
	}

	@Then("User is re-directed to Testimonials page")
	public void user_is_re_directed_to_testimonials_page() {
	    return;
	}

	@When("User selects the link in screen menu")
	public void user_selects_the_link_in_screen_menu() {
		 program.Screensvisible();
	}

	@Given("User is on Testimonials page")
	public void user_is_on_testimonials_page() {
		 program.clickTestimonals();
	}

	@Then("User is re-directed to Forgot Password page")
	public void user_is_re_directed_to_forgot_password_page() {
	    return;
	}

	@When("User selects the link under Forgot Password")
	public void user_selects_the_link_under_forgot_password() {
		 program.selecForgotPassword();
	}

	@Given("User is on Forgot Password page")
	public void user_is_on_forgot_password_page() {
		program.ForgotPassword();
	}

	@Then("User is re-directed to Product Features page")
	public void user_is_re_directed_to_product_features_page() {
	    return;
	}

	@Given("User is on Product Feature page")
	public void user_is_on_product_feature_page() {
		program.clickProductFeatures();
	}

	@Then("User is re-directed to Contact page")
	public void user_is_re_directed_to_contact_page() {
	 return;
	}

	@Given("User is on Contact page")
	public void user_is_on_contact_page() {
		program.clickContacts();
	}

	@Then("User is re-directed to Blogs page")
	public void user_is_re_directed_to_blogs_page() {
	   return;
	}

	@Given("User is on Blogs page")
	public void user_is_on_blogs_page() {
		program.clickonblogs();
	}

	@Then("User is re-directed to Featured Content page")
	public void user_is_re_directed_to_featured_content_page() {
	    return;
	}

	@Given("User is on Featured Content page")
	public void user_is_on_featured_content_page() {
		program.clickProductFeatures();
	}

	@Then("User is re-directed to Home page")
	public void user_is_re_directed_to_home_page() {
		program.displayHomePg();
	}


	
}
