
Feature: Confirm Health Conditions on Create Plan page
 
  Scenario: Validating option 1 menu visibility
    Given User is logged on to Dietician website
    When User lands on "Confirm conditions and Create Plan" page
   Then User should see option 1 menu to update the health conditions
    
     Scenario: Validating visibility of Confirm button on option 1 menu 
    Given User is logged on to Dietician website
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see a button with text " CONFIRM" in option 1 menu

   Scenario: Validating the option 1 menu interaction
    Given User is logged on to Dietician website
    When User lands on "Confirm conditions and Create Plan" page
    Then User can update the health conditions in option 1 menu
    
    Scenario: Validating that the option 1 menu cannot be modified after confirming
    Given User is on "Create Plan" page
    When User clicks the CONFIRM button in option 1 menu
    Then User cannot update the health conditions in option 1 menu 
    
      Scenario: Validating option 2 menu visibility
    Given User is logged on to Dietician website
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see option 2 menu to update the health conditions
    
    
      Scenario: Validating visibility of Confirm button on option 2 menu 
    Given User is logged on to Dietician website
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see a button with text " CONFIRM" in option 2 menu

     Scenario: Validating the option 2 menu interaction
    Given User is logged on to Dietician website
    When User lands on "Confirm conditions and Create Plan" page
    Then User can update the health conditions in option 2 menu

    Scenario: Validating that the option 2 menu cannot be modified after confirming
    Given User is on "Create Plan" page
    When User clicks the CONFIRM button in option 2
    Then User cannot update the health conditions in option 2 menu 
    
    Scenario: Validating the Generate Menu button visibility
    Given User is logged on to Dietician website
    When User lands on "Confirm conditions and Create Plan" page
    Then User should see a button with text "GENERATE MENU"  at the bottom of the page
    
    Scenario: Validating the Generate Menu button operation
    Given User is on "Create Plan" page
    When User clicks the GENERATE MENU button
    And New Diet plan should be generated with the latest confirmed Health conditions
    Then User should land on "View Recent Diets" page
     
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    