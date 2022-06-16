Feature: Register Page Title
Background: 

  Scenario: Validating the title of Register Page
    Given User is on Dietician Website
    When User lands on Register Page
    And  User should see the title of the page as Register
    Then User should see all mandatory flields with star symbol on top of those fields

  Scenario: Validating the Register page mandatory fields
    Given User is on Dietician website
    When User lands on Register page
    #Then User should see all mandatory flields with star symbol on top of those fields

  Scenario: Validating the Sign Up form heading
  Given User is on Dietician website
    When User lands on Register page
    Then User should see a form with heading "Sign Up form", to sign up using mobile number

  Scenario: Validating the Sign Up button for the option "Sign up using mobile number" on  Register page
    Given User is on Dietician website
    When User lands on Register page
    Then User should see a button with text "SIGN UP" in the Sign Up form

  Scenario: Validating the Sign up process with all fields being empty
    Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up form with all fields empty
    Then User should see a message "Mandatory fields cannot be empty"

  Scenario: Validating the Sign Up form heading
    Given User is on Dietician website
    When User lands on register page.
    Then User should see a form with heading "Sign Up with your email"to sign up using Email Id

  Scenario: Validating the Sign Up button forthe option "Sign up using EmailId" on  Register page
    Given User is on Dietician website
    When User lands on register page
    Then User should see a button with text "Sign Up" in the Sign Up with your Email form

  Scenario: Validating the Sign up process with all fields being empty
    Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up with your Email form with all fields empty
    Then User should see a message "Mandatory fields cannot be empty"

  Scenario: Validating the Sign up process with invalid Confirm Password
    Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up form with your Email by entering a value that is different than the Password field value valid values for the remaining fields
    Then User should see a message "Confirm Password should same as Password"

  Scenario: Validating the Sign up process with all valid  input field
    Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up with your Email form  by entering valid values forthe all fields
    Then User is re-directed to Sign In page

  Scenario: Sign Up Using Facebook Button

  Scenario: Validating the Sign up process with Facebook
    Given User is on Register page
    When User clicks Facebook Button in the Sign Up with your Email form
    Then User successfully login with Facebook account

  Scenario: Sign Up Using GoogleButton

  Scenario: Validating the Sign up process with Google
    Given User is on Register page
    When User clicks Google Button in the Sign Up withyour Email form
    Then User successfully login with Google account

  Scenario: Log In here link

  Scenario: Validating Log In Here link
    Given User is on Register page
    When User clicks "Log in here" link
    Then User is re-directed to Sign In Page
