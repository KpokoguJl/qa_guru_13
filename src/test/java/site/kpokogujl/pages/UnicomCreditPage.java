package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class UnicomCreditPage {
    SelenideElement pageHeader = $(".my0");

    public UnicomCreditPage pageIsOpened (){
        pageHeader.shouldHave(text("Потребительские кредиты"));

        return this;
    }
}
