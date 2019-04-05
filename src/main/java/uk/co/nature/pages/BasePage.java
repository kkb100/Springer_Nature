package uk.co.nature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.nature.browserConfig.BrowserFactory;
import uk.co.nature.fileReader.ConfigReader;

import java.io.IOException;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage browserSetUp() throws IOException {
        String baseUrl = ConfigReader.getValue("test_base_URL");
        BrowserFactory bf = new BrowserFactory();
        driver = bf.initialiseBroswer(ConfigReader.getValue("browser_Type"));
        driver.navigate().to(baseUrl);
        return PageFactory.initElements(driver, BasePage.class);
        // return this;
    }

    public HomePage goToHomePage() throws IOException {
        this.browserSetUp();
        return PageFactory.initElements(driver, HomePage.class);
    }


}
