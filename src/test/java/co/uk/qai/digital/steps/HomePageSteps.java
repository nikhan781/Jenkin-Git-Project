package co.uk.qai.digital.steps;

import co.uk.qai.digital.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Services link$")
    public void iClickOnServicesLink() {
        new HomePage().clickOnServiceLink();
    }

    @Then("^I should navigate to Services page successfully$")
    public void iShouldNavigateToServicesPageSuccessfully() {
        new HomePage().refreshingPage();
    }

    @And("^I verify that 'Enterprise Solutions' link is available$")
    public void iVerifyThatEnterpriseSolutionsLinkIsAvailable() {
        Assert.assertTrue(new HomePage().verifyEnterpriseLinkIsVisible());
    }
}
