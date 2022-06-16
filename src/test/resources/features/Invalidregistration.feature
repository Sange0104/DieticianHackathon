Feature: Sign up form

  Scenario: Validating the Sign up process with invalid First Name
    Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up form  by entering numeric text for First Name, valid values for the remaining fields
    And User should see a message "Invalid data entered for First Name"
    Then User should see a message "Invalid data entered for Last Name"

  #Scenario: Validating the Sign up process with invalid Last Name
  #Given User is on Register page
  # When User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Last Name, valid values for the remaining fields
  #Then User should see a message "Invalid data entered for Last Name"
  Scenario: Validating the Sign up process with invalid Mobile Number
    Given User is on SignUp page
    When User clicks SIGN UP Button in the Sign Up form  by entering Aphanumeric text for Mobile Number, valid values for the remaining field
    Then User should see a message "Invalid data entered for Mobile Number"

  Scenario: Validating the Sign up process with invalid Any other field
    Given Dieticion is on Register page
    When User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Any other field, valid values for the remaining fields
    Then User should see a message "Invalid data entered for Any other field"

  Scenario: Validating the Sign up process with invalid credentials
    Given User is on Same page
    When User clicks SIGN UP Button in the Sign Up form  by entering invalid email Id for Email,valid values for the remaining fields.
    And User should see a message "Invalid data entered for "Email".
    Then User should see a message "Invalid data entered for Password"

  Scenario: Validating the Sign up process with all valid  input field
    Given User is on valid  page
    When User clicks SIGN UP Button in the Sign Up form  by entering valid values for the all fields
    Then User is re-directed to Sign In page

  Scenario: Validating the Sign up process with invalid Name
    Given User is on SignUp page
    When User clicks SIGN UP Button in the Sign Up withyour Email form  by entering numeric text for First Name, valid values for the remaining fields .
    And User should see a message "Invalid data entered for First Name"
    Then User should see a message "Invalid data entered for Last Name"
    When User should see a message "Invalid data entered for Username"
    And "Invalid data entered for Email Address"
    Then User should see a message "Invaild Password"
 # Scenario: Validating the Sign up process with invalid Password
   # Given User is on Register page
   # When User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid Password valid values for the remaining fields
   # Then User should see a message "Invaild Password"
