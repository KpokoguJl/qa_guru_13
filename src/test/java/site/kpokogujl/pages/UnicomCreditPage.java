package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UnicomCreditPage {
    SelenideElement pageHeader = $(".my0"),
            filterButton = $(byText("Фильтры")),
            additionalParamTitle = $(".header").$(".title");

    public UnicomCreditPage openPage(){
        open("/private/kredity");

        return this;
    }

    public void openAdditionalParams ()
    {
        filterButton.click();
    }

    public void pageIsOpened (){
        pageHeader.shouldHave(text("Кредитные карты"));
    }

    public void filtersIsOpened (){
        additionalParamTitle.shouldBe(visible).shouldHave(text("Дополнительные параметры"));
    }
}
