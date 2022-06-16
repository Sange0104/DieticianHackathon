Feature: Launch Dietitian Home Page

Scenario: Verify Dietitian Home Page After Login
    Given User is on the Dietitian web site
    When User logged in successfully to the Dietitian web site
    Then User can see the Home button on header menu
    
Scenario: Verify New Patient Page After Login
    Given User is on the Dietitian web site
    When User logged in successfully to the Dietitian web site
    Then User can see the "New Patient" tab from the header menu 
    
Scenario: Verify My Patient Page After Login
   Given User is on the Dietitian web site
   When User logged in successfully to the Dietitian web site
   Then User can see the "My Patient" tab from the header menu 
   
Scenario: Verify Diet Plans Page After Login
   Given User is on the Dietitian web site
   When User logged in successfully to the Dietitian web site
   Then User can see the "Diet Plans" tab from the header menu 
   
Scenario: Clicking Dietitian Home Page After Login
   Given User is on the Dietitian Home page
   When User selects New patient button
   Then User lands on New Patient page
   
Scenario: Clicking New Patient Page After Login
   Given User is on the Dietitian Home page  
   When User selects New patient button
   Then User lands on New patient button
   
Scenario: Clicking My Patient Page After Login
   GIven User is on the Dietitian Home page
   When User selects My Patient button
   Then User lands on My Patient page
   
Scenario: Clicking Diet Plans Page After Login
   Given Clicking Diet Plans Page After Login
   When User selects Diet Plans button
   Then User lands on Diet Plans page
   
Scenario: Verify Dietitian Home Page Side Bar After Login
   Given User is on the Dietitian web site
   When User logged in successfully to the Dietitian web site
   Then User can see "Banner or Announcements" section in right side bar
   
Scenario: Dietitian Home Page "Logged in as Dietitian name" message verification After Login
   Given User is on the Dietitian web site
   When User logged in successfully to the Dietitian web site
   Then User can see "Logged in as Dietitian name" message in top of right side bar
       
Scenario: Verify Dietitian Home Page Content After Login
   Given User is on the Dietitian web site
   When User logged in successfully to the Dietitian web site
   Then User can read Dietitian Home page image and content
   
Scenario: Verify Dietitian Home Page SIGN OUT After Login
   Given User is on the Dietitian web site
   When User can see "SIGN OUT" button after successful login
   Then User can click on "SIGN OUT" button for logging off successfully
   
   
   
   
