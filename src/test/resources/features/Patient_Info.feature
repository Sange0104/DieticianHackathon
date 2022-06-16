Feature: Patients information

  Scenario: Verify that each patient has Cust ID
    Given User has searched patients
    When Patients RECORDS are displayed
    Then Customer Id is shown in column 'Cust ID' column

  Scenario: Verify that each patient has name
    Given user has searched patients
    When Patients records ARE Displayed
    Then Patient's name is displayed in 'Name' column

  Scenario: Verify detail column
    Given User Has searched patients
    When Patients Records are displayed
    Then Details column shows patient's email or phone number or address

  Scenario: Verify last visit column
    Given User has Searched patients
    When Patients records Are displayed
    Then Last visit date is shown in valid date format

  Scenario: Verify format of email address
    Given User has searched Patients
    When patients records are displayed
    Then Verify that email address is in valid format in details cloumn.

  Scenario: View pateints previous diet plans
    Given PATIENTS records are displayed
    When User clicks on button 'View Previous Diet Plans'
    Then It redirects user to 'Generated Diet Plans' page

  Scenario: Create new diet plan
    Given Patients records are DISPLAYED
    When User clicks on button 'Create New Report or Plan'
    Then It redirects user to 'Confirm Health Conditions and Generate a New Diet plan' page

  Scenario: View patients previous test reports
    Given Patients Records are displayed
    When User clicks on button 'View Previous Test Reports'
    Then It redirects user to 'View Patient Test Reports' page
