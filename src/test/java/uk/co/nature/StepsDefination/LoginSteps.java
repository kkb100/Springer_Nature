package uk.co.nature.StepsDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.nature.WorldHelper;
import uk.co.nature.pages.HomePage;
import uk.co.nature.pages.LoginPage;

public class LoginSteps {

    private WorldHelper worldHelper;
    private HomePage homePage;
    private LoginPage loginPage;

    public LoginSteps(WorldHelper worldHelper) {
        this.worldHelper = worldHelper;
    }

    public HomePage getHomePage(){
        return homePage;
    }

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() throws Throwable {
        homePage = worldHelper.getBasePage().goToHomePage();
    }

    //@When("^I login with a valid details$")
    @When("^I navigate to login page$")
    public void iLoginWithAValidDetails() throws Throwable {
       loginPage = homePage.goToLoginPage();


    }

    @Then("^I am validate i am in login page$")
    public void iAmLoginSuccessfully() throws Throwable {
        loginPage.ValidateLoginPage();
    }
}
