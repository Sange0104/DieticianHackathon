Feature: List of Screens Menu

  Scenario: Validating the visibility of List of screens link on Home page
    Given User is on the browser
    When User opens the Dietician website
    Then User should see a link with 3 horizontal lines on the top right corner of the Home page

  Scenario: Validating the functionality of List of screens link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a menu with list of clickable links is displayed

  Scenario: Validating the name of List of screens menu
    Given User is on Dietician website
    When User selects the link with  lines on top right corner
    Then User should see name on the list of screens as "Screens"

  Scenario: Validating the Public section on list of screens
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see the links to public pages under the sub menu with text "Public"

  Scenario: Validating the text of User Sign In link
    Given User is on Dietician website
    When User selects the link  on top right corner
    Then User should see a link with text "User Sign In" under the section Public

  Scenario: Validating the functionality of User Sign In link
    Given User is on Home page
    When User selects the link "User Sign in" from the Screens menu
    Then User is re-directed to Sign In page

  Scenario: Validating the text of Register link
    Given User is on Dietician website
    When User selects the link with Three horizontal lines on top  corner
    Then User should see a link with text "Register" under the section Public

  Scenario: Validating the functionality of Register link
    Given User is on Sign In page
    When User selects the link "Register" from the Screens menu
    Then User is re-directed to Register page

  Scenario: Validating the text of Team link
    Given User is on Dietician website
    When User selects the link in corner
    Then User should see a link with text "Team" under the section Public

  Scenario: Validating the functionality of Team link
    Given User is on Register page
    When User selects the link "Team" from the Screens menu
    Then User is re-directed to Team page

  Scenario: Validating the text of Testimonials link
    Given User is on Dietician website
    When User selects the link under thr team
    Then User should see a link with text "Testimonials" under the section Public

  Scenario: Validating the functionality of Testimonials link
    Given User is on Team page
    When User selects the link "Testimonials" from the Screens menu
    Then User is re-directed to Testimonials page

  Scenario: Validating the text of Forgot password link
    Given User is on Dietician website
    When User selects the link in screen menu
    Then User should see a link with text "Forgot Password" under the section Public

  Scenario: Validating the functionality of Forgot password link
    Given User is on Testimonials page
    When User selects the link "Forgot Password" from the Screens menu
    Then User is re-directed to Forgot Password page

  Scenario: Validating the text of Product Features link
    Given User is on Dietician website
    When User selects the link under Forgot Password
    Then User should see a link with text "Product Features" under the section Public
