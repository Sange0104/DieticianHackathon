Feature: Patients test reports

  Scenario: Verify my patient tab on test report page
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then My Patients tab is sElected or highlighted

  Scenario: Verify breadcrumbs on test report page
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then It shows breadcrubs as Dietician Software or View Recent Test Reports

  Scenario: Verify title
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then Title is displayed as 'View Patient Test Reports

  Scenario: Verify users primary info
    Given User clicks ON button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then It displays primary information like patient Id  number, name, email address, Phone number, Address

  Scenario: Display patients test reports
    Given User Clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then It displays patient's old and latest test reports

  Scenario: Verify table heading
    Given User clicks on button VIEW Previous Test Reports
    When User is on 'View Patient Test Reports' page
    Then It shows column heading as Record number, Doc-ID, File Uploaded time, File or Report name, Identified health conditions
