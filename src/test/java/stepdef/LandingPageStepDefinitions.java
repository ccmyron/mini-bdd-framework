package stepdef;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pageobjects.LandingPage;
import utils.TestContext;

public class LandingPageStepDefinitions {
    private final TestContext testContext;
    LandingPage landingPage;

    public LandingPageStepDefinitions(TestContext testContext) {
        this.testContext = testContext;
        this.landingPage = testContext.pageObjectManager.getLandingPage();
    }

    @Given("user is on GreenCart Landing page")
    public void user_is_on_green_cart_landing_page() {
        landingPage.navigateToLandingPage(testContext.getUrl());
        Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
    }

    @When("user searches for {string}")
    public void user_searches_for(String shortName) throws InterruptedException {
        landingPage.searchItem(shortName);
        Thread.sleep(350);
    }

    @Then("tomato should appear in the search results")
    public void tomato_should_appear_in_the_search_results() {
        testContext.productNameLandingPage = landingPage.getProductName();
        Assert.assertEquals(testContext.productNameLandingPage, "Tomato");
    }
}
