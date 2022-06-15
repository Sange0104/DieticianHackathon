package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import pageObjects.Generated_Diet_Plan;
import pageObjects.PaginationPO;

public class DietPlanPage {

	WebDriver driver;
	//Generated_Diet_Plan dp;
	PaginationPO po;
	
	@Then("User should see that Diet Plans tab on the menu bar is selected")
	public void user_should_see_that_diet_plans_tab_on_the_menu_bar_is_selected() 
	{
		//dp=new Generated_Diet_Plan(driver);
		//dp.clickonmypatientstab();
		po=new PaginationPO(driver);
	}

	@When("User is on {string} Page")
	public void user_is_on_page1(String string) 
	{
		System.out.println("user is on DietPlanPage");
	}

	@Then("User should see {int} records per page")
	public void user_should_see_records_per_page(Integer int1) 
	{
		System.out.println("User should see {int} records ");
	}

	@Given("User is on {string} Page")
	public void user_is_on_page(String string) 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//dp=new Generated_Diet_Plan(driver);
		po=new PaginationPO(driver);
		driver.getCurrentUrl();	  
		driver.manage().window().maximize();
	}

	@When("More than one page of records are displayed and User is on first page")
	public void more_than_one_page_of_records_are_displayed_and_user_is_on_first_page() 
	{
		po.enterpagination();  
		System.out.println("More than one page of records are displayed");
	}

	@Then("Next Page button is enabled")
	public void next_page_button_is_enabled() 
	{
		po.landedonNext(); 
	    System.out.println("Next Page button is enabled");
	}

	@Given("User is on {string} Page and more than one page of records are displayed and User is on first page")
	public void user_is_on_page_and_more_than_one_page_of_records_are_displayed_and_user_is_on_first_page(String string) 
	{
		driver.getCurrentUrl();
		driver.manage().window().maximize();
		System.out.println(" more than one page of records are displayed and User is on first page");
	}

	@When("User selects the next page button ")
	public void user_selects_the_next_page_button() 
	{
		po.clickNext();
		System.out.println("User selects the next page button");
	}

	@Then("User should see the second page")
	public void user_should_see_the_second_page() 
	{
     po.landedonNext();
     System.out.println("User should see the second page");
	}

	@When("More than one page of records are displayed and User is on last page")
	public void more_than_one_page_of_records_are_displayed_and_user_is_on_last_page() 
	{
      po.clickNext();
      po.lastpage();
      System.out.println("More than one page of records are displayed");
	}

	@Then(" Next Page button will be enabled")
	public void next_page_button_is_disabled() 
	{
		po.landedonNext();	 
	    System.out.println("Next Page button is enabled");
	}
	
   @When("One page of records are displayed")
	public void one_page_of_records_are_displayed() 
   {
    po.firstpage();
    System.out.println("One page of records are displayed");
   }

	@Then("Previous Page button is enabled")
	public void previous_page_button_is_enabled() {
		po.landedonPrevious();
		System.out.println("Previous Page button is enabled");
	}
	
	@Given("User is on {string} Page and more than one page of records are displayed and User is on second page")
	public void user_is_on_page_and_more_than_one_page_of_records_are_displayed_and_user_is_on_second_page(String string) 
	{
    po.enterpagination();
    po.clickNext();
    System.out.println("User is on second page");
	}

	@When("User selects the previous page button")
	public void user_selects_the_previous_page_button() 
	{
     po.clickPrevious();
     System.out.println("User selects the previous page button");
	}

	@Then("User should see the first page")
	public void user_should_see_the_first_page()
	{
    po.firstpage();
    System.out.println("User should see the first page");
	}

	@Then("Previous Page button is disabled")
	public void previous_page_button_is_disabled() 
	{
     po.clickPrevious();
     System.out.println("Previous Page button is disabled");
	}

	@Then("View PDF option is available for the generated diet plans+")
	public void view_pdf_option_is_available_for_the_generated_diet_plans() 
	{
     po.clickonViewPDF();
     System.out.println("View PDF option is available ");
	}

	@When("User selects the View PDF button for a generated diet plan")
	public void user_selects_the_view_pdf_button_for_a_generated_diet_plan() {
     po.clickonViewPDF();
     System.out.println("User selects the View PDF button ");
	}

	@Then("User should see the patient information in the pdf")
	public void user_should_see_the_patient_information_in_the_pdf() 
	{
    po.clickonViewPDF();
    System.out.println("User Views PDF information  ");
    
	}

	@Then("User should be able to see download option for the PDF")
	public void user_should_be_able_to_see_download_option_for_the_pdf() 
	{
      po.DownloadPDF();
      System.out.println("User should be able to see download option for the PDF  ");
    }
}
