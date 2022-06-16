Feature: Sign In Form with Username

  Scenario: Validating Login Process with invalid FirstName
    Given User is on Sign In Page
    When User clicks Sign In button entering numeric values for Username and valid values for password
    Then User should get a message Invalid entry for first field

  Scenario: Sign In process with invalid password
    Given User is on Login In Page
    When User clicks Login In button entering extra length of password
    Then User should get a message Invalid entry for password field

  Scenario: Validating Sign In with both invalid username and password
    Given Dieticion is on Sign In Page
    When User clicks Sign In button entering invalid values for both fields
    Then User should get error message Invalid login credentials

  Scenario: Validating Sign In with Forgot password button
    Given User is on same  Page
    When User clicks on Forgot Password button
    Then User should be directed to  Reset password link
