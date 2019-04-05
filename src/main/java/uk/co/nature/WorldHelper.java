package uk.co.nature;

import org.openqa.selenium.support.PageFactory;
import uk.co.nature.browserConfig.BrowserFactory;
import uk.co.nature.pages.BasePage;

public class WorldHelper extends BrowserFactory {

    private BasePage basePage;

    public BasePage getBasePage() {
        if(basePage != null) return basePage;
        return PageFactory.initElements(driver, BasePage.class);
    }

}
