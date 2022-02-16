package site.kpokogujl.tests;

import org.junit.jupiter.api.Test;
import site.kpokogujl.pages.UnicomMfoPage;

public class MfoPageTest extends TestBase{
    @Test
    void goToMfoPageTest() {
        UnicomMfoPage mfoPage = new UnicomMfoPage();

        mfoPage
                .openPage()
                .openAdditionalParams();

        mfoPage.filtersIsOpened();
    }
}
