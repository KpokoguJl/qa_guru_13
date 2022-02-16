package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UnicomMfoPage {
    SelenideElement pageHeader = $(".my0"),
            reviewsLink = $(".offer-wall-seo-nav__menu").$(byText("Отзывы")).parent(),
            filterButton = $(byText("Фильтры")),
            additionalParamTitle = $(".header").$(".title");

    public UnicomMfoPage openPage(){
        open("/private/mikrozajmy");

        return this;
    }

    public void openAdditionalParams ()
    {
        filterButton.click();
    }

    public UnicomMfoPage pageIsOpened (){
        pageHeader.shouldHave(text("Займы онлайн на карту банка"));

        return this;
    }

    public void filtersIsOpened (){
        additionalParamTitle.shouldBe(visible).shouldHave(text("Дополнительные параметры"));
    }
}
