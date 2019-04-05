package uk.co.nature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(id = "login-button")
    private WebElement loginButton = null;

    @FindBy(xpath = "//SPAN[@class='block mt6 mq875-hide small-header-hide'][text()='Search']")
    private WebElement searchButton = null;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLoginPage() {
        if (loginButton.isDisplayed()) {
            loginButton.click();
        } else {
            System.out.println("Button not present");
        }
        return PageFactory.initElements(driver, LoginPage.class);
    }

    public SearchPage goToSearchPage(){
        searchButton.click();
        return PageFactory.initElements(driver, SearchPage.class);
    }
}
