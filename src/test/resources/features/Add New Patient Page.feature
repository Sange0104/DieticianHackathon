Feature: Add New Patient

Scenario: Add New Patient Details
   Given User is on the Add New Patient Page
   When User wants to enter New Patient details
   Then Patient Data From is visible
   
Scenario: Empty Form submission For Add New Patient Details
   Given User is on the Add New Patient page
   When User attempts to submit the form without filling up mandatory fields
   Then Unable to update and show "Please fillup all the mandatory fields" error message

Scenario: "Full Name" Field Numeric Value Validation
   Given User is on the Add New Patient page
   When User attempts to put numeric value in "Full Name" field 
   Then Unable to enter and show "Only characters are allowed" error message
   
Scenario: "Full Name" Field Space Validation
   Given User is on the Add New Patient page
   When User does not put space in between  First Name and Last Name  for "Full Name" field
   Then Unable to enter and show "First and Last Name should have space in between" error message
   
Scenario: "Full Name" Field Empty Value Validation
   Given User is on the Add New Patient page
   When User attempts to submit the form without filling up "Full Name" field
   Then Unable to enter and show "Please enter Full Name" error message
   
Scenario: "Addess line 1" Field Empty Value Validation
   Given User is on the Add New Patient page
   When User does not enter any value in "Addess line 1" field
   Then Unable to enter and show "Please enter Addess line 1" error message 
   
Scenario: "Country" Field Empty Value Validation
   Given User is on the Add New Patient page
   When User attempts to submit the form without selecting any value for "Country" field
   Then Unable to enter and show "Please select Country from dropdown" error message
   
Scenario: "City" Field Numeric Value Validation
   Given User is on the Add New Patient page
   When User attempts to put numeric value in "City" field
   Then Unable to enter and show "Only characters are allowed" error message
   
Scenario: "City" Field Empty Value Validation
   Given User is on the Add New Patient page
   When User attempts to submit the form without filling up "City" field
   Then Unable to enter and show "Please enter City" error message
   
Scenario: "State, province or region" Field Numeric Value Validation
   Given User is on the Add New Patient page
   When User attempts to put numeric value in "State, province or region" field
   Then Unable to enter and show "Only characters are allowed" error message
   
Scenario: "State, province or region" Field Empty Value Validation
   Given User is on the Add New Patient page
   When User attempts to submit the form without filling up "State, province or region" field
   Then Unable to enter and show "Please enter State, province or region" error message
   
Scenario: "Postal code" Field Empty Value Validation
   Given User is on the Add New Patient page
   When User attempts to submit the form without filling up "Postal code" field
   Then Unable to enter and show "Please enter Postal code" error message
   
Scenario: "Postal code" Field Wrong Data Fomat Validation
   Given User is on the Add New Patient page
   When User entered not supported data format in "Postal code" field
   Then Unable to enter and show "Invalid Postal code format" error message
   
Scenario: "Email" Field Empty Value Validation
   Given User is on the Add New Patient page
   When User does not enter any value in "Email" field
   Then Unable to enter and show "Please enter Email" error message
   
Scenario: "Phone number" Field Character Value Validation
   Given User is on the Add New Patient page
   When User attempts to put characters in "Phone number" field
   Then Unable to enter and show "Only Numeric values are allowed" error message
   
Scenario: "Phone number" Field Empty Value Validation
   Given User is on the Add New Patient page
   When User attempts to submit the form without filling up "Phone number" field
   Then Unable to enter and show "Please enter Phone number" error message
   
Scenario: Inserting Valid New Patient data submission
   Given User is on the Add New Patient page
   When User fills up the form with Valid Data Inputs
   Then User can see "Add New Patient" button
   
Scenario: Valid New Patient data submission
   Given User is on the Add New Patient page
   When User clicks on the "Add New Patient" button after entering valid Patient data
   Then User lands on "My Patients" page with the "New Patient" details displayed
   