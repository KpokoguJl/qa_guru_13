package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class UnicomCarCreditPage {
    SelenideElement pageHeader = $(".my0");

    public UnicomCarCreditPage pageIsOpened (){
        pageHeader.shouldHave(text("Автокредит"));

        return this;
    }
}
