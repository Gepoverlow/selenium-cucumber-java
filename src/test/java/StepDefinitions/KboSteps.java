package StepDefinitions;

import PageFragments.KboTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class KboSteps {

    TestContext testContext;
    HomePage homePage;
    KboTabFragment kboTabFragment;

    public KboSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the kbo tab")
    public void theUserOpensTheKboTab() {

        kboTabFragment = homePage.openKboTab();

    }

    @And("the user fills in the fields needed to generate kbo data")
    public void theUserFillsInTheFieldsNeededToGenerateKboData() {

        System.out.println("Implementing KBO...");

    }

    @When("the user clicks on the generate kbo button")
    public void theUserClicksOnTheGenerateKboButton() {

        kboTabFragment.clickGenerateButton();

    }
    @Then("the kbo data result is visible")
    public void theKboDataResultIsVisible() {

        Assert.assertTrue(kboTabFragment.isResultDisplayed());

    }

}
