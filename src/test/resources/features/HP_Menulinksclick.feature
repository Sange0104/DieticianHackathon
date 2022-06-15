Feature: Validating the Home page links

Scenario: Validating the Product link on Home Page
	Given User is on Home page
	When User clicks on PRODUCT Link on Home Page
	Then User is re-directed to  Product Page
	
Scenario: Validating the Client link on upper menu bar on Home Page
	Given User is on Home page
	When User clicks on Client link on Home Page
	Then User is re-directed to  Client Testimonial Page
	
Scenario: Validating the TEAM link on Upper Menu Bar  on Home page
	Given User is on Home page
	When User clicks on Team Link on Home Page
	Then User is directed to Doctor Team page
	
Scenario: Validating the REGISTER link on Upper Menu Bar  on Home page
	Given User is on Home page
	When User clicks on REGISTER Link on Home Page
	Then User is directed to Register page
	
Scenario: Validating the About Link on Home Page
	Given User is on Home page
	When User clicks on About Link on Home page
	Then User is directed to About Page
	
Scenario: Validating the Feature Link on Home Page
	Given User is on Home page
	When User clicks on Featured link
	Then User is directed to Featured content page

Scenario: Validating the Blogs link on Home pag
	Given User is on Home page
	When User clicks on Blogs link
	Then User is directed to Blogs Page
	
Scenario: Validating the Contact us link on Home page
	Given User is on Home page
	When User clicks on  Contact us link
	Then User is directed to Contact us Page
	

	