package stepDefinitions;


import static org.testng.Assert.assertSame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;

public class HP_Menulinksclick_Steps {
	WebDriver driver;
	HomePageObjects homepg;
	
	@Given("User is on Home page")
	public void user_is_on_home_page() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   //driver.get("https://www.dietician.com");
		   driver.get("");
		   driver.manage().window().maximize();
	}

	@When("User clicks on PRODUCT Link on Home Page")
	public void user_clicks_on_product_link_on_home_page() {
		 homepg = new HomePageObjects(driver);
	   homepg.clicklnkProduct();
	}

	@Then("User is re-directed to  Product Page")
	public void user_is_re_directed_to_product_page() {
	    String actualProductTitle = "Product";
	    String expectedProductTitle = driver.getTitle();
	    assertSame(actualProductTitle, expectedProductTitle);
	}

	@When("User clicks on Client link on Home Page")
	public void user_clicks_on_client_link_on_home_page() {
	   homepg.clicklnkClients();
	}

	@Then("User is re-directed to  Client Testimonial Page")
	public void user_is_re_directed_to_client_testimonial_page() {
	   String expClienttitle = "Client Testimonial Page";
	   String actClienttitle = driver.getTitle();
	  	   
	   try {
		   Assert.assertSame(expClienttitle, actClienttitle);
	   	} catch (Exception e) {
		e.printStackTrace();
		}
	}

	@When("User clicks on Team Link on Home Page")
	public void user_clicks_on_team_link_on_home_page() {
	    homepg.clicklnkTeam();
	}

	@Then("User is directed to Doctor Team page")
	public void user_is_directed_to_doctor_team_page() {
	    String expTeamtitle = "Dietician/Doctor Team";
	    String actTeamTitle = driver.getTitle();
	    try {
			Assert.assertSame(expTeamtitle, actTeamTitle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User clicks on REGISTER Link on Home Page")
	public void user_clicks_on_register_link_on_home_page() {
	    homepg.clicklnkRegister();
	}

	@Then("User is directed to Register page")
	public void user_is_directed_to_register_page() {
		String actRegisterTitle = driver.getTitle();
		String expRegistertitle = "Register";
		if(actRegisterTitle.equalsIgnoreCase(expRegistertitle)) 
			System.out.println(" Register Page Title is displayed");
		else
			System.out.println("Register Title not matched");
		}
		
		
		
	@When("User clicks on About Link on Home page")
	public void user_clicks_on_about_link_on_home_page() {
	   homepg.clicklnkAbout();
	}

	@Then("User is directed to About Page")
	public void user_is_directed_to_about_page() {
		String actAboutTitle = driver.getTitle();
		String expAbouttitle = "About";
		if(actAboutTitle.equalsIgnoreCase(expAbouttitle)) 
			System.out.println(" About page title is displayed");
		else
			System.out.println("About page title not matched");
		}
		
	

	@When("User clicks on Featured link")
	public void user_clicks_on_featured_link() {
	    homepg.clicklnkFeatured();
	}

	@Then("User is directed to Featured content page")
	public void user_is_directed_to_featured_content_page() {
		String actFeatureTitle = driver.getTitle().trim();
		String expFeaturetitle = "Featured Content";
		if(actFeatureTitle.equalsIgnoreCase(expFeaturetitle)) 
			System.out.println(" Featured Content Title is displayed");
		else
			System.out.println("Featured Content Title not matched");
	}

	@When("User clicks on Blogs link")
	public void user_clicks_on_blogs_link() {
	   homepg.clicklnkBlog();
	}

	@Then("User is directed to Blogs Page")
	public void user_is_directed_to_blogs_page() {
		String actBlogTitle = driver.getTitle().trim();
		String expBlogtitle = "Blog";
		if(actBlogTitle.equalsIgnoreCase(expBlogtitle)) 
			System.out.println("Blog page Title is matched");
		else
			System.out.println("Blog page Title not matched");
	}

	@When("User clicks on  Contact us link")
	public void user_clicks_on_contact_us_link() {
	    homepg.clicklnkContactUs();
	}

	@Then("User is directed to Contact us Page")
	public void user_is_directed_to_contact_us_page() {
		String actcontactTitle = driver.getTitle().trim();
		String expcontacttitle = "Contact us";
		if(actcontactTitle.equalsIgnoreCase(expcontacttitle)) 
			System.out.println(" Title matched");
		else
			System.out.println("Title not matched");
	}


}
