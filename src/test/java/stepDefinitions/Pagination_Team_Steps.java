package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;
import pageObjects.PaginationTeamPageObjects;

public class Pagination_Team_Steps {
	WebDriver driver;
	PaginationTeamPageObjects pgteam;
	HomePageObjects homepg;

	@Given("User is on Dietician Website")
	public void user_is_on_dietician_website() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(" ");
	}
	@When("User lands on Teams page")
	public void user_lands_on_teams_page() {
	    pgteam = new PaginationTeamPageObjects(driver);
	    homepg = new HomePageObjects(driver);
	    homepg.clicklnkTeam();
	}

	@Then("User sees Doctor's name on Doctor team page")
	public void user_sees_doctor_s_name_on_doctor_team_page() {
		pgteam.getDoctorName();
	}

	@Given("User is on first page of Team")
	public void user_is_on_first_page_of_team() {
		  homepg.clicklnkTeam();
	}

	@When("User clicks on next button\\(>)")
	public void user_clicks_on_next_button() {
	   pgteam.clickNext();
	}

	@Then("User should be directed to next Doctor on Team Page")
	public void user_should_be_directed_to_next_doctor_on_team_page() {
		pgteam.getDoctorName();
	}

	@Given("User is on Team page")
	public void user_is_on_team_page() {
		homepg.clicklnkTeam();
	}

	@When("User lands on last page of Team")
	public void user_lands_on_last_page_of_team() {
		pgteam.getDoctorName();
	}

	@Then("Next button should be disabled")
	public void next_button_should_be_disabled() {
		pgteam.landedonNext();
	    	
	}

	@When("User lands on first page of Team")
	public void user_lands_on_first_page_of_team() {
		homepg.clicklnkTeam();
		
	}

	@Then("Previous button\\(<)should be disabled")
	public void previous_button_should_be_disabled() {
	   pgteam.landedonPrevious();
	}

	@Given("User is on second page of Team")
	public void user_is_on_second_page_of_team() {
		homepg.clicklnkTeam();
		pgteam.clickNext();
		
	}

	@When("User clicks on previous button\\(<)")
	public void user_clicks_on_previous_button() {
		pgteam.clickPrevious();
	}

	@Then("User should be directed to previous page of Team")
	public void user_should_be_directed_to_previous_page_of_team() {
	   pgteam.getDoctorName();
	}

}
