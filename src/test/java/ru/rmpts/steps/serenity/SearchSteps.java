package ru.rmpts.steps.serenity;

import ru.rmpts.pages.MainPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import java.util.List;
import org.assertj.core.api.Assertions;

public class SearchSteps {
    private static final String HISTORY="История";
    private MainPage mainPage;

    @Step
    public void click_search_button() {
        mainPage.click_search_button();
    }

    @Step
    public void type_search_text(String text) {
        mainPage.type_search_text(text);
    }

    @Step
    public void click_search_form_button() {
        mainPage.click_search_form_button();
    }

    @Step
    public void check_the_result_items() {
        List<WebElementFacade> search_result = mainPage.get_search_result();
        search_result.get(1).click();
        Assertions.assertThat(mainPage.get_item_page_title()).isEqualTo(HISTORY);
    }

    @Step
    public void check_the_text_not_found(String message) {
        Assertions.assertThat(mainPage.get_search_result_message()).isEqualTo(message);
    }

}
