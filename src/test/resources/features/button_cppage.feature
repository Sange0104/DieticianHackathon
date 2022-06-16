Feature: Browse button on Create Plan page

  Scenario: Validating the Browse button visibility
    Given User is logged on to Dietician website
    When User lands on "Create Plan" page
    Then User should see a button with name Browse on the page

  Scenario: Validating the Browse button tool tip option
    Given User is logged in Dietician website
    When User will be  on "Create Plan" page
    Then User should see a tool tip "PDF files only" for the Browse button

  Scenario: Validating the Browse button operation
    Given User is on "Create Plan" page
    When User clicks the Browse button and selects a document
    Then User should see the selected document in the field next to the Browse button on the page

  Scenario: Validating the Upload functionality with incorrect file format
    Given User is on "Create Plan" page
    When User clicks the Upload button by selecting a non-PDF file
    Then User should see an error message "Only files with extension .pdf are allowed"

  Scenario: Validating the Upload functionality with incorrect file format and size
    Given User  on Create Plan page
    When User clicks the Upload button by selecting a non-pdf file of size greater than 2MB
    Then User should see an error message Only files with extension .pdf are allowed

  Scenario: Validating the Upload functionality with correct file format and size
    Given User is on "create plan" page
    When User clicks the Upload button by selecting a pdf file of size less than 2MB
    Then User should see a message File uploaded succesfully
