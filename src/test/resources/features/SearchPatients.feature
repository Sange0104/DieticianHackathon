Feature: Search Patients

  Scenario: Search feature
    Given User is on any page after loging in
    When User clicks on a My Patients tab
    Then Name, email and phone number filter options and search button are displayed

  Scenario: Verify search button text
    Given User is logged in
    When User is on my patients
    Then button used for search has text as Search

  Scenario: Verify default text in name filter input box goes away
    Given User is on my patients
    When User starts typing inside name filter box
    Then Text inside name filter box should disappear

  Scenario: Verify default text in email input box goes away
    Given user is on my patients
    When User starts typing inside email address filter box
    Then Text inside email address filter box should disappear

  Scenario: Verify default text in phone number input box goes away
    Given User is on my patients
    When User starts typing inside phone number filter box
    Then Text inside phone number filter box should disappear

  Scenario: Search patients by name
    Given User is on my patients Page
    When User clicks on search with <name phrase> into name filter box.
    Then Records for <name phrase> are shown.

  Scenario: Search patients by email
    Given User is on my patients page
    When User clicks on search with <email phrase> into email address filter.
    Then Records for <email phrase> are shown.

  Scenario: Search patients by phone number
    Given User is on my Patients page
    When User clicks on search with <phone number> into phone number filter.
    Then Records for <phone number> are shown.

  Scenario: Search patients by name and phone number
    Given User is on my patients
    When User clicks on search button with <name phrase> into name filter box, <phone number> into phone number filter
    Then Records for <name phrase> and <phone number> are shown.

  Scenario: Search patients by name and email address
    Given User is on my patients
    When User clicks on search button with <name phrase> into name filter box, <email phrase> into email address filter box
    Then Records for <name phrase> and <email phrase> are shown.

  Scenario: Search patients by email address and phone number
    Given User is on my patients
    When User clicks on search button with <phone number> into phone number filter box, <email phrase> into email address filter box
    Then Records for <phone number> and <email phrase> are shown.
