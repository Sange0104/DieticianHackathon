Feature: Pagination  

Scenario: Verify pagination
Given USEr clicks on button 'View Previous Test Reports'
When User is on 'View Patient Test Reports' PAGE
Then More than 3 records should be displayed on different pages through pagination

Scenario: Verify next link
Given User clickS ON button 'View Previous Test Reports'
When User is on 'View Patient Test Reports' pAGE
Then Pagination has 'Next' link

Scenario: Verify previous link
Given User CLicks on button 'View Previous Test Reports'
When User is on 'View Patient Test Reports' Page
Then Pagination has 'Previous' link