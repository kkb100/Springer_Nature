package uk.co.nature.Hooks;

import org.junit.After;
import org.junit.Before;
import uk.co.nature.browserConfig.BrowserFactory;
import uk.co.nature.fileReader.ConfigReader;

import java.io.IOException;

public class ScenarioHooks {

    BrowserFactory browserFactory = new BrowserFactory();


    @Before
    public void setupTest() throws IOException {
        String browserName = ConfigReader.getValue("browser_Type");
        browserFactory = new BrowserFactory();
        browserFactory.initialiseBroswer(browserName);
    }

    @After
    public void closeTest() {
        browserFactory.tearDown();
    }


}
