package StepDefinitions;

import PageFragments.InszTabFragment;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class InszSteps {

    TestContext testContext;
    HomePage homePage;
    InszTabFragment inszTabFragment;

    public InszSteps(TestContext context){

        testContext = context;
        homePage = testContext.getHomePage();

    }
    @And("the user opens the insz tab")
    public void theUserOpensTheInszTab() {

        inszTabFragment = homePage.openInszTab();

    }

    @And("the user fills in the fields needed to generate insz data")
    public void theUserFillsInTheFieldsNeededToGenerateInszData() {

        System.out.println("Implementing INSZ...");

    }

    @When("the user clicks on the generate insz button")
    public void theUserClicksOnTheGenerateInszButton() {

        inszTabFragment.clickGenerateButton();

    }
    @Then("the insz data result is visible")
    public void theInszDataResultIsVisible() {

        Assert.assertTrue(inszTabFragment.isResultDisplayed());

    }

}