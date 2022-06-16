Feature: Sign In Page Title

  Scenario: Validating the title of Sign In Page
    Given User is on Dietician website
    When User click on icon symbol on Sign In Page
    Then User should see the title of the page as "Sign In"

  Scenario: Validating the Sign In page mandatory fields
    Given User is on Dietician website
    When User is on Sign In Page
    Then User should see all mandatory flields with star symbol on top of those fields

  Scenario: Validating the Sign In form heading
    Given User is on Dietician website
    When User lands on Sign In page
    Then User should see a form with heading "Sign In form", to sign In using Username

  Scenario: Validating the Sign In form heading
    Given User is on Dietician website
    When User lands on Sign In page
    Then User should see a form with heading "Sign In form", to sign In using Username

  Scenario: Validating Sign In button
    Given User is on Dietician website
    When User lands on Sign In page
    Then User should see a button with text "SIGN IN" in the Sign In form

  Scenario: Validating Sign In Process with all fields empty
    Given User is on Sign In Page
    When User clicks Sign In Button in the Sign In form with all fields empty
    Then User should get error message"Please fill out the fields"

  Scenario: Validating Sign In with "Forgot password "button
    Given User is on Sign In Page
    When User clicks on Forgot Password button
    Then User should be directed to  "Reset password"link

  Scenario: Validating Sign In with Not member Yet button
    Given User is on Sign In Page
    When User clicks on "not member yet "button
    Then User will land on Register Page

  Scenario: Validating Sign In with all fields valid entry
    Given User is on Sign In Page
    When User clicks Sign In with all field entered
    Then User logged in successfully

  Scenario: Validating the heading on  "Log in with  your email" form
    Given User is on Dietician website
    When User lands on Sign In page
    Then User should see a form with heading "Log in with  your email" form", to sign In using email

  Scenario: Validating Login button on "Log in with  your email" form
    Given User is on Dietician website
    When User lands on Sign In page
    Then User should see a button with text "Log in" in the Sign In form

  Scenario: Validating Sign In with Email and password empty
    Given User is on Sign In Page
    When User clicks Log In button with all fields empty
    Then User gets  error message " Please fill out fields in textbox"

  Scenario: Validating Sign In with invalid email and valid password
    Given User is on Sign In Page
    When User clicks Log In button with invalid email and valid password
    Then User should see message "Please fill with valid email id"

  Scenario: Validating Sign In with valid email and invalid password
    Given User is on Sign In Page
    When User clicks Log In button with valid email and invalid password
    Then User gets a message "Invalid Password.Pleasetry again"

  Scenario: Validating Sign In with valid email and empty password field
    Given User is on Sign In Page
    When User clicks Log In button with valid email and empty password
    Then User gets a message"Please fill the password"

  Scenario: Validating Sign In with both invalid email and password
    Given User is on Sign In Page
    When User clicks Log In with both invalid email and password
    Then User gets error message message "Invalid Login credentials"

  Scenario: Validating Sign In with both valid email and password
    Given User is on Sign In Page
    When User clicks Log In with both valid email and password
    Then User gets a message"logged in successfully"and sees signout button

  Scenario: Validating Sign In with "Forgot your password"
    Given User is on Sign In Page
    When User clicks on Forgot Password button
    Then User is redirected to reset password link

  Scenario: Validating Sign In with Facebook button
    Given User is on Sign In Page
    When User clicks"Facebook" button to log in
    Then User is redirected to Facebook  login Page

  Scenario: Validating Sign In with Google button
    Given User is on Sign In Page
    When User clicks "Google"button to log in
    Then User is redirected to Google logIn page

  Scenario: Validating Sign In with SignUp button
    Given User is on Sign In Page
    When User clicks sign up link
    Then User is redirected to Register Page
