package uk.co.nature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void validateText(String searchString){
        assert (driver.getPageSource()).contains(searchString);
    }
}
