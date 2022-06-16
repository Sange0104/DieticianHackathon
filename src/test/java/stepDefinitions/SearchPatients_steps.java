package stepDefinitions;

import pageObjects.searchPatients_PO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchPatients_steps {
	
searchPatients_PO program;
@Given("User is on any page after loging in")
public void user_is_on_any_page_after_loging_in() {
   program = new searchPatients_PO();
   program.seenDietician();
}

@When("User clicks on a My Patients tab")
public void user_clicks_on_a_my_patients_tab() {
	program.clickpatients();
}

@Then("Name, email and phone number filter options and search button are displayed")
public void name_email_and_phone_number_filter_options_and_search_button_are_displayed() {
	program.OnMyPatients();
	
  }

@Given("User is logged in")
public void user_is_logged_in() {
	program.seenDietician();
}

@When("User is on my patients")
public void User_is_on_my_patients() {
	program.OnMyPatients();
}

@Then("button used for search has text as Search")
public void button_used_for_search_has_text_as_search() {
	program.clickSearch();
}

@Given("User is on my patient")
public void user_is_on_my_patient() {
	program.OnMyPatients();
}

@When("User starts typing inside name filter box")
public void user_starts_typing_inside_name_filter_box() {
	program.typeName(null);
}

@Then("Text inside name filter box should disappear")
public void text_inside_name_filter_box_should_disappear() {
	program.disapperName();
}

@Given("user is on my patients")
public void user_is_on_my_patients() {
	program.OnMyPatients();
}

@When("User starts typing inside email address filter box")
public void user_starts_typing_inside_email_address_filter_box() {
	program.typeEmail(null);
}

@Then("Text inside email address filter box should disappear")
public void text_inside_email_address_filter_box_should_disappear() {
	program.disapperEmail();
}

@When("User starts typing inside phone number filter box")
public void user_starts_typing_inside_phone_number_filter_box() {
	program.typePhoneNumber(null);
}

@Then("Text inside phone number filter box should disappear")
public void text_inside_phone_number_filter_box_should_disappear() {
	program.disapperPhoneNumber();
}

@Given("User is on my patients Page")
public void user_is_on_my_patients_page() {
	program.OnMyPatients();
}

@When("User clicks on search with <name phrase> into name filter box.")
public void user_clicks_on_search_with_name_phrase_into_name_filter_box() {
	program.typeName(null);
}

@Then("Records for <name phrase> are shown.")
public void records_for_name_phrase_are_shown() {
	program.phraseName();
}

@Given("User is on my patients page")
public void User_is_on_my_patients_page() {
	program.OnMyPatients();
}

@When("User clicks on search with <email phrase> into email address filter.")
public void user_clicks_on_search_with_email_phrase_into_email_address_filter() {
	program.typeEmail(null);
}

@Then("Records for <email phrase> are shown.")
public void records_for_email_phrase_are_shown() {
	program.phraseEmail();
}

@Given("User is on my Patients page")
public void user_is_on_my_Patients_page() {
	program.OnMyPatients();
}

@When("User clicks on search with <phone number> into phone number filter.")
public void user_clicks_on_search_with_phone_number_into_phone_number_filter() {
	program.typePhoneNumber(null);
}

@Then("Records for <phone number> are shown.")
public void records_for_phone_number_are_shown() {
	program.phrasePhoneNumber();
}

@When("User clicks on search button with <name phrase> into name filter box, <phone number> into phone number filter")
public void user_clicks_on_search_button_with_name_phrase_into_name_filter_box_phone_number_into_phone_number_filter() {
	program.typeName(null);
	program.typePhoneNumber(null);
	
}

@Then("Records for <name phrase> and <phone number> are shown.")
public void records_for_name_phrase_and_phone_number_are_shown() {
	program.phraseName();
	program.phrasePhoneNumber();
}

@When("User clicks on search button with <name phrase> into name filter box, <email phrase> into email address filter box")
public void user_clicks_on_search_button_with_name_phrase_into_name_filter_box_email_phrase_into_email_address_filter_box() {
	program.typeName(null);
	program.typeEmail(null);
	
}

@Then("Records for <name phrase> and <email phrase> are shown.")
public void records_for_name_phrase_and_email_phrase_are_shown() {
	program.phraseName();
	program.phraseEmail();
}

@When("User clicks on search button with <phone number> into phone number filter box, <email phrase> into email address filter box")
public void user_clicks_on_search_button_with_phone_number_into_phone_number_filter_box_email_phrase_into_email_address_filter_box() {
	program.typePhoneNumber(null);
	program.typeEmail(null);
}

@Then("Records for <phone number> and <email phrase> are shown.")
public void records_for_phone_number_and_email_phrase_are_shown() {
	program.phrasePhoneNumber();
	program.phraseEmail();
}


	}



