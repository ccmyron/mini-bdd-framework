package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageobjects.OffersPage;
import utils.TestContext;

public class OffersPageStepDefinitions {
    private final TestContext testContext;
    private final OffersPage offersPage;
    public String productNameOffersPage;

    public OffersPageStepDefinitions(TestContext testContext) {
        this.testContext = testContext;
        offersPage = testContext.pageObjectManager.getOffersPage();
    }

    @Given("user is on GreenCart Offers page")
    public void user_is_on_green_cart_offers_page() {
        offersPage.navigateToOffersPage(testContext.getUrl() + "offers");
    }

    @Then("tomato should appear in the search results on Offers page")
    public void tomato_should_appear_in_the_search_results_on_offers_page() {
        productNameOffersPage = offersPage.getProductName();
        Assert.assertEquals(productNameOffersPage, "Tomato");
    }


    @And("the name should be identical to the one on the Landing page")
    public void theNameShouldBeIdenticalToTheOneOnTheLandingPage() {
        Assert.assertEquals(testContext.productNameLandingPage, productNameOffersPage);
    }
}
