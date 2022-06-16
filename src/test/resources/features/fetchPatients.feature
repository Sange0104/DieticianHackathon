Feature: Fetch patients

  Scenario: Search filters
    Given User will be on my patients
    When User types in anything other than in phone number field
    Then It must throw error message and discontinue search action.

  Scenario: Search Filter
    Given User will be on my Patients
    When User types in anything other valid character in email address field
    Then It must throw error message and discontinue search action.

  Scenario: Search Filters
    Given User will Be on a my Patients
    When User types in anything other alphabets in name field
    Then It must throw error message and discontinue search action.

  Scenario: Display list of patients
    Given User will BE on a My patients
    When User clicks on search button with all fields empty
    Then Displays all patients for that dietician only

  Scenario: Verify column names
    Given User Will be on a my Patients
    When User clicks on search button with or without all fields empty
    Then It shows columns name like Record Number, Cust ID, Name, Details, Last Visit and Actions

  Scenario: Verify Action column has buttons
    Given User will be on My Patients
    When User clicks on search button with or without all Fields empty
    Then It shows action buttons for View Previous Test Report, View Previous Diet Plans, Create New Report or Plan
