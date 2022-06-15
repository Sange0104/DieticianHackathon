Feature: Data fields on Contact us Page

Scenario: Validating all fields on Contact us page
	Given User is on Contact Us Page
	When User enters submit button with all fields empty
	Then User should get a message"Please fill all fields above"
	
	Scenario: Validating all valid entries for all fields
	Given User is on Contact Us Page
	When User enters all valid values in fields and click submit button
	Then User should get a message"Your Request is Submitted"
	
	Scenario: Validating the First Name field on Contact Us Page
	Given User is on Contact Us Page
	When User enters first name with some numeric values and other fields with valid values and clicks submit button
	Then User should get a message"Please fill first name with charactersof maximum 10 characters long"
	
	Scenario: Validating the Last Name field on Contact Us Page
	Given User is on Contact Us Page
	When User enters last name with some numeric values and other fields with valid values and clicks submit button
	Then User should get a message"Please fill last name with charactersof maximum 10 characters long"
	
	Scenario: Validating the Email field on Contact Us Page
	Given User is on Contact Us Page
	When User enters Email with some image values and other fields with valid values and click submit button	
	Then User should get a message"Please fill Email field with character,numeric and special character combinations"
	
	Scenario: Validating the Subject field on Contact Us Page
	Given User is on Contact Us Page
	When User enters subject with some numeric values and other fields with valid values and clicks submit button
	Then User should get a message"Please fill Subject field with some chacters of maximum 20 letters length"
	
	Scenario: Validating "Write your Message Here" field on Contact Us Page
	Given User is on Contact Us Page
	When User enters "Write your Message Here" with some numeric values and other fields with valid values and clicks submit button
	Then User should get a message"Please fill "Write your Message here" field with  alphabet characters  of maximum 200 length"