package ru.rmpts.steps.serenity;

import net.thucydides.core.annotations.Step;
import ru.rmpts.pages.MainPage;
import org.assertj.core.api.Assertions;

public class MainSteps {

    MainPage mainPage;

    @Step
    public void open_main_page() {
      Assertions.assertThat(mainPage.check_the_main_page_opened()).isTrue();
    }

    @Step
    public void click_menu_sandwich_button() {
        mainPage.click_menu_sandwich_button();
    }

    @Step
    public void check_the_menu_is_displayed() {
        Assertions.assertThat(mainPage.get_menu_content()).isTrue();
    }

    @Step
    public void check_the_menu_blocks_count(String number) {
        int items_count = mainPage.get_menu_blocks_count();
        Assertions.assertThat(items_count).isEqualTo(Integer.parseInt(number));
    }

    @Step
    public void user_selects_the_menu_item(String itemIndex) {
        mainPage.select_menu_item(itemIndex);
    }

    @Step
    public void check_the_opened_page_caption(String item_page){
    String text=mainPage.get_item_page_title();
        Assertions.assertThat(text).isEqualTo(item_page);
    }
}
