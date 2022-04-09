package ru.rmpts.steps.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.en.And;
import ru.rmpts.steps.serenity.MainSteps;

public class MainStepDefinitions {

    @Steps
    MainSteps mainSteps;

    @Given("user navigates to main page")
    public void userNavigatesToMainPage() {
        mainSteps.open_main_page();
        // System.out.println("user navigates to main page");
    }

    @When("user clicks main menu sandwich button")
    public void userClicksMainMenuSandwichButton() {
        mainSteps.click_menu_sandwich_button();
        // System.out.println("user clicks main menu sandwich button");
    }

    @Then("the user sees the menu blocks")
    public void userSeesTheMenuBlocks() {
        mainSteps.check_the_menu_is_displayed();
    }

    @And("the blocks count is {string}")
    public void checkTheMenuBlocksCount(String number) {
        mainSteps.check_the_menu_blocks_count(number);

    }

    @And("the user selects the menu item with index {string}")
    public void userSelectsTheMenuItem(String itemIndex) {
        mainSteps.user_selects_the_menu_item(itemIndex);

    }

    @Then("the page {string} is opened")
    public void itemPageIsOpened(String item_page) {
        mainSteps.check_the_opened_page_caption(item_page);
    }

}
