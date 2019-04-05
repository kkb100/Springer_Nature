package uk.co.nature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "login-username")
    private WebElement login_username = null;

    @FindBy(id = "login-password")
    private WebElement login_password = null;

    @FindBy(id = "login-submit")
    private WebElement login_button = null;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void ValidateLoginPage() throws InterruptedException {
        assert (driver.getPageSource()).contains("Login");
    }

}
