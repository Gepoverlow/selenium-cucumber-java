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

    @And("the user types {string} into the version input and {string} into the amount input kbo fields")
    public void theUserTypesIntoInputs(String version, String amount) {

        kboTabFragment.typeInputs(version, amount);

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
