Feature: Menu visibility on Home Page

Scenario: Validating title of the home page
	Given User is on the browser
	When User opens the Dietician Website
	Then User should see the title of the page as "Home"
  
Scenario: Validating the logo on the home page
	Given User is on the browser
	When User opens the Dietician Website
	Then User should see a logo image with the company name on the Home Page  

Scenario: Validating the top tab menus visibility on the Home page
	Given User is on the browser
	When User opens the Dietician Website
	Then User should see all top menu tabs on the Home page

Scenario: Validating the bottom tab menus visibility on the Home page
	Given User is on the browser
	When User opens the Dietician Website
	Then User should see all bottom menu tabs on the Home page

Scenario: Validating the visibility of search option on the menu bar of Home page
	Given User is on the browser
	When User opens the Dietician Website
	Then User should see a search option symbol  on the bottom menu bar of the Home page

Scenario: Validating the visibility of Signin option on the menu bar of Home page
	Given User is on the browser
	When User opens the Dietician Website
	Then User should see a Signin option next to the search button on the bottom menu bar of the Home page