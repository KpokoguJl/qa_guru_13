package site.kpokogujl.tests;

import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.*;

public class MainPageTest extends TestBase{

    @Test
    void goToMfoPageTest() {
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomMfoPage mfoPage = new UnicomMfoPage();

        mainPage.
                openPage()
                .mfoButtonClick();

        mfoPage.pageIsOpened();
    }

    @Test
    void goToCreditCardPageTest() {
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomCreditCardPage creditCardPage = new UnicomCreditCardPage();

        mainPage.
                openPage()
                .creditCardButtonClick();

        creditCardPage.pageIsOpened();
    }

    @Test
    void goToCreditPageTest() {
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomCreditPage creditPage = new UnicomCreditPage();

        mainPage.
                openPage()
                .creditCardButtonClick();

        creditPage.pageIsOpened();
    }

    @Test
    void goToCarCreditPageTest() {
        UnicomMainPage mainPage = new UnicomMainPage();
        UnicomCarCreditPage carCreditPage = new UnicomCarCreditPage();

        mainPage.
                openPage()
                .carCreditButtonClick();

        carCreditPage.pageIsOpened();
    }
}
