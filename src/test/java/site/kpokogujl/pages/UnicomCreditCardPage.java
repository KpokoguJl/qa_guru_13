package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class UnicomCreditCardPage {
    SelenideElement pageHeader = $(".my0");

    public UnicomCreditCardPage pageIsOpened (){
        pageHeader.shouldHave(text("Кредитные карты"));

        return this;
    }
}
