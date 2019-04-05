package uk.co.nature.StepsDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.nature.WorldHelper;
import uk.co.nature.pages.HomePage;
import uk.co.nature.pages.SearchPage;

public class SearchSteps {

    private WorldHelper worldHelper;
    private HomePage homePage;
    private SearchPage searchPage;

    public SearchSteps(WorldHelper worldHelper) {
        this.worldHelper = worldHelper;
    }

    @Given("^I am on the home page$")
    public void iAmOnTheHomepage() throws Throwable {
        homePage = worldHelper.getBasePage().goToHomePage();
    }

    @When("^I navigate to search page$")
    public void i_navigate_to_search_page() throws Throwable {
        searchPage = homePage.goToSearchPage();
    }

    @Then("^I can see the journal is displayed$")
    public void i_can_see_the_journal_is_displayed() throws Throwable {
        searchPage.validateText("Article search");
    }

}
