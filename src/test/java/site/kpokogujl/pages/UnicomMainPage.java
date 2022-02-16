package site.kpokogujl.pages;

import com.codeborne.selenide.SelenideElement;
import site.kpokogujl.tests.TestBase;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UnicomMainPage extends TestBase {
    SelenideElement servicesMenu = $(".link").$(byText("Сервисы")),
            mfoButton = $(".app-icon-clock-24px"),
            creditCardButton = $(".app-icon-credit-card-24px"),
            creditButton = $(".app-icon-percent"),
            carCreditButton = $(".app-icon-key");

    public UnicomMainPage openPage(){
        open("/");

        return this;
    }

    public void mfoButtonClick ()
    {
        mfoButton.click();
    }

    public void creditCardButtonClick ()
    {
        creditCardButton.click();
    }

    public void creditButtonClick ()
    {
        creditButton.click();
    }

    public void carCreditButtonClick ()
    {
        carCreditButton.click();
    }
}
