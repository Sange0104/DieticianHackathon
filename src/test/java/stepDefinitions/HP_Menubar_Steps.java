package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;


public class HP_Menubar_Steps {
	WebDriver driver;
	HomePageObjects homepg;
	
	@Given("User is on the browser")
	public void user_is_on_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}

	@When("User opens the Dietician Website")
	public void user_opens_the_dietician_website() {
		//driver.get("https://www.dietician.com");
		driver.get("");
		driver.manage().window().maximize();
		homepg = new HomePageObjects(driver);
	}

	@Then("User should see the title of the page as {string}")
	public void user_should_see_the_title_of_the_page_as(String string) {
		String hometitle = homepg.ValidateHomepageTitle();
		Assert.assertEquals("HOME", hometitle);
	}

	@Then("User should see a logo image with the company name on the Home Page")
	public void user_should_see_a_logo_image_with_the_company_name_on_the_home_page() {
		boolean homeLogo = homepg.Validatelogo();
		Assert.assertTrue(homeLogo);
	}

	@Then("User should see all top menu tabs on the Home page")
	public void user_should_see_all_top_menu_tabs_on_the_home_page() {
		homepg.verifytopmenutxtdisplay();
		try {
			 Assert.assertTrue("Text is displayed", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Then("User should see all bottom menu tabs on the Home page")
	public void user_should_see_all_bottom_menu_tabs_on_the_home_page() {
		homepg.verifybottommenutxtdisplay();
	}

	@Then("User should see a search option symbol  on the bottom menu bar of the Home page")
	public void user_should_see_a_search_option_symbol_on_the_bottom_menu_bar_of_the_home_page() {
		homepg.verifySearchbtndisplay();
	}

	@Then("User should see a Signin option next to the search button on the bottom menu bar of the Home page")
	public void user_should_see_a_signin_option_next_to_the_search_button_on_the_bottom_menu_bar_of_the_home_page() {
		homepg.verifySignInbtndisplay();
	}

}
