package ru.rmpts.steps.cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.And;
import ru.rmpts.steps.serenity.SearchSteps;

public class SearchStepDefinitions {

    @Steps
    SearchSteps searchSteps;

    @When("user clicks search button")
    public void user_clicks_search_button() {
        searchSteps.click_search_button();
    }

    @And("the user types {string} in a search field")
    public void user_types_text_to_serach(String text) {
        searchSteps.type_search_text(text);
    }

    @And("the user presses the search button")
    public void user_clicks_search_form_button() {
        searchSteps.click_search_form_button();

    }

    @Then("the second link follows to history block")
    public void user_check_the_second_link() {
        searchSteps.check_the_result_items();
    }

    @Then("the user should see the message {string}")
    public void user_check_the_message(String message) {
        searchSteps.check_the_text_not_found(message);
    }

    @Then("the user should see the popup {string}")
    public void user_check_the_popup_message(String message) {
       // searchSteps.check_the_text_not_found(message);
    }

}
