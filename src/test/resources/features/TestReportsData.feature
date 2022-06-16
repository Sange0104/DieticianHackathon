Feature: Test Report Data

  Scenario: Verify presence of pdf file for each report
    Given User clickS on button 'VieW Previous Test Reports'
    When User is oN 'View Patient Test Reports' page
    Then Every record shows 'view PDF' option

  Scenario: Verify presence of doc id
    Given UseR clicks on button 'View Previous Test Reports'
    When UseR is on 'View Patient Test Reports' page
    Then Every report has Doc Id

  Scenario: Verify presence of uploaded time
    Given User cLicks on button 'View Previous Test Reports'
    When User is On 'View Patient Test Reports' page
    Then Every report shows file upload time

  Scenario: Verify uploaded datetime format
    Given User clicks on buttoN 'View Previous Test Reports'
    When User iS on 'View Patient Test Reports' page
    Then File uploaded time is shown in correct date and time format

  Scenario: Verify age of uploaded time
    Given USER clicks on button 'View Previous Test Reports'
    When USEr is on 'View Patient Test Reports' page
    Then Uploaded time field shows age of file upload in seconds or minutes or hour or days or months or years

  Scenario: Verify file name
    Given User clicks on button View PreviouS Test Reports
    When User is on VieW Patient Test Reports page
    Then Every report has its name

  Scenario: Verify identified conditions
    Given User clicks on button View Previous Test ReportS
    When User IS on 'View Patient Test Reports' page
    Then Every report shows identified conditions from its test report file
