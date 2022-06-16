Feature: 

  Scenario: Validating the Dietician section on list of screens
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see the links to Dietician pages under the sub menu with text "Dietican"

  Scenario: Validating the text of View Recent Diets link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "View Recent Diets" under the section Public

  Scenario: Validating the functionality of View Recent Diets link when user is not signed in
    Given User is on Home page
    When User selects the link "View Recent Diets" from the Screens menu before signing in
    Then User is re-directed to Sign In page

  Scenario: Validating the functionality of View Recent Diets link when user is signed in
    Given User is on Home page
    When User selects the link "View Recent Diets" from the Screens menu after signing in
    Then User is re-directed to View Recent Diets page

  Scenario: Validating the text of View Recent Test Reports link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "View Recent Test Reports" under the section Public

  Scenario: Validating the functionality of View Recent Test Reports link when user is not signed in
    Given User is on Home page
    When User selects the link "View Recent Test Reports" from the Screens menu before signing in
    Then User is re-directed to Sign In page

  Scenario: Validating the functionality of View Recent Test Reports link when user is signed in
    Given User is on View Recent Diets page after signning in
    When User selects the link "View Recent Test Reports" from the Screens menu after signing in
    Then User is re-directed to View Recent Test Reports page

  Scenario: Validating the text of Add New Patient link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Add New Patient" under the section Public

  Scenario: Validating the functionality of Add New Patient link when user is not signed in
    Given User is on Home page
    When User selects the link "Add New Patient link" from the Screens menu before signing in
    Then User is re-directed to Sign In page

  Scenario: Validating the functionality of Add New Patient link link when user is signed in
    Given User is on View Recent Test Reports page after signning in
    When User selects the link "Add New Patient link" from the Screens menu after signing in
    Then User is re-directed to Add New Patient page

  Scenario: Validating the text of Dietician Home link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Dietician Home" under the section Public

  Scenario: Validating the functionality of Dietician Home link when user is not signed in
    Given User is on Home page
    When User selects the link "Dietician Home" from the Screens menu before signing in
    Then User is re-directed to Sign In page

  Scenario: Validating the functionality of Dietician Home link link when user is signed in
    Given User is on Add New Patient page after signning in
    When User selects the link "Dietician Home" from the Screens menu after signing in
    Then User is re-directed to Dietician Home page

  Scenario: Validating the text of My Patients link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "My Patients" under the section Public

  Scenario: Validating the functionality of My Patients link when user is not signed in
    Given User is on Home page
    When User selects the link "My Patients" from the Screens menu before signing in
    Then User is re-directed to Sign In page

  Scenario: Validating the functionality of My Patients link when user is signed in
    Given User is on Dietician Home page after signning in
    When User selects the link "My Patients" from the Screens menu after signing in
    Then User is re-directed to My Patients page

  Scenario: Validating the text of Confirm Conditions and Create Plan link
    Given User is on Dietician website
    When User selects the link with 3 horizontal lines on top right corner
    Then User should see a link with text "Confirm Conditions and Create Plan" under the section Public

  Scenario: Validating the functionality of Confirm Conditions and Create Plan link when user is not signed in
    Given User is on Home page
    When User selects the link "Confirm Conditions and Create Plan" from the Screens menu before signing in
    Then User is re-directed to Sign In page

  Scenario: Validating the functionality of Confirm Conditions and Create Plan link when user is signed in
    Given User is on My Patients page after signning in
    When User selects the link "Confirm Conditions and Create Plan" from the Screens menu before signing in
    Then User is re-directed to Confirm Conditions and Create Plan page
